import style from "./Card.module.scss";
import Home from "./../../Container/Home"
import PropTypes from "prop-types";


const Card = ({title, desc, number}) => {
  let numberJsx = 
  number !== undefined
  ? <p className={style.Card_Desc}>The number is {number}</p>
  : (<></>);
  return (
    <div>
      <section className={style.Card}>
        <h1 className={style.Card_Title}>{title}</h1>
        <p className={style.Card_Desc}>{desc}</p>
        {numberJsx}
      </section>
    </div>
  )
}

export default Card

Card.propTypes = {
  title: PropTypes.string,
  desc: PropTypes.string,
  number: PropTypes.number,
}

Card.defaultProps = {
  title: "This is my default title",
  desc: "This is my default description"
}
