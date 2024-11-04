import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import Person from './components/Person';

function App() {

  const [data,setData] = useState(0);
  const [age,setAge] = useState(1);

    const doClick =() =>{
      alert('Hello React!');
      console.log('Button Clicked!');
      setData(data+1);
      }
      const doClick2 = ()=>{
        setAge(age+1);
      }
      return(
      <div className="App">
        <Person name="홍길동" age={20}></Person>
        <Person name="탁길동" age={30}></Person>
        <Person name="최길동" age={40}></Person>
      <h1>안녕, 리액트</h1>
      <h2>count : {data} </h2>
      <h3>age :{age}</h3>
      <button onClick={doClick}>data누름</button>
      <button onClick={doClick2}>age누름</button>
    </div>
  );
}

export default App;
