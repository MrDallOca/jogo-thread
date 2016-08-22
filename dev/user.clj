(ns user
  (:require [clojure.tools.namespace.repl :as tnr]
            [proto-repl.saved-values]))

(defn start
  []
  (use 'jogo-thread.core.desktop-launcher))

(defn reset []
  (tnr/refresh :after 'user/start))
