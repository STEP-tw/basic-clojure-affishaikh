(ns assignments.lists-test
  (:require [clojure.test :refer :all]
            [assignments.lists :refer :all]))

(deftest lists
  (testing "map"
    (testing "identity with single coll"
      (is (= [1 2 3] (map' identity [1 2 3]))))))

(deftest filter-test
    (testing "even numbers"
      (is (= [2 4 6] (filter' even? [1 2 3 4 5 6])))))

(deftest reduce-test
  (testing "sum of first 6 natural numbers"
    (is (= 21 (reduce' + [1 2 3 4 5 6]))))
  (testing "reverse the list"
    (is (= '(6 5 4 3 2 1) (reduce' conj '() [1 2 3 4 5 6])))))

(deftest count-test
  (testing "length of list"
    (is (= 6 (count' [1 2 3 4 5 6])))))

(deftest reverse-test
  (testing "reverse list"
    (is (= [4 3 2 1] (reverse' [1 2 3 4])))))

(deftest every?'-test
  (testing "should return true"
    (is (true? (every?' even? [2 4 6 8])))))

(deftest some?'-test
  (testing "should return true"
    (is (true? (some?' odd? [2 4 1 6 8])))))

(deftest ascending?'-test
  (testing "should return false"
    (is (false? (ascending? [2 4 1 6 8]))))
  (testing "should return true"
    (is (true? (ascending? [2 4 6 8])))))