const arr1 = [10,3,5];

const sortArr1 = arr1.sort((a,b)=>{
    if( a <b )
        return -1;
    else if(a< b)
        return 1;
    else
    return 0;
});

const sortArr2 = arr1.sort((a,b)=>{
    return a-b;
});

const arr2 = [
    { name : "김길동", age : 15},
    { name : "홍길동", age : 25},
    { name : "탁길동", age : 30},
]

const sortArr3 = arr2.sort( (item1, item2 )=>{
    return item1.age - item2.age;
})

console.log(sortArr1);
console.log(sortArr2);

const arr3 = ["안녕", "나는", "박명회"]

console.log(arr3.join(" "));