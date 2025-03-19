(ns analyze-call-test.core
  (:require [clojure-commons.config :as cc]))

(def ^:private props
  "A ref for storing the configuration properties."
  (ref nil))

(def ^:private config-valid
  "A ref for storing a configuraiton validity flag."
  (ref nil))

(def ^:private configs
  "A ref for storing the symbols used to get configuration settings."
  (ref []))

(cc/defprop-str first-config
  "The first configuration setting."
  [props config-valid configs]
  "act.config.first")

(cc/defprop-str second-config
  "The second configuration setting."
  [props config-valid configs]
  "act.config.second")

(defn -main
  [& args]
  (cc/load-config-from-map
   {"act.config.first"  "first"
    "act.config.second" "second"}
   props)
  (when-not (cc/validate-config configs config-valid)
    (throw (Exception. "something bad happened")))

  (println (first-config))
  (println (second-config)))
