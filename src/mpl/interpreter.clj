(ns mpl.interpreter
  (:require [mpl.util :as util]
            [clojure.java.io :as io]
            [clojure.pprint :refer [pprint]])
  (:import [org.jfugue Note Pattern])

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

(defn interpret-exprs [node tape player tempo]
  (reduce (fn [tape node]
            (interpret node tape player tempo))
          tape
          (:exprs node)))

(defmulti interpret (fn [node tape player tempo]
                      (:type node)))

(defmethod interpret :root [node tape player tempo]
  (interpret-exprs node tape player tempo))

(defmethod interpret :repeat [node tape player tempo]
  (let [tape (interpret-exprs node tape player tempo)
        {:keys [array point]} tape]
    (if (zero? (aget array point))
      tape
      (recur node tape player tempo))))

(defmethod interpret :note [node tape player tempo]
  (let [;; create note object
        note    (-> node :tone name)
;        note    (new Note note)
        ;; create pattern to play note at tempo
        pattern (doto (new Pattern)
                  (.addElement tempo)
                  (.add note))]
    (.play player pattern)
    ((-> node :tone tone-map cmd-map)
     tape)))
