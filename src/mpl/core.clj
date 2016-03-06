(ns mpl.core
  (:require [mpl.parse :as parse]
            [clojure.pprint :refer [pprint]])
  (:gen-class))

; Placeholder for actual reading of source code from file.
(def source
"a:b
c:d
|a b c d|e f g h|")


(defn -main
  [source-name & args]
  ; Parse the sample source code into internal representation and print.
  (pprint (parse/parse-source source-name)))
