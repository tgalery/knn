(ns knn.similarity
  (:require [knn.op :as op]
            [knn.norm :as norm]))

(defn cosine-similarity
  "Cosine distance between two vectors\n
  Formula: dot(x, y) / (norm(x) * norm(y))"
  [first-vector second-vector]
  (/ (op/dot first-vector second-vector)
     (* (norm/euclidean-norm first-vector) (norm/euclidean-norm second-vector))))
