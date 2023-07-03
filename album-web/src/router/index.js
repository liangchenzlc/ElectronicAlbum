import {createRouter, createWebHistory } from "vue-router";
const routes = [{
    path: '/',
    redirect: '/index'
}, {
    path: '/login',
    component: () => import('@/views/login.vue')
}, {
    path: '/register',
    component: () => import('@/views/register.vue')
}, {
    path: '/index',
    component: () => import('@/views/home.vue')
}, {
    path: '/create',
    component: () => import('@/views/create.vue')
}
]


const router = createRouter({
    history: createWebHistory(),
    routes
})

export default router