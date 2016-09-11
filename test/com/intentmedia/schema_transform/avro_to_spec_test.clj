(ns com.intentmedia.schema-transform.avro-to-spec-test
    (:require [com.intentmedia.schema-transform.avro-to-spec :refer :all]
      [clojure.test :refer :all]
      [clojure.java.io :as io]
      [cheshire.core :refer [parse-string]]))
