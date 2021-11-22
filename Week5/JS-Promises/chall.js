const delayedIncDec = (n, mode, timeout) => {
  return new Promise((resolve, reject) => {
    setTimeout(() =>{
      let mode = n++;
      for(n = 0; n<3; n++) {
        
        resolve(print(n, mode, timeout))  
      }
    })
  }, timeout)
};


delayedIncDec(5,2500).then((result)=>{
  console.log(result);
});

// then((result) => {
//   console.log(result);
// });
