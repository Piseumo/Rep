console.log("운동 열심히!");

// 1 false 값
const f1 = undefined;
const f2 = null;
const f3 = 0;
const f4 = -0;
const f5 = NaN;
const f6 = "";

const result = f1 && "result";
console.log( result )

class A {
    a;
    constructor(a){
        this.a = a;
    }
}

// 2 true 값
const t1 = "result";
const t2 = 123;
const t3 = [];
const t4 = {}; // json -> javascript object
const t5 = ()=>{}
const t6 = new A(20);

const result2 = t1 && "resultttttt"
console.log(result)

function printName(test){
    if(test){
        console.log(`${test} 출력된다`);
    }
    else{
        console.log(`${test}  출력안된다`)
    }
}

printName(f5);
printName(t1);

function aa (a){
    console.log(a);
}

aa({ a: 10 , b : 20});

