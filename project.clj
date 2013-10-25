(defproject hello-enfocus "0.1.0-SNAPSHOT"
  :description "The simplest enfocus sample"
  :url "https://github.com/magomimmo/hello-enfocus"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.2.0"
  :source-paths ["src/clj"]
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-1847"]
                 [enfocus "2.1.0-SNAPSHOT"]]
  :plugins [[lein-cljsbuild "0.3.4"]]
  :hooks [leiningen.cljsbuild]

  :cljsbuild {:builds {:whitespace
                       {:source-paths ["src/cljs"]
                        :compiler 
                        {:output-to "resources/public/js/hello.js"
                         :optimizations :whitespace
                         :pretty-print true}}}})
