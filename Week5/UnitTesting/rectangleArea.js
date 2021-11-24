export const rectangleArea = (height,width) => {
  const error = new Error("height and width need to be numbers");
  const singleParamError = new Error ("You need two arguments for this function");
  const noParamError = new Error ("You need two arguments for this function");
  
  if (!height || !width) {
    throw noParamError;
  }
  
  if (width === undefined || height === undefined) {
    throw singleParamError;
  }

  if(typeof height === "string" || typeof height === "string") {
    throw error;
  }

  
  return height * width;
}




