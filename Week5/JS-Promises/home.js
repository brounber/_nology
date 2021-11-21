console.log("1");

setTimeout(() => {
  console.log("2");
}, 5000);

let IntervalID = setInterval(() => {
  console.log("My setInerval has been executed");
  
}, 2000);

document.getElementById("stop").addEventListener("click", (event) => {
  clearInterval(IntervalID);
})



console.log("3");
console.log("I have not been blocked. :) , I am executed before TimeOut");

