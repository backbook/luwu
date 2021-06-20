import { createRouter, createWebHistory, RouteRecordRaw } from 'vue-router'
import Home from '../views/Home.vue'
import About from '../views/About.vue'
import TasksDefinition from '../views/task/TaskDefinition.vue'
import KafkaData from '../views/metadata/KafkaMetadata.vue'

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
    path: '/kafka_metadata',
    name: 'KafkaMetadata',
    component: KafkaData
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
