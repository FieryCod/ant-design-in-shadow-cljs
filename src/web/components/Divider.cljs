(ns web.components.Divider
  (:require
   ["antd/lib/divider" :default AntDivider]))

(defn Divider
  [{:keys [size type]}]
  [:> AntDivider {:className (str "divider" " divider--" (or size "regular"))
                  :type (case type
                          :vert "vertical"
                          :hort "horizontal"
                          "horizontal")}])
