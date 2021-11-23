// we want our front end to allow user to input which page they want to access
// we need a button to submit that user input
//we want our logic to populate the wabpage with list items 
// one for each breed and its origin

// writting a function that gets data from cat api depending a page number org

const CATFACTS_URL = "https://catfact.ninja/";
const getBreeds = async (pageNumber) => {
  const response = await fetch(`${CATFACTS_URL}breeds?page=${pageNumber}`);
  const data = await response.json();
  console.log(data.data);
  return data.data;
} 

getBreeds(1);

const button = document.getElementById("getBreeds");
button.addEventListener("click", async() => {
  const input = document.getElementById("pageNumber");
  const pageNumber = parseInt(input.value);

  const breeds = await getBreeds(pageNumber);
  console.log(breeds);

  const listItems = breeds.map(cat => {
    const element = document.createElement("li")
    const breedText = `${cat.breed} is from ${cat.country}`;
    const textNode = document.createTextNode(breedText);
    element.appendChild(textNode);
    return element;
  });
  const list = document.getElementById("breeds");
  const append = parent => child => parent.appendChild(child);

  listItems.forEach(append(list));
})