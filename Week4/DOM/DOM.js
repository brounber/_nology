//1. create a button that allow 



// selecting Single elemnet 
const inputTask = document.querySelector("#taskInput");
const main = document.querySelector("#main");
const addBtn = document.querySelector("#addTaskBtn");

// slecting multiple elements

const cantainers = document.querySelector(".container");
const div = document.querySelector("div");

const rectangleForm = document.getElementsById("rectForm");

rectangleForm.addEventListener("submit", (event) => {
  const width = document.querySelector("#x");
  const width = document.querySelector("#y");
  const output= document.querySelector("#rectOutput");
  
  const newElemPerim = document.createElement("p");
  const textElem = document.createTextNode(`The Perimeter is: ${rectanglePerm(witdth.value, height.value)}`);
  newElemPerim.appendChild(textPerim);
  output.appendChild(newElemPerim);

  const newArea = document.createElement("p");
  const textArea = document.createTextNode(`The Area is: ${rectanglePerm(witdth.value, height.value)}`);
  newElemArea.appendChild(textArea);
  output.appendChild(newElemArea);
});

