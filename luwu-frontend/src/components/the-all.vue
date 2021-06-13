<template>
  <a-layout style="min-height: 100vh">
    <a-layout-sider v-model:collapsed="collapsed" :trigger="null" collapsible>
      <div class="logo" />
      <a-menu theme="dark" v-model:selectedKeys="selectedKeys" mode="inline">
        <a-menu-item key="home">
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
          <a-menu-item key="1">任务创建</a-menu-item>
          <a-menu-item key="2">任务实例</a-menu-item>
        </a-sub-menu>
        <a-sub-menu key="user">
          <template #title>
            <span>
              <user-outlined />
              <span>用户管理</span>
            </span>
          </template>
          <a-menu-item key="4">任务权限</a-menu-item>
          <a-menu-item key="5"></a-menu-item>
          <a-menu-item key="6">Alex</a-menu-item>
        </a-sub-menu>
        <a-sub-menu key="datasoure">
          <template #title>
            <span>
              <DatabaseOutlined />
              <span>元数据管理</span>
            </span>
          </template>
          <a-menu-item key="7">
            <router-link to="/about">Kafka</router-link>
          </a-menu-item>
          <a-menu-item key="8">Mysql</a-menu-item>
          <a-menu-item key="9">Redis</a-menu-item>
        </a-sub-menu>
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
  MenuUnfoldOutlined
} from '@ant-design/icons-vue';
import { defineComponent, ref } from 'vue';
export default defineComponent({
  components: {
    DatabaseOutlined,
    HomeOutlined,
    DesktopOutlined,
    UserOutlined,
    MenuUnfoldOutlined,
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
