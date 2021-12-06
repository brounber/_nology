// Import the functions you need from the SDKs you need
import "firebase/compat/app";

import firebase from "firebase/compat/app";

// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
const firebaseConfig = {
  apiKey: "AIzaSyDD-JlKLV0vHdmopHRlCGtPn5MBd-kKHrc",
  authDomain: "firestore-firstproject.firebaseapp.com",
  projectId: "firestore-firstproject",
  storageBucket: "firestore-firstproject.appspot.com",
  messagingSenderId: "564640607941",
  appId: "1:564640607941:web:d88a6900507dcf03ac0aac"
};

firebase.initializeApp(firebaseConfig);

// Initialize Firebase
const firestore = firebase.firestore();
export default firestore;