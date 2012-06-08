(defproject korma-test "1.0.0-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [korma "0.3.0-beta7"]
                 [com.h2database/h2 "1.3.167"]]
  :main korma-test.core
  :plugins [[lein-swank "1.4.4"]])