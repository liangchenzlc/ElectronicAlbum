<template>
  <div>
    <div class="image-card" @mouseover="overChange" @mouseout="outChange">
      <img :src="url" style="width: 100%; height: 100%; display: block" />
      <div class="mask" v-show="isShow">
        <span class="card-text">开始创作</span>
      </div>
    </div>
    <div class="card-text-item">
      <el-text>相册定制</el-text>
    </div>
  </div>
</template>

<script setup>
import { ref } from "vue";

const url =
    'https://template.canva.cn/EAFMFYuEJNw/1/0/600w-zuQ8jZXbabQ.png'
let isShow = ref(false)
function overChange() {
    isShow.value = true
}
function outChange() {
    isShow.value = false
}
</script>

<style scoped>
  .image-card {
    background-color: #e6e6e6;
    position: relative;
    border-radius: 8px;
    overflow: hidden;
  }
  .mask {
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    background-color: rgba(0, 0, 0, .5);
    .card-text {
      position: absolute;
      top: 50%;
      left: 50%;
      transform: translate(-50%, -50%);
      color: #fff;
      font-size: 16px;
    }
  }
  .card-text-item{
    display: flex;
    align-items: center;
    justify-content: center;
    color: #000;
    font-size: 16px;
    margin-top: 8px;
    font-weight: bold;
  }
</style>