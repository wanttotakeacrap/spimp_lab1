(ns laba1.core
  (:gen-class))

(defn sum-nested
  [coll]
  (cond
    (nil? coll) 0
    (number? coll) coll
    (coll? coll) (reduce + 0 (map sum-nested coll))
    :else 0))

(defn -main []
  (println "Тeст")
  (println "[1 2 3] -" (sum-nested [1 2 3]))
  (println "[1 [2 3] 4] -" (sum-nested [1 [2 3] 4]))
  (println "[1 [2 [3 4]] 5] -" (sum-nested [1 [2 [3 4]] 5]))
)