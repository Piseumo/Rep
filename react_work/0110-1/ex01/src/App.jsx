import { useState } from 'react'
import './App.css'

function App() {

  const doA = ()=>{
    return [10, ()=>{ console.log("doA")}]
  }

  const [aa,setAA] = useState(10);
  const [bb,bbb] = doA();

  const clickA = ()=>{
    console.log("누른다");
    setAA(aa+1);
  }
  return (
    <>
    <h1>깔끔</h1>
    <h1>{aa}</h1>
    <button onClick={clickA}>누르면 aa값 증가</button>
    </>
  )
}

export default App
