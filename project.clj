(defproject hello-enfocus "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.2.0"
  :source-paths ["src/clj"]
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-1913"]
                 [org.clojars.magomimmo/enfocus "2.0.1-SNAPSHOT"]]
  :plugins [[lein-cljsbuild "0.3.3"]]

  :cljsbuild {:builds {:whitespace
                       {:source-paths ["src/cljs"]
                        :compiler 
                        {:output-to "resources/public/js/hello.js"
                         :optimizations :whitespace
                         :pretty-print true}}}})
