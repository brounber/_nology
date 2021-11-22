// Async/Await vs .then 

const coachPromise = () => new Promise((resolve, reject) => {
  setTimeout(() => {
    resolve([{name: "Remi"}, {name: "Calum"}]);
  });
}, 1000);

console.log(coachPromise());

const promise = coachPromise();
promise.then((coaches) => console.log("Coach Names", coaches.map(coach => coach.name),),);

// Then Handler

const thenHandler = () => {
  const studentPrimise = new Promise((resolve, reject) => {
    setTimeout(() => {
      resolve([{name: "Kenny"}, {name: "Raf"}]);
    }, 3000);
  });
  studentPrimise.then((students) => {
    console.log("Student anme with .then",
      students.map((student) => student.name),
      );
  });
};

thenHandler();

// Async / Await handler

const asyncHandler = async() => {
  const studentPromise = new Promise((resolve, reject) => {
    setTimeout(() => {
      resolve([{name: "Jay A."}, {name: "Jay Y."}]);
    }, 3000);
  });
  const students = await studentPromise;
    console.log("Student name with async / await", students.map((student) => student.name),);
};

asyncHandler();

// you can not map objects 