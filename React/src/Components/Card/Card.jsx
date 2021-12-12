import style from "./Card.module.scss";
import CardList from "../../Container/CardList"
import PropTypes from "prop-types";
import { useState } from "react";


const Card = ({text}) => {
  return (
    <div className={style.Card }>
      <h3>{text}</h3>
    </div>
  )
}

export default Card


Card.propTypes = {
  title: PropTypes.string,
  textContent: PropTypes.string,
  
}

// Card.defaultProps = {
//   title: "This is my default title",
//   desc: "This is my default description"
// }



//const [isPink, setPink] = useState(true);

  // const classes = isPink ? [style.Card, style.Card__background_pink] : [style.Card];

  // const handleButtonClick = () => {
  //   console.log(isPink)
  //   setPink(!isPink)
  //   console.log(`card ${id} has been updated`)
  // };
  // return (
  //   <div className={classes.join(" ")}>
  //     <h3>{title}</h3>
  //     <p>{textContent}</p>
  //     <button onClick={handleButtonClick}>Change Background</button>
  //   </div>
  // )