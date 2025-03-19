(defproject org.cyverse/analyze-call-test "0.0.1-SNAPSHOT"
  :description "Minimal test case"
  :dependencies [[org.clojure/clojure "1.12.0"]
                 [org.clojars.slr71/clojure-commons "3.0.11"]]
  :main ^:skip-aot analyze-call-test.core
  :plugins [[com.github.clj-kondo/lein-clj-kondo "2025.02.20"]
            [jonase/eastwood "1.4.3"]])
