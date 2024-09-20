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
        <tr v-for="item in arr" :key="item.idx"  
        class="cursor-pointer hover:bg-slate-50" 
        @click="viewPage(item.idx)">
        <td class="border text-center text-lg p-1">{{ item.idx }}</td>
        <td class="border text-center text-lg p-1">{{ item.title }}</td>
        <td class="border text-center text-lg p-1">{{ item.creAuthor }}</td>
        <td class="border text-center text-lg p-1">{{ item.regDate }}</td>
        <td class="border text-center text-lg p-1">{{ item.viewCount }}</td>
      </tr>
      </tbody>
    </table>
  </div>
  <div class="flex justify-center mt-5">
    <ul class="flex space-x-5">
      <li class="cursor-pointer p-2"
      v-for="num in totalPages" v-bind:key="num" @click="setPageNum(num-1)">
        {{ num }}
      </li>
    </ul>
  </div>
</div>
</template>

<script setup>
import axios from 'axios';
import { ref } from 'vue';
import { useRouter } from 'vue-router';

const router = useRouter();
const arr = ref([]);
const totalPages = ref(10);
const pageNum = ref(0);

const setPageNum = (num)=>{
  pageNum.value = num;
  getFreeBoard(num);
}

const viewPage = (idx)=>{
  const data = {name:'freeboardview',params: {idx}};
  router.push(data);
}

const getFreeBoard = (pageNum)=>{
  if (pageNum == undefined) pageNum = 0;
  axios.get(`http://localhost:8080/freeboard?pageNum=${pageNum}`)
  .then(res=>{
  console.log(res.data);
  arr.value = res.data.list;
  totalPages.value = res.data.totalPages;
})
.catch(e=>{
  console.log(e);
})
}

getFreeBoard();
</script>

<style scoped></style>