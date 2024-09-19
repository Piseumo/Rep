<template>
  <div class="pb-10">
    <h1 class='h1-red'>FreeBoardList</h1>
    <div class="px-5">
    <table class="border-t border-black border-b border-black">
      <thead>
        <tr>
          <th>IDX</th>
          <th>TITLE</th>
          <th>AUTHOR</th>
          <th>REGDATE</th>
          <th>VIEWCOUNT</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="item in arr" :key="item.idx">
        <td class="border text-center">{{ item.idx }}</td>
        <td class="border text-center">{{ item.title }}</td>
        <td class="border text-center">{{ item.creAuthor }}</td>
        <td class="border text-center">{{ item.regDate }}</td>
        <td class="border text-center">{{ item.viewCount }}</td>
      </tr>
      </tbody>
    </table>
  </div>
</div>
</template>

<script setup>
import axios from 'axios';
import { useRoute } from 'vue-router';
import { ref } from 'vue';

const route = useRoute();
const arr = ref([]);

console.log("route.params.aa ="+route.params.aa);
console.log("route.params.bb ="+route.params.bb);

axios.get('http://localhost:8080/freeboard')
.then(res=>{
  console.log(res.data);
  arr.value = res.data;
})
.catch(e=>{
  console.log(e);
})
</script>

<style scoped></style>