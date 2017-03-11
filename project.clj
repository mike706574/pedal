(defproject mike/pedal "0.0.1-SNAPSHOT"
  :description "A example webservice using Pedestal."
  :url "https://github.com/mike706574/pedal"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "same as Clojure"}
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.9.0-alpha14"]
                 [io.pedestal/pedestal.service "0.5.1"]
                 [io.pedestal/pedestal.route "0.5.1"]
                 [io.pedestal/pedestal.jetty "0.5.1"]
                 [org.slf4j/slf4j-simple "1.7.21"]
                 [com.stuartsierra/component "0.3.1"]]
  :uberjar-name "pedal.jar"
  :profiles {:uberjar {:aot :all
                       :main pedal.main}
             :dev {:source-paths ["dev"]
                   :target-path "target/dev"
                   :dependencies [[org.clojure/tools.namespace "0.2.11"]
                                  [clj-http "3.4.1"]]}}
  :repl-options {:init-ns user})
