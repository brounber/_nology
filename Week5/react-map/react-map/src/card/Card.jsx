import styles from "./Card.module.scss"

const Card = ({title, textContent}) => {
  return (
    <div className={styles.Card}>
      <h3>{title}</h3>
      <p>{textContent}</p>
      
    </div>
  )
}

export default Card;
