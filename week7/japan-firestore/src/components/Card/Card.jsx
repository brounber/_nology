import Counter from "../Counter/Counter";
import { useEffect, useState } from "react";


const Card = ({student}) =>{
  const [brownies, setBrownie] = useState(
    student.browniePoint || 0,
  );

  useEffect(() => {
    onchange({
      ...student,
      browniePoints: brownies

    })
  }, [brownies]);

  const handleDelete = () => {
    
  }
  return (
    <div>
      <h3>{student.name}</h3>
      <p>{student.city}</p>
      <Counter value={brownies} onChange={setBrownie} />

    </div>
  )
}

export default Card;