(ns mpl.interpreter
  (:require [mpl.util :as util]
            [clojure.java.io :as io]
            [clojure.pprint :refer [pprint]])
  (:import jline.Terminal)
  (:gen-class))


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
  {\+ #(modify-tape % inc)
   \- #(modify-tape % dec)
   \> #(move-tape   % +1)
   \< #(move-tape   % -1)
   \. #(modify-tape % (constantly util/read-char))
   \, (fn [tape]
        (print (-> tape :array :point))
        (flush)
        tape)})

(defn empty-tape
  ([]
   (empty-tape 40))
  ([size]
   {:array  (int-array size),
    :point  0,
    :length size}))

(defn run-cmd
  [cmd tape]
  (-> cmd-map cmd tape))

(defn interpret
  [cmd-list]
  (pprint cmd-list))
