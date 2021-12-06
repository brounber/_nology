import Card from "../../components/Card"
import style from "./Home.module.scss"

const Home = () => {
  return (
    <>
      <div className={style.Home}>
      <h1>This is my Home</h1>
      </div>
      <article className={style.Home_Article} >
        <Card title="Card 1" desc="This is a card" />
        <Card title="Card 2" desc="This is a card" />
        <Card title="Card 3" desc="This is a card" />
        <Card title="Card 4" desc="This is a card" number={4}/>
        <Card title="Card 5" desc="This is a card" number={5} />
      </article>
    </>

  )
    
};

export default Home;