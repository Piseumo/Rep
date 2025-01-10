const getData = async () =>{
    return new Promise((resolve, reject)=>{
        setTimeout(()=>{
            resolve({
                name:"홍길동",
                age : 20,
                gender : "남자"
            });
        },3000);
    });
};

printData = async ()=>{
await getData();
console.log(res);
}

printData();