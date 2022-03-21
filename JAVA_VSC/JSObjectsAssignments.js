// Question - 1  2  3
class Rectangle {
    constructor(height, width) {
        this.height = height;
        this.width = width;
    }
}

Rectangle.prototype.area = function () {
    console.log("Area is " + this.height * this.width);
}

const r1 = new Rectangle(4, 5);
console.log(r1.height);
console.log(r1.width);
r1.area();

//   Question - 4  5  6
var p = {
    firstName: "Fname",
    lastName: "Lname",
    middleName: ""
};

p.getFullName = function () {
    console.log(this.firstName + this.middleName + this.lastName);
   //console.log(JSON.parse(JSON.stringify(p)));
   //console.log(p.firstName);
}

console.log(p.firstName);
p.middleName = "Mname";
console.log(p.middleName);
console.log(p.lastName);
p.getFullName();





// Question 7
class Person {
    constructor(fname, lname, age, skill, address, dob, married, profession) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.skill = skill;
        this.address = address;
        this.dob = dob;
        this.married = married;
        this.profession = profession;
    }
};
let person1 = new Person("nikhil", "goud", 22, ["c"], "24/10/1996", { city: "hyderabad", pincode: "521185" }, "false", "sr analyst");
let person2 = new Person("harish", "chinna", 21, "HTML", "08/06/1997", { city: "Ameerpet", pincode: "500038" }, "false", "jr analyst");

console.log(person1);
console.log(person2);
