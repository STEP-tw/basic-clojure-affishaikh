(ns assignments.conditions-test
  (:require [clojure.test :refer :all]
            [assignments.conditions :refer :all]))

(deftest safe-division
  (testing "non zero denominator"
    (is (= 2 (safe-divide 4 2))))
  (testing "zero denominator"
    (is (nil? (safe-divide 3 0)))))

(deftest informative-division
  (testing "non zero denominator"
    (is (= 2 (informative-divide 4 2))))
  (testing "zero denominator"
    (is (= :infinite (informative-divide 4 0)))))

(deftest harishchandra-test
  (testing "should return true for truthy values"
    (is (true? (harishchandra true))))
  (testing "should return nil for falsy values"
    (is (nil? (harishchandra nil)))))

(deftest repeat-and-truncate-test
  (testing "should truncate 6 elements from repeated coll"
    (is (= '(0 1 2 3 0 1) (repeat-and-truncate (range 4) true true 6)))))