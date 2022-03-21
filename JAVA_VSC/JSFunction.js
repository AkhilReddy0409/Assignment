//  Q-1
function square(x) {
    return x * x;
}
function double(y) {
    return y * 2;
}
function composedValue(square, double, num) {
    console.log(square(double(num)));
}

composedValue(square, double, 5);

// Q-2
function f1(num1) {
    console.log(compose(square, double, num1));
}

function f2(num1) {
    console.log(compose(double, square, num1));
}
f1(5);
f2(5);
// Q-3
array1 = [1, 3, 5, 4, 2];
var result = array1.find(element => element % 2 == 0);
Boolean(result);
// Q-4
array1 = [1, 2, 3, 4, 5];
array2 = [1, 4, 9, 16, 25];
let s1 = [];
let m1= [];

function map1(arr) {
  for (let i = 0; i < arr.length; i++) {
      s1.push(arr[i] * arr[i]);
    }
    console.log(s1);
}
function map2(arr) {
  for (let i = 0; i < arr.length; i++) {
      m1.push(Math.sqrt(arr[i]));
    }
    console.log(m1);
}
map1(array1);
map2(array2);
