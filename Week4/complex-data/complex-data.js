// complex data 
// what are arrays of objects?
// how can we access data inside an array of objects 
// how can we iterate through a list of objects 

// how do we create 

const coaches = [
  {
    id: 1,
    firstName: "Remi",
    lastName: "Hoeppe",
    age: 32,
    title: "Junior Coach"
  },
  {
    id: 2,
    firstName: "Aidan",
    lastName: "Tessalar",
    age: 28,
    title: "Coach"
  },
  {
    id: 3,
    firstName: "Calum",
    lastName: "Hill",
    age: 28,
    title: "Senior Coach"
  },
];

console.log(coaches.filter((coaches) => coaches.title.includes("Senior")));

console.log(coaches.filter((coaches) => coaches.age >25));


// How did we find an object key
// how do we look for specific key inside an object
//how can use objects keys for data validation?

console.log(
  "Find by iD", coaches.find((coach) => coach.id === 2),
);

console.log(
  "Find by iD", coaches.find((coach) => coach.id === 4),
);


const myError = new Error("This id does not exist");

const findCoachById = (coaches, id) => {
  const coach = coaches.find((coach) => coach.id === id);
  if (!coach) {
    alert(`Coach with Id: ${id} does not exist`);
    //throw myError;
  }
return coach;
}

console.log(
  "Creating an array of fullNames:", coaches.map(coach) => `${coach.firstName} is ${coach.age} years old`),


console.log(
  "add ages of all the coaches:", coaches.reduce((acc, coach) => acc  + coach.age, 0);
);