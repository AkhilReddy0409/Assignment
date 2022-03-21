console.log("ASSIGNMENT -1");
// Question 1
const a1 = 10;
if (a1 > 1) {
    const a1 = 20;
    console.log("Value of a1 in if block is " + a1);
}
console.log("Value of a1 is " + a1);
//Question 2
var a2 = 12;
if (a2 > 2) {
    var b2 = 20;
    console.log("Value of b2 in if block is " + b2);
}
console.log("Value of b2 is " + b2); // if let is used then it is not accessible
//Question 3
console.log("QUESTION - 3");
let Order = {
    id: 1,
    title: "Item1",
    price: 50,
    printOrder: function () {
        console.log("PRINTING ORDER :" + Order.title + " " + Order.price);
    },
    getPrice: function () {
        console.log("PRICE ORDER " + "RS: " + Order.price + "/-");
    }
};
Order.printOrder();
Order.getPrice();
// Question 4
// Question 5a
let add = function (a5 = 5, b5 = 5) {
    let sum = a5 + b5;
    console.log("sum is " + sum);
};
add();
add(2);
add(1, 1);
// Question 5c
function capital(v, w, x, y, z) {
    return console.log(v.toUpperCase()),
        console.log(w.toUpperCase()),
        console.log(x.toUpperCase()),
        console.log(y.toUpperCase()),
        console.log(z.toUpperCase());
}
const s5 = ["a", "b", "c", "d", "e"];
capital.apply(null, s5);
// Question 6
let model = "i5";
let deskID = 10;
let name6 = "Akhil";
console.log(`Laptop Model is ${model} , My Desk Number is ${deskID}, My Name is ${name6}`);
// Question 7
let arr7 = [1, 2, 3, 4];
console.log(arr7[2]);
//Question 8
class Account {
    constructor(id, name8, bal) {
    }
    savingsAccount() {
        console.log("SAVINGS ACCOUNT");
    }
    currentAccount() {
        console.log("CURRENT ACCOUNT");
    }
}
let a8 = new Account(1, "ABC", 1000);
a8.currentAccount();
//# sourceMappingURL=Assignment1.js.map