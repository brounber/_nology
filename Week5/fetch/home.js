// what is an api
// applications programming inmterface

// how do we get data from an APU
// >> fetch
// needs await needs to be in an async function 

const handler = async() => {
  const responsePromise = fetch('https://catfact.ninja/breeds');
  const response = await responsePromise;
  console.log(response);
  const jsonResponse = await response.json();
  console.log(jsonResponse);

  const pages = jsonResponse.last_page;
  console.log(pages);

  let promises = [];
  for (let i = 2; i <= pages; i++) {
    promises.push(fetch(`https://catfact.ninja/breeds?page=${i}`));
  }
  console.log(promises);

  const responses = await Promise.all(promises); 

  //waiting all th primises to be resolved
 
  console.log("Array of response:", response);
  const jsonPromises = responses.map((response) => response.json());
  const jsonResponses = await Promise.all(jsonPromises);
  console.log("Array of JSON responses: ",jsonResponses);

  jsonResponses.unshift(jsonResponse);

  const breeds = jsonResponses.map((response) =>{
    return response.data.map((breed) => breed.breed).join(", ");
  }).join(", ");
  console.log(breeds);
  
};

handler();