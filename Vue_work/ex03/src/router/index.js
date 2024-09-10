import { createRouter, createWebHistory } from 'vue-router'
import TheHome from '@/views/TheHome.vue'
import TheSelect from '@/views/TheSelect.vue'
import TheInsert from '@/views/TheInsert.vue'
import TheUpdate from '@/views/TheUpdate.vue'
import TheDelete from '@/views/TheDelete.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: TheHome
    },
    {
      path: '/select',
      name: 'select',
      component: TheSelect
    },
    {
      path: '/insert',
      name: 'insert',
      component: TheInsert
    },    {
      path: '/update',
      name: 'update',
      component: TheUpdate
    },
    {
      path: '/delete',
      name: 'delete',
      component: TheDelete
    }
  ]
})

export default router
