(ns web.app
  (:require
   [web.globals]
   ["antd/lib/layout/layout" :default Layout]
   [web.components.Sider :refer [Sider]]
   [reagent.dom :as d]))

;; Require it so that I can modify theme variables
(js/require "ant.less")

;; If imports work I would probably use this
;; https://3x.ant.design/docs/react/use-in-typescript
;;
(defn main
  []
  [:> Layout {:class "light"}
   [Sider]])

(defn mount! []
  (d/render [main] (.getElementById js/document "app")))

(defn ^:export init!
  []
  (mount!))

