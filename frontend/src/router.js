
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import Boundedcontext156OrderManager from "./components/listers/Boundedcontext156OrderCards"
import Boundedcontext156OrderDetail from "./components/listers/Boundedcontext156OrderDetail"





export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/boundedcontext156s/orders',
                name: 'Boundedcontext156OrderManager',
                component: Boundedcontext156OrderManager
            },
            {
                path: '/boundedcontext156s/orders/:id',
                name: 'Boundedcontext156OrderDetail',
                component: Boundedcontext156OrderDetail
            },






    ]
})
