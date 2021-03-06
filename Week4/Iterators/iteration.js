const nums = [1,2,3,4,5];

const incremented = [];
for (let i=0; i < nums.length; i++ ) {
  incremented.push(nums[i] + 1)
}

console.log("Incrementing with for loop", incremented);

const squared = [];
for (let i=0; i<nums.length; i++) {
  squared.push(nums[i] **2)
}

console.log("Squaring with for loop", squared);

//map()
// hwen i want  a new array of the same length 

const myMap = (array, func) => {
  const newArr = [];

  for (let i = 0; i <array.length; ++i) {
    const currentItem = array[i];
    const newValue = func(currentItem);
    newArr.push(newValue);
  }
  return newArr;
}

const increment = (n) => n + 1;
console.log("Incrementing with myMap", myMap(nums, increment));

const squared1 = (n) => n+1;
console.log("Squared with myMap", myMap(nums, squared1));

console.log("incrementing with JS map():", nums.map((n) => n ** 2));

// filter() array method

const myfilter = (array, callback) => {
  const newArray = [];

  for (let i=0; i<array.length; ++i) {
    const current = array[i];
    const shouldKeep = callback(current);
    if (shouldKeep) {
      newArray.push(current);
    }
  }
  return newArray;
}

const isOdd = (n) => n%2;
console.log("filtering out the even number", myfilter(nums, isOdd));

const isEven = (n) => !(n%2);
console.log("filering out odd numbers", myfilter(nums, isEven));

console.log(nums.filter((n) => n%2));
console.log(nums.filter((n) => n%2 === 0));


// the every() iterator

const myEvery = (array,callback) => {
  for (let i=0; i< array.length; i++) {
    const current = array[i];
    const passed = callback(current);
    if (!passed) {
      return false;
    }
  }
  return true;
}

console.log(myEvery(nums,(n) => n%2));
console.log(myEvery(nums,(n) => n%2 === 0));

console.log(nums.every(n=> n%2), nums.every(n => n%2 === 0), nums.every(n=> n<0));

// some() iterator implementation

const mySome = (array,callback) => {
  for (let i=0; i< array.length; i++) {
    const current = array[i];
    const passed = callback(current);
    if (!passed) {
      return false;
    }
  }
  return false;
}

console.log(mySome(nums,(n) => n%2));
console.log(mySome(nums,(n) => n%2 === 0));

console.log(nums.some(n=> n%2), nums.some(n => n%2 === 0), nums.some(n=> n<0));


//reduce
// most cases we use reduce when we want an output htat is not an array

const myReduce = (array, callback, accumulator) => {
  for (let i = 0; i < array.length; ++i) {
    accumulator = callback(accumulator, array[i]);
  }
  return accumulator;
}

console.log("Using myReduce:", myReduce(nums, (accumulator, number) => accumulator + number,0))

console.log("using myReduce", myReduce(["R", "E", "M", "I"], (acc,char) => `${acc}${char}`, ""))

console.log("using JS Reduce():", nums.reduce((acc, number) => acc + number, 0), ["R", "E", "M", "I"].reduce((acc,letter) => `${acc}${letter}`, ""))



const booleanArr = [true, true, false, false, true];
const removeFalseValues = (booleanArr) => {

  return booleanArr.filter((boolean) => boolean == true);
};

console.log(removeFalseValues(booleanArr));

const numbersArr=[1, .5, .7, .25];

const createPercentageList = (numbersArr) => {

  return numbersArr.map((number) => `${number*100} %`);
}

console.log(createPercentageList(numbersArr));



const possessionsArr =["shoes", "jacket", "belt"];
const name = "disco";



const createListOfPoessessions = (possessionsArr, name) => {
   
  return possessionsArr.map((possessionsArr) => name + " "+ possessionsArr)
};

console.log(createListOfPoessessions(possessionsArr));


const numberString = "1+2+3+4+5"
 

const createOddEvenArray = (numberString) => {
  const arraySplit = numberString.split("+");
  arraySplit.map((number) => Number);

  
  
  return arraySplit;
};

console.log(createOddEvenArray(numberString));


const string = " 22 $$He LL--O!%^& ";
const formatString = (string) => {
  const regex = /([A-Za-z])/g;
  const combinedString = regex.join((string) => string);
 
   return combinedString;
 };

 console.log(formatString(string))


