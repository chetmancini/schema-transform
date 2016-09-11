(ns com.intentmedia.schema-transform.avro-to-spec)

(def spec-type-validators
  {"boolean" boolean?
   "int"     int?
   "long"    int?
   "float"   float?
   "double"  float?
   "string"  string?
   "bytes"   string?
   "fixed"   string?
   "null"    nil})


(defn avro-parsed->spec [avro]
      avro)

(defn avro->spec [avro]
      (avro-parsed->spec (parse-string avro true)))
