const getRandomNumber = () => {
  return Math.ceil(Math.random()* 100);
};


const getRandomNumberPriomise = () => {
  return new Promise((resolve, reject) => {
    const n = Math.ceil(Math.random()* 100);

    if(n>50) {
      reject(n);
    }  else {
      resolve(n);
    }
  });
};

console.log(getRandomNumber());
console.log(typeof getRandomNumber());
console.log(typeof getRandomNumberPriomise().constructor.name);

let randomNumber = getRandomNumberPriomise()
console.log(randomNumber);


const concatPromise = (left, right, delimiter = "+", timeout = 1000) => {
  return new Promise((resolve, reject) => {
    setTimeout(()=> {
      resolve(`${left}${delimiter}${right}`)
    }, timeout)
  })

};

concatPromise("Remi", "HOEPPE", "|||",2000).then((results)=>{
  console.log(result);
});
