import Header from "../Components/Header/Header.jsx";
import style from "./CardList.module.scss";
import Card from "../Components/Card";


const CardList = ({facts}) => {
  return (
    <div>
      {facts.map(fact => {
        return <Card text={fact.fact} />
      })}
    </div>
  );
};

export default CardList


 // <div className={style.Home}>
    //   {postList.map((post, index) => {
    //     return (
    //       <Card key={index} id={index +1} title={post.title} textContent={post.textContent} 
    //       />

    //     )
    //   })}
    // </div>