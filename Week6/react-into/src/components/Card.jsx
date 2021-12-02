import style from "./../components/Card.module.scss"

const Card = () => {
  return (
    <section className={style.Card}>
      <h2 className={style.Card_Title}>My Title</h2>
      <p className={style.Card_Description}>My Description</p>
    </section>
  )
}
export default Card;