<template>
  <router-view></router-view>
</template>

<script setup>
import home from '@/views/home.vue'
import {defineComponent} from "vue";
const components = defineComponent({
  home
})
</script>

<style scoped>

</style>
