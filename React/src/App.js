import style from "./App.module.scss";
import Header from "./Components/Header";
import CardList from "./Container/CardList";
import Card from "./Components/Card"
import post from "./data/catalogue"

const App = () => {
  return  (
    <>
      <CardList postList={post}/>
      

    </>
  )
};


export default App