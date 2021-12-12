import style from "./App.module.scss";
import Header from "./Components/Header";
import CardList from "./Container/CardList";
import Card from "./Components/Card"
//import post from "./data/catalogue"
import { useState, useEffect } from "react";

const App = () => {
  const BASE_URL= "https://catfact.ninja/facts";
  const [factsList, setfactsList] = useState([]);

  const getFacts = async (limit, maxlength) => {
    const response = await fetch(`${BASE_URL}?limit=${limit}&max_length=${maxlength}`,);

    const data = await response.json();
    setfactsList(data.data);

    
  }
  useEffect(() => {
    getFacts(20, 140);
    console.log(factsList);
  },[]);
  return  (
    <>
      <CardList facts={factsList} />
      

    </>
  )
};


export default App