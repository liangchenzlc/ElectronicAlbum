<template>
  <div>
      <h2>电子相册定制平台</h2>
     <el-row>
       <el-col :span="5">
         <aside>
           <user-info></user-info>
           <nav-list @changeItem="changeActiveItem"></nav-list>
         </aside>
       </el-col>
       <el-col :span="19">
          <section>
            <template v-if="isShow">
              <el-row>
                <el-col :span="6">
                  <card></card>
                </el-col>
              </el-row>
            </template>
            <template v-if="!isShow">
              <cart></cart>
            </template>
          </section>
       </el-col>
     </el-row>

  </div>
</template>

<script setup>
import navList from '@/components/list.vue'
import {ref, defineComponent} from "vue";
import card from '@/components/card.vue'
import userInfo from '@/components/userinfo.vue'
import cart from '@/components/cart.vue'
const components = defineComponent({
  navList,
  card,
  userInfo,
  cart
})
let isShow = ref(true)
const changeActiveItem = (isActive) => {
  if(isActive.isActive){
    isShow.value = true
  }else {
    isShow.value = false
  }
}
</script>

<style scoped>
h2 {
  background-color: #79bbff;
  color: #fff;
  text-align: center;
  margin: 0;
  padding: 30px 0;
}
section {
  padding: 20px 25px 20px 25px;
}
</style>