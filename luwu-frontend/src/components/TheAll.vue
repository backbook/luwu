<template>
  <a-layout style="min-height: 100vh">
    <a-layout-sider v-model:collapsed="collapsed" :trigger="null" collapsible>
      <div class="logo" />
      <a-menu theme="dark" v-model:selectedKeys="selectedKeys" mode="inline">
        <a-menu-item key="home">
          <router-link to="/" />
          <HomeOutlined />
          <span>首页</span>
        </a-menu-item>
        <a-sub-menu key="task">
          <template #title>
            <span>
              <DesktopOutlined />
              <span>任务管理</span>
            </span>
          </template>
          <a-menu-item key="1">
            <router-link to="/task_definition">任务定义</router-link>
          </a-menu-item>
          <a-menu-item key="2">任务实例</a-menu-item>
        </a-sub-menu>
          <a-sub-menu key="user">
          <template #title>
            <span>
              <user-outlined />
              <span>用户管理</span>
            </span>
          </template>
          <a-menu-item key="4">用户管理</a-menu-item>
          <a-menu-item key="6">用户任务</a-menu-item>
        </a-sub-menu>
        <a-sub-menu key="datasoure">
          <template #title>
            <span>
              <DatabaseOutlined />
              <span>元数据管理</span>
            </span>
          </template>
          <a-menu-item key="7">
            <router-link to="/Kafka_data">Kafka</router-link>
          </a-menu-item>
          <a-menu-item key="8">Mysql</a-menu-item>
          <a-menu-item key="9">Redis</a-menu-item>
          <a-menu-item key="123">自定义函数</a-menu-item>
        </a-sub-menu>
        <a-menu-item key="about">
          <router-link to="/about" />
          <EnvironmentOutlined /> <span>关于我们</span>
        </a-menu-item>
      </a-menu>
    </a-layout-sider>
    <a-layout>
      <a-layout-header style="background: #fff; padding: 0">
        <MenuUnfoldOutlined v-if="collapsed" class="trigger" @click="() => (collapsed = !collapsed)"/>
        <MenuUnfoldOutlined v-else class="trigger" @click="() => (collapsed = !collapsed)" />
      </a-layout-header>
      <a-layout-content style="margin: 0 16px">
        <router-view/>
      </a-layout-content>
      <a-layout-footer style="text-align: center">
        luwu ©2021 Created by Ant UED
      </a-layout-footer>
    </a-layout>
  </a-layout>
</template>
<script lang="ts">
import {
  DatabaseOutlined,
  HomeOutlined,
  DesktopOutlined,
  UserOutlined,
  MenuUnfoldOutlined,
  EnvironmentOutlined
} from '@ant-design/icons-vue';
import { defineComponent, ref } from 'vue';
export default defineComponent({
  components: {
    DatabaseOutlined,
    HomeOutlined,
    DesktopOutlined,
    UserOutlined,
    MenuUnfoldOutlined,
    EnvironmentOutlined
  },
  data() {
    return {
      collapsed: ref<boolean>(false),
      selectedKeys: ref<string[]>(['1']),
    };
  },
});
</script>
<style>

#components-layout-demo-custom-trigger .trigger {
  font-size: 18px;
  line-height: 64px;
  padding: 0 24px;
  cursor: pointer;
  transition: color 0.3s;
}

#components-layout-demo-custom-trigger .trigger:hover {
  color: #1890ff;
}

#components-layout-demo-custom-trigger .logo {
  height: 32px;
  background: rgba(255, 255, 255, 0.3);
  margin: 16px;
}

.site-layout .site-layout-background {
  background: #fff;
}

#components-layout-demo-side .logo {
  height: 32px;
  margin: 16px;
  background: rgba(255, 255, 255, 0.3);
}

.site-layout .site-layout-background {
  background: #fff;
}
[data-theme='dark'] .site-layout .site-layout-background {
  background: #141414;
}
</style>
