<template>
  <div>
    <header>
      <el-row justify="space-between" :align="center">
        <el-col :span="4" >
          <div class="ret-index">
            <el-icon :style="{verticalAlign: middle, marginRight: 5+'px'}">
              <ArrowLeftBold />
            </el-icon>
            <el-text size="large">首页</el-text>
          </div>
        </el-col>
        <el-col :span="20">
          <div class="fun-container">
            <div>
              <el-icon :style="{marginRight: 8+'px'}"  :size="20">
                <Back />
              </el-icon>
              <el-icon :size="20">
                <Right />
              </el-icon>
            </div>
            <ul>
              <li>保存</li>
              <li>导出</li>
              <li>下载</li>
            </ul>
          </div>
        </el-col>
      </el-row>
    </header>
    <el-row>
      <el-col :span="4">
        <aside>
          <ul>
            <li>
              <a>模板库</a>
              <el-icon>
                <ArrowDownBold/>
              </el-icon>
            </li>
            <li>
              <a>
                组件库
              </a>
              <el-icon>
                <ArrowDownBold/>
              </el-icon>
            </li>
          </ul>
        </aside>
      </el-col>
      <el-col :span="20">
        <section :style="{height: documentClientHeight + 'px'}">
          <ul>
            <li>
              <el-input v-model="input" placeholder="宋体" suffix-icon="ArrowDownBold" />
            </li>
            <li>
              <el-input-number v-model="num" :min="1" :max="80" @change="handleChange" :size="small" />
            </li>
            <li>
              <a>A</a>
            </li>
            <li>
              <a style="font-weight: bold">B</a>
            </li>
            <li>
              <a style="font-style: italic">I</a>
            </li>
            <li>
              <a style="text-decoration: underline">
                U
              </a>
            </li>
            <li>
              <a class="end_alpha" style="text-decoration: line-through" >S</a>
            </li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
          </ul>
          <workbench></workbench>
        </section>
      </el-col>
    </el-row>
  </div>
</template>

<script setup>
import {ref, defineComponent} from 'vue'
import workbench from '@/components/workbench.vue'
const documentClientHeight = ref(window.screen.height-80)
const components = defineComponent({
  workbench
})
const num = ref(16)
</script>

<style scoped lang="scss">
header {
  background-color: #f1faff;
  .ret-index {
    display: flex;
    align-items: center;
    width: 100%;
    height: 100%;
    margin-left: 20px;
    font-size: 18px;
  }
  .fun-container {
    display: flex;
    align-items: center;
    justify-content: space-between;
    ul {
      display: flex;
      list-style: none;
      margin-right: 20px;
      li {
        padding: 0 10px;
        font-size: 14px;
      }
    }
  }
}
aside {
  ul {
    list-style: none;
    margin: 0;
    padding: 0;
    padding-top: 15px;
    li {
      padding: 10px;
      font-size: 14px;
      text-align: center;
      padding-left: 0px;
      display: flex;
      justify-content: space-around;
      border-bottom: 1px solid var(--el-border-color);;
      a {
        flex: 1;
      }
    }
  }
}
section {
  position: relative;
  width: 100%;
  height: 100%;
  background-color: #ebecf0;
  ul {
    margin: 0;
    padding: 0;
    list-style: none;
    display: flex;
    padding: 8px 10px;
    background-color: #fff;
    border-left: 1px solid #ebecf0;
    li {
      display: flex;
      align-items: center;

      a {
        padding: 8px 12px;
        font-size: 20px;
      }
      &:nth-child(3) {
        margin-left: 5px;
      }
      .end_alpha {
        border-right: 2px solid #e1e4e7;
      }
    }
  }
}
</style>