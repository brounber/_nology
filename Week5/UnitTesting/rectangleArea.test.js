import { rectangleArea } from "./rectangleArea.js";

// describe
// it 
// expect
// toBe

describe("Test for rectangleArea()", () => {
  const error = new Error("height and width need to be numbers");
  const singleParamError = new Error ("You need two arguments for this function");
  const noParamError = new Error ("You need two arguments for this function");
  it("its shoud return the right result, with valid paramaters", () => 
  {
    expect(rectangleArea(2, 2)).toBe(4);
  });

  it("should return an error when given strings", () => {
    expect(() => rectangleArea("2","2")).toThrowError(error);
  });
  
  it("Should return an error when given only 1 argument", () => {
    expect(() => rectangleArea(2)).toThrowError(singleParamError);
  });

  it("Should return an error when given only 0 argument", () => {
    expect(() => rectangleArea(2)).toThrowError(noParamError);
  });

});