(defproject pwa-clojure "0.1.1-SNAPSHOT"
  :description "A simple example of to build a PWA app with clojurescript"

  :source-paths ["src-clj"]

  :main pwa-clojure.main

  :dependencies [[org.clojure/clojure "1.9.0"]
                 [bidi "2.1.4"]
                 [hiccup "1.0.5"]
                 [cheshire "5.8.1"]
                 [ring "1.7.0"]
                 [clj-http "3.9.1"]
                 [com.cemerick/url "0.1.1"]
                 [cider/piggieback "0.3.9"]
                 [refactor-nrepl "2.4.0"]]

  :plugins [[lein-ring "0.8.7"]]

  :clean-targets ^{:protect false} [:target-path :compile-path]

  :ring {:handler pwa-clojure.app/app
         :nrepl {:start? true}}

  :repl-options {:nrepl-middleware [cider.piggieback/wrap-cljs-repl]}) ;; <-- Note
