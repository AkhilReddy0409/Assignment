console.log("ASSIGNMENT -3");

// Question 1
// var mypromise = new Promise((resolve, reject) => {
//     resolve(10);
//     });
//     mypromise.then((x) => x + 10)
//     .then((x) => console.log("Value form the promse function is " + x)
//     .catch((err) => console.log("inside error block " + err)));


// Question 2
class Account3{
    constructor(id,name8,bal){   
    
    }
     savingsAccount(){
         console.log("SAVINGS ACCOUNT");
     }
     currentAccount(){
        console.log("CURRENT ACCOUNT");
    }
}
let ac= new Account3(1,"ABC",1000);
ac.currentAccount();

console.log("");
// Question 3
interface Printable{
    firstName?:string, 
    lastName?:string,
    radius?:number,
    print?(radius)
} 
var circle: Printable ={
radius:10,
print(radius){
console.log(`CIRCLE WITH RADIUS `+radius);
}
}
var employee: Printable = { 
    firstName:"fn",
    lastName:"ln", 
 } 
 console.log("Circle  Object ") 
 console.log(circle.radius);
 console.log(circle.print(10));  
console.log("Employee  Object ") 
console.log(employee.firstName);
console.log(employee.lastName);