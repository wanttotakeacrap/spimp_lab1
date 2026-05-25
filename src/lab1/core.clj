(ns lab1.core
  (:gen-class))

(defn sum-list [coll]
  (cond
    (number? coll) coll          
    (coll? coll)                
    (reduce + 0 (map sum-list coll))
    :else 0))   

(defn -main
  [] 
   (print "Тест 1: ")
   (let [result (sum-list '())]
     (if (= result 0)
       (println "good")
       (println "fail (ожидалось 0, получено:" result ")")))
   
   (print "Тест 2: ")
   (let [result (sum-list '(1 2 3))]
     (if (= result 6)
       (println "good (6)")
       (println "fail (ожидалось 6, получено:" result ")")))

   (print "Тест 3: ")
   (let [result (sum-list '(1 (2 3) 4))]
     (if (= result 10)
       (println "good (10)")
       (println "fail (ожидалось 10, получено:" result ")")))
  
  (print "Тест 4: ")
  (let [result (sum-list '(1 (2 (3 (4 5)) 6) 7))]
    (if (= result 28)
      (println "good (28)")
      (println "fail (ожидалось 28, получено:" result ")"))))