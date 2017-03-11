(ns pedal.system
  (:require [com.stuartsierra.component :as component]
            [io.pedestal.http :as http]
            [pedal.component :as pedal-component]
            [pedal.routes :as routes]))

(defn system
  [env]
  (component/system-map
   :service-map
   {:env          env
    ::http/routes routes/routes
    ::http/type   :jetty
    ::http/port   8890
    ::http/join?  false}

   :pedestal
   (component/using
    (pedal-component/new-pedestal)
    [:service-map])))
