<template>
  <div class="userinfo-box">
    <el-row justify="center" align="center">
      <el-col :span="5">
        <el-avatar :size="50" :src="userAvatarUrl" />
      </el-col>
      <el-col :span="15">
        <div class="username-item">
          <el-text>
            {{username}}
          </el-text>
        </div>
      </el-col>
    </el-row>
  </div>
</template>

<script setup>
import {ref} from "vue";
const userAvatarUrl = ref("https://cube.elemecdn.com/3/7c/3ea6beec64369c2642b92c6726f1epng.png")
const username = ref("coderedma")
</script>

<style scoped>
  .userinfo-box {
    padding: 10px;
    padding-bottom: 13px;
  }
  .username-item {
    display: flex;
    align-items: center;
    width: 100%;
    height: 100%;
    margin-left: 13px;
  }
</style>