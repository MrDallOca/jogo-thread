(set-env!
  :source-paths #{"src"}
  :class-path #{"target\\class"}
  :dependencies    '[ [com.badlogicgames.gdx/gdx "1.9.3"]
                      [com.badlogicgames.gdx/gdx-backend-lwjgl "1.9.3"]
                      [com.badlogicgames.gdx/gdx-box2d "1.9.3"]
                      [com.badlogicgames.gdx/gdx-box2d-platform "1.9.3"
                        :classifier "natives-desktop"]
                      [com.badlogicgames.gdx/gdx-bullet "1.9.3"]
                      [com.badlogicgames.gdx/gdx-bullet-platform "1.9.3"
                        :classifier "natives-desktop"]
                      [com.badlogicgames.gdx/gdx-platform "1.9.3"
                        :classifier "natives-desktop"]
                      [play-clj "1.1.1"]
                      [org.clojure/clojure "1.8.0"]])


(deftask dev
  "Profile setup for development."
  []
  (println "Dev running...")
  (set-env!
    :init-ns 'user
    ; :source-paths (conj (get-env :source-paths) "dev")
    :dependencies (conj (get-env :dependencies) '[org.clojure/tools.namespace "0.2.11"]
                                                '[proto-repl "0.3.1"])
    :source-paths #(into % ["dev"]))
    ; :dependencies #(into % '[[org.clojure/tools.namespace "0.2.11"]
                            ;  [proto-repl "0.3.1"]]))
  (require 'clojure.tools.namespace.repl)
  (eval '(apply clojure.tools.namespace.repl/set-refresh-dirs
          (get-env :directories)))
  identity)
