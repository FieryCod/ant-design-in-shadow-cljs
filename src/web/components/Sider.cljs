(ns web.components.Sider
  (:require
   [web.components.Divider :refer [Divider]]
   [web.components.Search :refer [Search]]
   ["@ant-design/icons" :refer [InboxOutlined]]
   ["antd/lib/layout/Sider" :default AntSider]))

(def SIDER_WIDTH 300)

(defn SiderIcon
  [{:keys [icon text]}]
  [:div.sider-icon-wrappera {}
   [:> icon {:className "sider__icon"}]
   [:span.sider__icon__text {} text]])

(defn Sider
  []
  [:> AntSider {:className "sider"}
   [Search]
   [Divider {}]
   [SiderIcon {:icon InboxOutlined
               :text "sadsads"}]])
