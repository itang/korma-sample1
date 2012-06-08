(ns korma-test.core
  (:use [korma.db]
         [korma.core]))

(defdb mydb {:classname "org.h2.Driver"
             :subprotocol "h2"
             :subname "~/cloudform;AUTO_SERVER=TRUE"
             :user     "sa"
             :password ""})

(defentity eform-infos
  (table :E_EFORMINFO))

(defn -main []
  (let [ eforms (select eform-infos)]
    (println eforms)))


