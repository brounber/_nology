// /* creating an objects 
// syntax
// [const] [objectNmae] = {
//   keyName1: value1,
//   keyName2: value2,
// }
// */

// const coach = {
//   firstName: "Remi",
//   lastName: "HOEPPE",
//   height: 191,
//   age: 32,
// }

// console.log(coach);

// const student = {
//   firstName:"Nick",
//   lastName: "Cage",
//   age: undefined,
//   browniePoint: 1000,

//   howManyPoint () {
//     console.log(this.browniePoint);
//   },

//   addPoint(point) {
//     this.browniePoint += point;
//   },

//   checkName () {
//     console.log(`${student.firstName} ${student.lastName}`);
//   },

// }

// console.log(student);
// student.howManyPoint();
// student.addPoint(250);
// student.howManyPoint();
// console.log(student);
// student.checkName();


// const coach1 = {
//   firstName: "Remi",
//   lastName: "HOEPPE",
//   height: 191,
//   age: 32,

//   fullName() {
//     return `${this.firstName} ${this.lastName}`
//   }
// };

// function Coach(firstName, LastName, age, height) {
//   this.firstName = firstName;
//   this.LastName = LastName;
//   this.age = age;
//   this.height = height;
// }

// const newCoach = new Coach ( 'Callum', 'Hill', 24, 175)
// console.log(newCoach);

// class Student {
//   constructor(firstName, lastName, age) {
//     this.firstName = firstName;
//     this.lastName = lastName;
//     this.age = age;
//   }

//   setAge (updatedAge) {
//     this.age=updatedAge;
//   }

//   getAge() {
//     console.log(this.age);
//   }
// }

// const robert = new Student("Robert", "F", 25);

// console.log(robert);
// robert.getAge();
// robert.setAge(29);
// robert.getAge();


// const kenny = new Student("Kenny");
// console.log(kenny);


// console.log(Student)
// console.log(Coach)


// console.log(robert);
// console.log(robert.firstName);


// // different ways to access data
// let string = new String("Something");
// console.log(string.length)
// console.log(robert.age) 
// console.log(robert["age"]) 

// // how to check if a property exist on an objects?
// const checkIfHasFirstName = (object) => {
//   return object.hasOwnProperty("firstName");
// }

// console.log(checkIfHasFirstName(robert));

// //how to we modify objects?
// console.log("before changing values inside othe objects:", robert);
// robert.firstName="rob";
// console.log("After changing values inside othe objects:", robert);
// robert.favClub = "Man. United";
// console.log("After changing values inside othe objects:", robert);
// const raf = new Student("Raf");
// console.log(raf);


// // how do we rename a key inside on object?
// // What is Objects Destructuring?

const city = {
  name: "Sydney",
  state: "NSW",
  population: 5.3,
  peoplePerSqKm: 442,
};

console.log(city);

const { peoplePerSqKm, ...otherProps } = city;

// This destruction my object into two sets of props (one set with a single proo of peoplePerSqKm and another of props with all other props)
const sydney = {...otherProps, density: peoplePerSqKm};
console.log(sydney);
console.log(otherProps);

// how can we delete key value pairs?
console.log("Before deleiting Key", sydney);
delete sydney.state;
console.log("After deleiting Key", sydney);

delete sydney["population"];
console.log("After deleiting Key", sydney);

//using es6 spread + destructuring syntax approach 
const car = {
  color: "red",
  brand: "Ford",
  model: "Mustang",
  year: 1974,

};

console.log(car);
const {color, ...otherProperties} = car;
const newCar = {...otherProperties};
console.log(newCar);

// when we destructure the original we do not alter its structure. So it any methods inside the original object used keys/value pairs we did not want to keep , we are avoiding breaking mehtods that could relay on them. 
// the new object only contains the properties we want 
