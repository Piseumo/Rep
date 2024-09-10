<template>
  <div class="p-10">
    <h1 class="text-5xl">HOME</h1>
    <p>ref 반응형 함수를 사용해 볼게요</p>
    <h2>{{ count }}</h2>
    <div class="flex space-x-3">
    <button @click="doPls">증가</button>
    <button @click="doMin">감소</button>
  </div>
  </div>
</template>

<script>
import { ref } from "vue";

export default {
  setup () {
    const count = ref(0);
    const doPls =()=>{
      count.value = count.value + 1;
      console.log("플러스");
    }
    const doMin =()=>{
      count.value = count.value - 1;
      console.log("마이너스");
    }
    return {count,doMin,doPls}
  }
}
</script>

<style lang="scss" scoped>

</style>