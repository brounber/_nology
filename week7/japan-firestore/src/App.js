import Card from "./components/Card/";
import { getStudents, updtaeStudent } from "./services/students" ;
import styles from "./App.module.scss";
import { useEffect, useState } from "react";


const App = () => {
  const [students, setStudents] = useState([]);

  const getData = async () => {
    const data = await getStudents();
    setStudents(data);
  }

  const handleChange = async (updateRecord) => {
    const {id, ...record} = updateRecord;
    await updtaeStudent(id, record);
    getData();
  }

  useEffect(() => {
    getData();
  }, [])

    return (
      <div className={styles.App}>
        {students.map((student) => {
          return (
            <Card 
              key={student.id} 
              student={student}
              onChange={handleChange}
            />
          )
        })}
      </div>
    );
};

export default App;
