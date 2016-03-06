(ns mpl.parse
  "Collection of functions which parse source code."
  (:require [clojure.string :as str]
            [clojure.java.io :as io]))

(defn split-header-body
  "Splits the header and body in the given source code. The separation is
  defined as the first | character.

  Inputs:
      source-code: String

  Outputs:
      [header body]: [String String]"
  [source-code]
  (str/split source-code #"\|" 2))

(defn parse-field
  "Splits a field into a [key val] vector.

  Inputs:
      field: String

  Outputs:
      [key val]: [String String]"
  [field]
  (let [[key val] (str/split field #":" 2)]
    [(keyword key)
     ; Placeholder, in future parse as, e.g. int, depending on key.
     val]))

(defn parse-header
  "Parses the header into a hash-map of key -> val pairs.

  Inputs:
      header: String

  Outputs:
      {key val, ...}: {Keyword Object, ...}"
  [header]
  (let [fields (str/split header #"\n")]
    (into (hash-map) (map parse-field fields))))




(defn parse-body
  "Parses the body of the source code into some internal representation.

  NOTE: Currently does nothing, returns the body unchanged.

  Inputs:
      body: String

  Outputs:
      body: String"
  [body]
  
  body)


(defn parse-source
  "Parses the source code into a hash-map.

  Inputs:
      source-file: String

  Outputs:
      {:header header,
       :body body}"
  [source-file]
  
  let [input (new ANTLRFileStream source-file)]

  #_(let [[header body] (split-header-body source-code)
        header (parse-header header)
        body (parse-body body)]
    {:header header,
     :body body}))
