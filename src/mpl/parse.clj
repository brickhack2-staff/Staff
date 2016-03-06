(ns mpl.parse
  "Collection of functions which parse source code."
  (:require [clojure.reflect :refer [typename]]
            [clojure.string :as str]
            [clojure.java.io :as io])
  (:import [mpl.antlr
            MPLLexer MPLParser]
           [org.antlr.v4.runtime
            ANTLRFileStream CommonTokenStream]))

(defn parse-source
  "Parses the source code into a hash-map.

  Inputs:
      source-file: String

  Outputs:
      {:header header,
       :body body}"
  [source-file]

  (let [input  (new ANTLRFileStream   source-file)
        lexer  (new MPLLexer          input)
        tokens (new CommonTokenStream lexer)
        parser (new MPLParser tokens)

        tree   (.goal parser)
        errors (.getNumberOfSyntaxErrors parser)
;        dotgen (new DOTTreeGenerator)
;        dotstr (.toDOT tree)
        ]
    [tree parser errors]))
