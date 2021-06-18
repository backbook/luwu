import { createRouter, createWebHistory, RouteRecordRaw } from 'vue-router'
import Home from '../views/Home.vue'
import About from '../views/About.vue'
import TasksDefinition from '../views/task/TaskDefinition.vue'
import KafkaData from '../views/metadata/KafkaData.vue'

const routes: Array<RouteRecordRaw> = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/about',
    name: 'About',
    component: About
  },
  {
    path: '/task_definition',
    name: 'TasksDefinition',
    component: TasksDefinition
  },
  {
    path: '/kafka_data',
    name: 'KafkaData',
    component: KafkaData
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
