(defproject speclj.shoulds.matrix "0.1.0-SNAPSHOT"
  :description "Custom should(s) for clojure.core.matrix comparisons."
  :url "https://github.com/RyanMcG/speclj.shoulds.matrix"
  :license {:name "The MIT License"
            :url "file://LICENSE.md"
            :distribution :repo
            :comments "Copyright 2013 Ryan McGowan"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :profiles {:dev {:dependencies [[speclj "2.7.4"]]}}
  :plugins [[speclj "2.7.4"]]
  :test-paths ["spec"])
