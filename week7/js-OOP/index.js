const myArray =  [];

class Track {
  constructor(name,duration, format) {
    this.name = name;
    this.duration = duration;
    this.format = format;
  }

  get filename () {
    return `${this.name}.${this.format}`;
  }

  get trackDuration() {
    return `${this.duration}`;
  } 
}

class Podcast extends Track {
  constructor(name, duration, format, guests = []) {
    super(name, duration, format);
    //this.guests = guest;
  }

  // get guestInformation() {
  //   return `${this.guest.join(", ")}`;
  // }
}

const myPodcast = new Podcast("Nology lesson", "3H45Min", "mp3", ["Remi", "student",]);

console.log("Podcast inherits filename getting method: ", myPodcast.filename)
console.log("Podcast inherits filename getting method: ", myPodcast.duration)

console.log("Podcast also has its own method which i can access: ", myPodcast.guestInformation,);

//encapsulation
// - keep every important piece of information inside an object
// - only exposing the information you want to expose
// = private/Public method or porps

// non oop

const bookName = "Lort of the Rings";
const bookAuthor= "JRR Tolkien";
const bookPage= "1000";

const book = {
  bookName: "Lort of the Rings",
  bookAuthor: "JRR Tolkien",
  bookPage: "1000",

};

const newBook = book;
newBook.bookName = "How to Win Friends and Influence People";
newBook.bookAuthor = "Dale Varrnegie";
newBook.bookPage = "200";

console.log(book.bookName);
console.log(newBook.bookName);

class Book {
  constuctor(name, author, pages) {
    this._name = name;
    this.author = author;
    this.pages = pages;
  }

  // get name() {
  //   return this._name.toUpperCase();
  // }
}

const lotr = new Book ("Lort of the Rings", "JRR Tolkien", "1000");
const winFriends = new Book ("How to Win Friends and Influence People", "Dale Varrnegie", "200");

console.log("Get the book title", lotr.name);
console.log("Get the book title", winFriends.name);

//abstraction
//non oop

const firstname = "Remi";
const lastName = "HOEPPE";

const fullName = (first, last) => {
  return `${first} ${last}`
}

console.log("non oop:", fullName(firstname, lastName));

class Person {
  constructor(firstName, lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }
  get fullName () {
    return `${this.firstName} ${this.lastName}`
  }
}

const people = [new Person("Kenny, Waite"), new Person("Jay", "Yoon"), new Person("Ben", "S.")];

console.log("OOP with fullname method abstracted: ", people.map(person => person.fullName));

//polymorphis

// - through inheritence we can override or change implementation of method extended from parent to child classes 

class MyType {
  constructor(data) {
    this.data = data;
  }

  slice() {
    return "this Type can NOT be sliced";
  }
}

class MyString extends MyType {
  slice(start, end) {
    return this. data.substring(start, end);
  }
}

class MyArray extends MyType {
  slice(start, end) {
    return this.data. slice(start, end);
  }
}

class MySpecialArr extends MyArray {
  slice(start, end, extraValue) {
    const newArray = this.data.slice(start, end);
    newArray.push(extraValue);
    return newArray;
  }
}

const myVar = new MyType("some data");
const myString = new MyString("This is a string");
const MyArr = new MyArray([1,2,3,4,5,6]);

console.log(myVar.slice())
console.log(myString)