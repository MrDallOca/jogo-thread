(ns jogo-thread.core.desktop-launcher
  (:require [jogo-thread.core :refer :all])
  (:import [com.badlogic.gdx.backends.lwjgl LwjglApplication]
           [org.lwjgl.input Keyboard])
  (:gen-class))

(defn -main
  []
  (LwjglApplication. jogo-thread-game "jogo-thread" 800 600)
  (Keyboard/enableRepeatEvents true))

(defn hello
  []
  "Hello, there!")
