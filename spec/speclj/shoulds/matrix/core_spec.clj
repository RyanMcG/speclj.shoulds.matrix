(ns speclj.shoulds.matrix.core-spec
  (:require [clojure.core.matrix :refer [matrix]]
            [speclj.core :refer :all]
            [speclj.shoulds.matrix.core :refer :all]))

(describe "should-matrix=="
  (it "works with a call to matrix"
    (should-matrix== [[1 2] [3 4]]
                     (matrix [[1 2] [3 4]])))
  (it "works without a call to matrix"
    (should-matrix== [[1 2] [3 4]]
                     [[1 2] [3 4]])))
