(defproject jogo-thread "0.0.1-SNAPSHOT"
  :description "FIXME: write description"

  :dependencies [[com.badlogicgames.gdx/gdx "1.9.3"]
                 [com.badlogicgames.gdx/gdx-backend-lwjgl "1.9.3"]
                 [com.badlogicgames.gdx/gdx-box2d "1.9.3"]
                 [com.badlogicgames.gdx/gdx-box2d-platform "1.9.3"
                  :classifier "natives-desktop"]
                 [com.badlogicgames.gdx/gdx-bullet "1.9.3"]
                 [com.badlogicgames.gdx/gdx-bullet-platform "1.9.3"
                  :classifier "natives-desktop"]
                 [com.badlogicgames.gdx/gdx-platform "1.9.3"
                  :classifier "natives-desktop"]
                 [org.clojure/clojure "1.8.0"]
                 [play-clj "1.1.1"]
                 [proto-repl "0.3.1"]]

  :source-paths ["src"]
  :javac-options ["-target" "1.6" "-source" "1.6"]
  ; :aot [jogo-thread.core.desktop-launcher]
  ; :main jogo-thread.core.desktop-launcher

  :profiles
  {
    :dev {:source-paths ["dev" "src"]
           :dependencies [[org.clojure/tools.namespace "0.2.11"]]
           :main nil}
    :uberjar {:aot [jogo-thread.core.desktop-launcher]
              :main jogo-thread.core.desktop-launcher}})
