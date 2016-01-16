(ns publisher.core
  (:require [muon-clojure.client :as cl])
  )

(def m (cl/muon-client "amqp://localhost" "publisher" "tag1"))

(defn build-foo-event [x] 
	{"service-id" "muon://publisher", 
	 "local-id" (java.util.UUID/randomUUID), 
	  "payload" {"foo" x} , 
	  "stream-name" "example"})

(defn post-foo-event [mu x]
  (cl/with-muon mu (cl/request! "request://photon/events" (build-foo-event x))))



