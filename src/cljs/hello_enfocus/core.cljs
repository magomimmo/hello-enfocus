(ns hello-enfocus.core
  (:require [enfocus.core :as ef]
            [enfocus.events :as events]
	    [enfocus.effects :as effects])
  (:require-macros [enfocus.macros :as em]))

(defn start [] 
  (ef/at js/document
    ["body"] (ef/content "Hello, Enfocus!")))  

(set! (.-onload js/window) start)  
