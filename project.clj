(defproject mpl "0.1.0-SNAPSHOT"
  :description "TODO"
  :url "https://github.com/dwysocki/music-programming-language"
  :license {:name "MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure      "1.8.0"]
                 [org.clojure/tools.cli    "0.3.1"]
                 [jfugue                   "4.0.3"]
                 [org.antlr/antlr4         "4.5.2-1"]
                 [org.antlr/antlr4-runtime "4.5.2-1"]]
  :plugins [[lein-antlr4 "0.1.0-SNAPSHOT"]]
  :hooks [leiningen.antlr4]
  :antlr-src-dir "src/antlr"
  :antlr-dest-dir ""
  :java-source-paths ["src/antlr"]
  :main mpl.core)
