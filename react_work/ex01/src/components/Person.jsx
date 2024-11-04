//sfc
import { useState } from "react";

const Person =({name:personName, age:personAge}) => {
    const[name,setName] = useState(personName);
    const[age,setAge] = useState(personAge);

    const doName = ()=>{
        setName(name+"!");
    };
    const doAge = ()=>{
        setAge(age+1)
    };

    return (
      <div>
        <h1>Person</h1>
        <p>This is a Person component</p>
        <h2>이름은= {name}</h2>
        <h2>나이는= {age}</h2>
        <button onClick={doName}>이름증가</button>
        <button onClick={doAge}>나이증가</button>
      </div>  
    );
}
 
export default Person;