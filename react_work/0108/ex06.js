function aa(p1, p2, ...p3){
    console.log(p1);
    console.log(p2);
    console.log(p3);
}

aa(10,20,30,40,50);

console.log(typeof(20));
console.log(typeof 20);
console.log(typeof `문자열`);
console.log(typeof {} );
console.log(typeof []);
console.log(typeof (() =>{}));

aaa = { a:10, b:20, id:`aaa@naver.com`, pw:"abc"}

console.log(aaa);
delete aaa.a
console.log(aaa);
