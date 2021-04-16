(ns web.components.Search
  (:require
   ["antd/lib/input/Search" :default AntSearch]))

(defn Search
  []
  [:> AntSearch {:enterButton true
                 :size "middle"
                 :className "search"}])
