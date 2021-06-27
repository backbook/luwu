<template>
    <a-layout>
    <a-layout-content :style="{background: '#fff', padding: '24px',margin: 0,minHeight: '280px' }">
      <p>
        <a-form layout="inline" :model="param">
          <a-form-item>
            <a-input v-model:value="param.name"  placeholder="名称">
            </a-input>
          </a-form-item>
          <a-form-item>
            <a-button type="primary" @click="handleQuery({page: 1,size: pagination.pageSize})">
              查询
            </a-button>
          </a-form-item>
          <a-form-item>
            <a-button type="primary" @click="add()">
              新增
            </a-button>
          </a-form-item>
        </a-form>
      </p>
      <a-table
          :columns="columns"
          :row-key="record => record.clusterId"
          :data-source="data">

       <template v-slot:action="{ record }">
          <a-space size="small">
            <a-button type="primary" @click="handleEdit(record)">
              编辑
            </a-button>
            <a-popconfirm
                title="删除后不可恢复，确认删除?"
                ok-text="是"
                cancel-text="否"
                @confirm="handleDelete(record.clusterId)">
              <a-button type="danger">
                删除
              </a-button>
            </a-popconfirm>
          </a-space>
        </template>
      </a-table>
    </a-layout-content>
  </a-layout>
</template>
<script lang="ts">
import {defineComponent, onMounted, ref} from 'vue';
import {message} from 'ant-design-vue'
import axios from "axios";


export default defineComponent({
  setup() {

    const columns = [
      {
        title: 'ClusterId',
        dataIndex: 'clusterId',
        key: 'clusterId',
      },
      {
        title: 'ClusterName',
        dataIndex: 'clusterName',
        key: 'ClusterName',
      },
      {
        title: 'BalanceHost',
        dataIndex: 'balanceHost',
        key: 'balanceHost',
      },
      {
        title: 'Host',
        dataIndex: 'host',
        key: 'host',
      },
      {
        title: 'Port',
        key: 'Port',
        dataIndex: 'port',
      },
      {
        title: 'Version',
        key: 'version',
        dataIndex: 'version',
      },
      {
        title: 'Description',
        key: 'Description',
        dataIndex: 'description',
      },
      {
        title: 'Action',
        key: 'action',
        slots: { customRender: 'action' },
      },
    ];

    const param = ref();
    param.value = {}
    const data = ref();

    const handlerQuery = () => {
      axios.get("/mng/metadata/getKafkaInfoList/").then((response) =>{
        if (response.status == 200){
          data.value =  response.data;
        }else {
          message.error("请求超时")
        }

      });
    };

    /**
     * 编辑
     */
    const handleEdit = (record: any) => {
      console.log(record.clusterId)
    };

    /**
     * 删除
     */
    const handleDelete = (clusterId: number) => {
      console.log(clusterId)
    }

    /**
     * 初始化触发
     */
    onMounted(()=>{
      handlerQuery();
    });

    return {
      data,
      columns,
      param,

      handlerQuery,
      handleDelete,
      handleEdit
    };
  },
});
</script>

