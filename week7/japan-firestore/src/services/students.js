import firestore from "./../firebase";

export const getStudents= async () => {
  const collection = firestore.collection("student");
  const queryData = await collection.get();
  const documents = queryData.docs;

  const data = documents.map((doc) => ({id: doc.id, ...doc.data()}));

  return data;
}

export const updtaeStudent = async (id, record) => {
  const docRef = firestore.collection("students").doc(id);
  await docRef.update(record)
}
