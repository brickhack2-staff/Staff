(ns mpl.core
  (:require [mpl.ast :as ast]
            [clojure.java.io :as io])
  (:import jline.Terminal)
  (:gen-class)
  )

(defn interpret
  [cmd-list]
  ()
)

(defn run-cmd
  [cmd, tape]
  (case cmd
    '+' (modify-tape tape (partial + 1))
    '-' (modify-tape tape #(% - 1))
    '>' (move-tape tape 1)
    '<' (move-tape tape -1)
    '.  (modify-tape (constantly (.getCharacter Terminal/getTerminal System/in)))
    ',' (println ((:array tape) :point))
    )
  )

(defn modify-tape
  [tape, f]
  (aset (:array tape) (:point tape) (f (aget (:array tape) (:point type))))
  )

(defn move-tape
  [tape, dx]
  (update tape :point #(mod (+ % dx) (:length tape)))
  )

(defn empty-tape
  []
  {:array (make-array Integer/TYPE 40)
   :point 0
   :length 40
  }
  [size]
  {:array (make-array Integer/TYPE size)
   :point 0
   :length size
  })
