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

(deftest yudishtira-test
  (testing "should return true for truthy values"
    (is (true? (yudishtira true))))
  (testing "should return :ashwathama for falsy values"
    (is (= :ashwathama (yudishtira false)))))

(deftest repeat-and-truncate-test
  (testing "should truncate 6 elements from repeated coll"
    (is (= '(0 1 2 3 0 1) (repeat-and-truncate (range 4) true true 6)))))

(deftest duplicate-first-test
  (testing "should duplicate first element"
    (is (= '(1 1 2 3 4) (duplicate-first '(1 2 3 4)))))
  (testing "should return nil"
    (is (nil? (duplicate-first '())))))

(deftest five-point-someone-test
  (testing "should return :chetan-bhagat"
    (is (= :chetan-bhagat (five-point-someone 4 5))))
  (testing "should return :satan-bhagat"
    (is (= :satan-bhagat (five-point-someone 5 4))))
  (testing "should return :greece"
    (is (= :greece (five-point-someone 3 2)))))

(deftest conditions-apply-test
  (testing "should return :wonder-woman"
    (is (= :wonder-woman (conditions-apply '(1 2 3 4 5)))))
  (testing "should return :durga"
    (is (= :durga (conditions-apply '(:a :e :f :b :g :h :c :d)))))
  (testing "should return :cleopatra"
    (is (= :cleopatra (conditions-apply '([2 3] 4 5 [4 5])))))
  (testing "should return :tuntun"
    (is (= :tuntun (conditions-apply '(1 2 3 4 1 5 3))))))

(deftest zero-aliases-test
  (testing "should return zero"
    (is (= :zero (zero-aliases 0))))
  (testing "should return :empty"
    (is (= :empty (zero-aliases '()))))
  (testing "should return :empty-set"
    (is (= :empty-set (zero-aliases #{}))))
  (testing "should return :empty-map"
    (is (= :empty-map (zero-aliases {})))))