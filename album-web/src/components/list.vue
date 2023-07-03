<template>
  <div>
    <ul>
      <li :class="isActive1">
        <el-icon :size="20">
          <Edit />
        </el-icon>
        <el-text :style="text_style" @click="changeActive">我的草稿</el-text>
      </li>
      <li :class="isActive2">
        <el-icon :size="20">
          <ShoppingCart />
        </el-icon>
        <el-text :style="text_style" @click="changeActive">我的订单</el-text>
      </li>
    </ul>
  </div>
</template>

<script setup >
import { ref, defineEmits } from 'vue'
const text_style = ref({
  marginLeft: '5px',
  fontSize: "14px"
})

let isActive1 = ref({
  active: true
})
let isActive2 = ref({
  active: false
})
const emits = defineEmits(['changeItem'])

const changeActive = () => {
  isActive1.value.active = !isActive1.value.active
  isActive2.value.active = !isActive2.value.active

  emits('changeItem', {isActive: isActive1.value.active})
}
</script>

<style scoped="sass">
  ul {
    padding: 0;
    width: 100%;
  }
  li {
    display: flex;
    padding: 13px 12px;
    justify-content: start;
    align-items: center;
    padding-left: 25px;
    padding-right: 0px;
    cursor: default;
  }
  .active {
    background-color: #DCDFE6;
    border-radius: 5px;
  }
</style>