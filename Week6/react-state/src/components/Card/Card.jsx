// rafce
import styles from "./Card.module.scss";
import PropTypes from "prop-types";

// Catching props from parent container in child component
const Card = ({ title, desc, number }) => {
    // Rendering something only if it is passed to child component
    let numberJsx =
        number !== undefined ? (
            <p className={styles.Card_Desc}>The number is {number}</p>
        ) : (
            <></>
        );

    return (
        <section className={styles.Card}>
            <h2 className={styles.Card_Title}>{title ? title : "No Title"}</h2>
            <p className={styles.Card_Desc}>{desc}</p>
            {numberJsx}
        </section>
    );
};

export default Card;

// How to use Prop Types?
// Why do we use PropTypes?

// Defined the required types for each prop
Card.propTypes = {
    title: PropTypes.string,
    desc: PropTypes.string,
    number: PropTypes.number,
};

// Defining default values for each props
Card.defaultProps = {
    title: "THIS IS MY DEFAULT TITLE",
    desc: "THIS IS MY DEFAULT DESCRIPTION",
};
