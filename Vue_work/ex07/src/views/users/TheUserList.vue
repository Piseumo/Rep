<template>
  <div class="overlay" :class="{isModal: isModal}"></div>
  <div class="modal" :class="{isView: isModal}">
    <div class="cursor-pointer bg-slate-500 p-5 m-5 w-80 text-white rounded" >
        <h1>idx = </h1>
        <h1>name = </h1>
        <h1>email = </h1>
        <h1>가입날짜 = </h1>
        <h1>작성한글 = </h1>
      </div>
    <button @click="modalUser">저장</button>
  </div>
  <div class="pb-10">
    <h1 class="h1-blue">UserList</h1>
    <div style="" class="flex flex-wrap">
    <!-- <div style="display: flex;flex-wrap: wrap;" class=""> -->
      <div 
          @click="modalUser(item)"
          class="
          cursor-pointer
        bg-slate-500 
          p-5 
          m-5
          w-80
          text-white
          rounded" 
          v-for="item in arr" :key="item.idx">
        <h1>idx = {{ item.idx }}</h1>
        <h1>name = {{ item.name }}</h1>
        <h1>email = {{ item.email }}</h1>
        <h1>가입날짜 = {{ item.wdate }}</h1>
        <h1>작성한글 = {{ item.list.length }}</h1>
      </div>
    </div>
  </div>
</template>
<script setup>
import { getUsers } from '@/api/userApi.js';
import { ref, watchEffect } from 'vue';

const arr = ref([]);

const idx = ref();
const name = ref();
const wdate = ref();
const email = ref();

const isModal = ref(false);
const modalUser = (item) => {
  isModal.value = !isModal.value;
  idx.value = item.idx;
  name.value = item.name;
  wdate.value = item.wdate
  email.value = item.value;
  
};

watchEffect( async() => {
  const retValue = await getUsers();
  // console.log("retValue = "+JSON.stringify(retValue.data));
  arr.value = retValue.data;
  // console.log(arr.value);
});
</script>
<style scoped>
.h1-blue {
  font-size: 5rem;
  color: blue;
}
.overlay{
  position: fixed; top:0; left:0; width: 100%; height: 100%; z-index: 1000; background-color: rgb(0,0,0,0.3);
  display: none;
}
.isModal{
  display: block;
}
.modal{
  position: fixed;
  top: 50%;
  left: 50%;
  height: 200px;
  transform: translate(-50%,-50%);
  background-color: white;
  z-index: 1001;
  display: none;
}
.isView{
  display: block;
}

</style>
