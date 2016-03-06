(ns mpl.util
  "Miscellaneous utility functions.")


(defn camel->lisp
  "Converts CamelCase to lisp-case."
  [s]
  (-> s
      (clojure.string/replace #"([a-z])([A-Z])" "$1-$2")
      clojure.string/lower-case))
