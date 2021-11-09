// function scopes in js
// what is a scope is js?
// how do scopes work?
// what is the difference between local and global scopes

//Global Scope
let number = 13;
//console.log("outside my If block:", myVariable);

if (true) {
  //local If block scope
  let myVariable = "This is my variable";
  console.log("Inside If block:", myVariable, number)
}

// function scopes

function circleArea(radius) {
  const area = Math.PI * radius ** 2;
  return area;
}

// [const] [name of function] = (arguments) => {
//  body of the function
//  return
//}   

const circleAreaArrowFunction = (radius) => {
  const area = Math.PI* radius **2;
  return area;
}

console.log("area ES5:", circleArea(10));
console.log("area ES6:", circleAreaArrowFunction(10))
//console.log(area);

const myfunctions1 = () => {
  const firstName = "Raf";
  return firstName;
}

const myfunctions2 = () => {
  const lastName = "R";
  const firstName = myfunctions1();
  return `${firstName} ${lastName}`;

  
}
console.log(myfunctions1());
console.log(myfunctions2());


// nested scope

const scope1 = (scope1Arg) => {
  const myNumber = 123;

  const scope2 = (scope2Arg) => {
    const myString = '123';

    const scope3 = (scope3Arg) => {
      const scope3Variable = "Hello";
    };
    scope3("Arg of Scope 3");
  }
  scope2("Arg of Scope 2");
}
scope1("Arg of Scope 1");
