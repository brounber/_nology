import style from "./card.module.scss"
import PropTypes from "prop-types";


const Card = ({title="Title", desc, number}) => {
  let numbreJsx = number !== undefined ? (<p className={style.Card_Decs}>This number is {number} </p>) : (<></>);
  return (
    <section className={style.Card}>
      <h2 className={style.Card_Title}>{title}</h2>
      <p className={style.Card_Desc}>{desc}</p>
      {numbreJsx}
    </section>
  )
}

export default Card

Card.propTypes = {
  title: PropTypes.string,
  desc: PropTypes.string,
  number: PropTypes.number,
}

Card.defaultProps = {
  title: "This iy my Default Title",
  desc: "This is my defaul description", 
};
