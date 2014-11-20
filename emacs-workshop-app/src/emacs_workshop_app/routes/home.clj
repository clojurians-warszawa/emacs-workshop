(ns emacs-workshop-app.routes.home
    (:use emacs-workshop-app.server-helpers
          net.cgrand.moustache))

(def routes
  (app
   ["version"] {:get (constantly (json-response (read-version)))}))


