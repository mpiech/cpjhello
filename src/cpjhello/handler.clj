(ns cpjhello.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [clojure.tools.nrepl.server :as nrepl]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defroutes app-routes
  (GET "/" [] "Hello World")
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))

(defonce server (nrepl/start-server :port 7888))

