(ns mpl.interpreter
  (:require [mpl.util :as util]
            [clojure.java.io :as io]
            [clojure.pprint :refer [pprint]])
  (:import jline.Terminal)
  (:gen-class))

(declare interpret)

(defn modify-tape
  [tape f]
  (let [{:keys [array point]} tape
        old-val (aget array point)
        new-val (f old-val)]
    (aset array point new-val)
    tape))


(defn move-tape
  [tape dx]
  (update tape :point
          #(mod (+ % dx) (:length tape))))

(def cmd-map
  {:inc   #(modify-tape % inc)
   :dec   #(modify-tape % dec)
   :right #(move-tape   % +1)
   :left  #(move-tape   % -1)
   :comma #(modify-tape % (fn [& _] (util/read-char)))
   :dot   (fn [tape]
            (print (char (aget (:array tape)
                               (:point tape))))
            (flush)
            tape)})
   :noop  identity

(def tone-map
    {
     :A :comma
     :B :noop
     :C :dot
     :D :right
     :E :dec
     :F :left
     :G :inc
     })


(defn empty-tape
  ([]
   (empty-tape 40))
  ([size]
   {:array  (int-array size),
    :point  0,
    :length size}))

(defn interpret-exprs [node tape]
  (reduce (fn [tape node]
            (interpret node tape))
          tape
          (:exprs node)))

(defmulti interpret (fn [node tape]
                      (:type node)))

(defmethod interpret :root [node tape]
  (interpret-exprs node tape))

(defmethod interpret :repeat [node tape]
  (let [tape (interpret-exprs node tape)
        {:keys [array point]} tape]
    (if (zero? (aget array point))
      tape
      (recur node tape))))

(defmethod interpret :note [node tape]
  ((-> node :tone tone-map cmd-map)
   tape))
