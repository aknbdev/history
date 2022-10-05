// 2-dars   || console log
// ------------------
// bu birinchi Java Script kodim
// console.log("Assalomu Alikum");

// 3-dars || o'variables and constants
// ------------------
// let name = 'Abdulaziz';
// let age = 19;
// let isMarried = false;
// const p = 3.14;

// 4-dars   || data types
// ------------------
// let name = 'Abdulaziz';   => String
// let age = 19;             => Integer
// let isMarried = false;    => Boolean

// 5-dars   || objects
// ------------------
// let person = {
//     name : 'Andulaziz',
//     age : 19,
//     isMarried : false
// }
// person.name = 'Axrorbek';

// 6-dars   || arrays
// ------------------
// let axi04 = ['Abbos', 'Abdulaziz', 'Axror', 'Dovudxon'];
// console.log(axi04);

// 7-dars   || functions
// ------------------
// type of this function there is not return
// function greet(name) {
//     console.log('Assalomu Alikum, ' + name);
// }
// greet('Abdulazizxon');
// greet('Axrorbek');
// ------------------
// type of this function there is not return
// function greet(firstName, lastName) {
//     console.log('Assalomu Alikum, ' + firstName + ' ' + lastName);
// }
// greet('Abdulazizxon', 'Karimbayev');
// greet('Axrorbek'); // second's valeu is ''undefined''
// ------------------
// type of this function there is return
// function sqrt(number) {
//     return number * number;
// }
// console.log(sqrt(7));
// ------------------

// 8-dars   || arifmetic operators
// ------------------
// let x = 17;
// let y = 9;
// console.log(x + y); // adds both
// console.log(x - y); // seperates both
// console.log(x * y); // multiples both
// console.log(x / y); // divides both and take hole number
// console.log(x % y); // divides both and takes remain number
// console.log(x++);   // first log and increment x = x + 1;
// console.log(++x);   // first increment and log x = x + 1;
// console.log(x--);   // first log and decrement x = x - 1;
// console.log(--x);   // first decrement and log x = x - 1;
// x += 3; // x = x + 3;
// x -= 3; // x = x - 3;
// x *= 3; // x = x * 3;
// x /= 3; // x = x / 3;
// x %= 3; // x = x % 3;
// ------------------

// 9-dars   || comparison and equal operators
// ------------------
// let x = 18;
// let y = 11;
// ------------------
// console.log(x > y);    // returns true
// console.log(x >= y);   // returns true
// console.log(x < y);    // returns false
// console.log(x <= y);   // returns false
// console.log(x === y);  // strict aquals checks type and value
// console.log(x == y);   // loose aquals checks value
// console.log(x !== y);  // checks not equals
// ------------------
// x = 10;
// y = 5;
// console.log(x > y);    // logs true value
// ------------------
// x = 5;
// y = 5;
// console.log(x !== y);  // logs false value
// ------------------
// x = "02";
// y = "12";
// console.log(x == y);   // logs false value
// ------------------

// 10-dars   || ternary operator
// ------------------
// let points = 70;
// let result = points > 60 ? 'O\'tdi' : 'O\'tmadi';
// console.log('Imtihon natijasi: ' + result);
// ------------------
// let client = 'yes';
// let result = client === 'yes' ? 'Sizga 20% chegirma bor!' : 'Sizga 5% chegirma bor!';
// console.log(result);
// ------------------

// 11-dars 1-qism   || logical operators
// console.log(true && true); // returns true when both of side true
// ------------------
// let hour = 10;
// let minute = 30;
// console.log(hour >= 9 && minute >= 0); // returns true because 10 : 30 big than 9 : 0
// ------------------
// let date = new Date();
// let hour = date.getHours();
// let minute = date.getMinutes();
// console.log('Hour is: ' + hour + ', Minute is: ' + minute);
// let officeIsOpen = (hour >= 9 && minute >= 0); // returns true when hour and date true
// let officeIsNotOpen = !officeIsOpen;
// console.log('Office is open: ' + officeIsOpen);
// console.log('Office is not open: ' + officeIsNotOpen);
// ------------------
// let date = new Date();
// let hour = date.getHours();
// let minute = date.getMinutes();
// console.log('Hour is: ' + hour + ', Minute is: ' + minute);
// let officeIsOpen = (hour >= 9 || minute >= 0); // returns true when hour or date true
// let officeIsNotOpen = !officeIsOpen;
// console.log('Office is open: ' + officeIsOpen);
// console.log('Office is not open: ' + officeIsNotOpen);
// ------------------

// 11-dars 2-qism   || logical operators
// let text = 'hello';
// console.log(false || text)    // logs hello because JS found trucy element from logical when found trucy element then logs it
// ------------------
// FALCY element is:
// null, undefined, '', NAN,
// ------------------
// let defoultColor = 'Black';
// let clientsColor = 'Blue';
// console.log(clientsColor || defoultColor); // when clientsColor will be null logs defoultColor
// ------------------
// let person = {
//     name : 'Abdulaziz',
//     age : 10
// }
// console.log('Client: ' + (person.getJob || 'ishsiz')); // logs ishsiz because job is undefined
// ------------------
// let isOpen = false;
// console.log(!!isOpen);
// ------------------
// let a;
// let b = null;
// let c = undefined;
// let d = 4;
// let e = 'hello';
// let f = a || b || c || d || e;
// console.log(f);    // logs 4 because JS finding trucy value left to right when found logs it
// ------------------

// 12-dars   || practise
// let color1 = 'white';
// let color2 = 'black';
// let temp = color1;
// color1 = color2;
// color2 = temp;
// console.log(color1);
// console.log(color2);
// ------------------

// 13-dars   || if/else
// let date = new Date();
// let hour = date.getHours();
// if (hour >= 6 && hour < 12){
//     console.log('Hayrli tong!');
// } else if (hour >= 12 && hour < 18){
//     console.log('Hayrli kun!');
// } else {
//     console.log('Hayrli kech!');
// }
// ------------------

// 14-dars   || switch/case
// let word = "book";
// switch (word) {
//   case "pencil":
//     console.log("qalam");
//     break;
//   case "book":
//     console.log("kitob");
//     break;
//   default:
//     console.log(word);
// }
// ------------------
// let word = 'peach';
// if (word === 'peach'){
//     console.log('shaftoli');
// } else if (word === 'book'){
//     console.log('kitob');
// } else {
//     console.log(word);
// }
// ------------------

// 15-dars   || for loop
// for (let i = 0; i < 10; i++){
//     if (i % 2 !== 0){
//         console.log('Odd number: ' + i);
//     }
// }
// ------------------
// for (let i = 10; i >= 1; i--){ // reverse loop
//     if (i % 2 === 0){
//         console.log('Even num: ' + i);
//     }
// }
// ------------------

// 16-dars   || while do/while loop
// for (let i = 1; i <= 3; i++){ // from 1 to 3 logs in 3 line of code
//     console.log(i);
// }
// ------------------
// let i = 1;
// while (i <= 3){           // from 1 to 3 logs in 5 line of code
//     console.log(i);
//     i++;
// }
// ------------------
// let j =7;
// do {                      // from 1 to 3 logs in 5 line of code
//     console.log(j);
//     j++;
// }while (j <= 3);         // first logs and next checks valid  or not
// ------------------

// 17-dars   || break/continue
// let i = 1;
// while (i <= 10){
//     if (i % 3 === 0){
//         i++;
//         continue;
//     }
//     if (i === 9){
//         i++;
//         break;
//     }
//     console.log(i);
//     i++;
// }
// ------------------

// 18-dars   || for in/for of
// let person = {
//     name : 'Axrorbek',
//     age : 19
// }
// for (let key in person){
//     console.log(key , person[key]);
// }
// ------------------
// let colors = ['white', 'black', 'green', 'yellow']
// for (let index in colors){
//     console.log(index, colors[index]);
// }
// ------------------
// for (let color of colors){
//     console.log(color);
// }
// ------------------

// 19-dars   || practise
// function getMax(a, b){
//     return (a>b) ? a : b;
// }
// console.log('Max: ' + getMax(100, 20));
// ------------------
// function isLandScape(width, height){
//     return (width > height);
// }
// console.log('Is landscape: ' + isLandScape(122, 23));
// ------------------

// 20-dars   || practise
// function fizzBuzz(input){
//     let result = '';
//     // if (input % 3 === 0){
//     //     result += 'Fizz';
//     // } if (input % 5 === 0){
//     //     result += 'Buzz';
//     // } if (typeof input !== 'number'){
//     //     result += 'Not Number';
//     // }
//     result += (input % 3 === 0) ? 'Fizz' : '';
//     result += (input % 5 === 0) ? 'Buzz' : '';
//     result += (typeof input !== 'number') ? 'Not Number' : '';
//     result += (result === '') ? input : '';
//     return result;
// }
// console.log(fizzBuzz(7));
// ------------------

// 21-dars   || practise
// const speed_limit = 70;
// const point_per_km = 5;
// const max_point = 12;
// function checkSpeed(speed){
//     if (speed <= speed_limit){
//         return 'Ok';
//     } else {
//         const points = Math.floor((speed - speed_limit + point_per_km)/point_per_km);
//         if (points > max_point){
//             return 'Guvohnoma olib qo`yiladi';
//         }
//         return points;
//     }
// }
// console.log(checkSpeed(130));
// ------------------

// 22-dars   || practise
// function sum(limit) {
//   let sum = 0;
//   for (let i = 1; i <= limit; i++) {
//     if ((i % 3 === 0) || (i % 5 === 0)) {
//       sum += i;
//     }
//   }
//   return sum;
// }
// console.log(sum(10));
// ------------------
// let car = {
//   model: "Toyota",
//   make: "Estima",
//   year: 2016,
//   price: 12000,
// };
// function showProperties(obj) {
//   for (let key in obj) {
//     if (typeof obj[key] === "string") {
//       console.log(key, obj[key]);
//     }
//   }
// }
// showProperties(car);
// ------------------

// 23-dars   || practise
// const marks = [81, 74, 86, 59, 77];
// console.log(callculateGrade(marks));
// function callculateGrade(marks) {
//   let avrg = calculateAverage(marks);
//   if (avrg <= 50) return  "Grade is: F";
//   if (avrg <= 70) return "Grade is: C";
//   if (avrg <= 60) return "Grade is: D";
//   if (avrg <= 80) return "Grade is: B";
//   return "Grade is: A";
// }
// function calculateAverage(arr){
//     let sumMarks = 0;
//   for (let mark of arr) {
//     sumMarks += mark;
//   }
//   return Math.floor(sumMarks / arr.length);
// }
// ------------------

// 24-dars || practise
// showPrimeNumbers(20);
// function showPrimeNumbers(limit) {
//   for (let i = 2; i <= limit; i++) if (isPrime(i)) console.log(i);
// }
// function isPrime(number) {
//   for (let j = 2; j < number; j++) if (number % j === 0) return false;
//   return true;
// }
// ------------------

// 25-dars || Make new object
// let radius = 1;
// let x = 1;
// let y = 1; // these are variables describes circle
// ------------------
// const circle = { // this is object it have every needed variables and methods
//   radius : 1,
//   sides : {
//     x : 1,
//     y : 1
//   },
//   draw : function(){
//     console.log('Cirle');
//   }
// }
// ------------------
// function createCircle(radius){
//   return {
//     radius,
//     draw(){
//       console.log('Circle')
//     }
//   }
// }
// const circle = createCircle(2);
// const circle2 = createCircle(7);
// ------------------

// 26-dars || constructor property
// function createCircle(radius){
//     return {
//         radius,
//         draw() {
//             console.log('doira');
//         }
//     }
// }
// function Circle(radius){
//     this.radius,
//     this.draw = function(){
//         console.log('doira');
//     }
// }
// const circle1 = createCircle(1);
// const circle2 = new Circle(2);
// console.log(circle1.constructor);
// console.log(circle2.constructor);
// ------------------

// 27-dars || function object
// function Circle(radius) {
//     this.radius,
//         (this.draw = new (function () {
//             console.log("doira");
//         })());
// }
// console.log(Circle.name, Circle.length, Circle.constructor);
// const Circle2 = new Function(
//     "radius",
//     `this.radius,
//     this.draw = new function(){
//         console.log('doira');
//     }`
// );
// console.log(Circle2.name, Circle2.length, Circle2.constructor);
// ------------------

// 28-dars || value and reference type
// let a = 12;
// let b = a;
// a=32
// console.log(a, b); // by value
// ------------------
// let x = { value : 'hi' };
// let y = x;
// x.value = 'bye';
// console.log(x, y); // by reference
// ------------------
// let number = 1;
// function increase(number){
//     number++;
//     console.log('inside:', number);
// }
// increase(number);
// console.log('outside:', number);
// ------------------
// let obj = { value : 1 };
// function funcObj(obj){
//     obj.value = 21
//     console.log('inside:', obj);
// }
// funcObj(obj);
// console.log('outside:', obj);
// ------------------

// 29-dars || by object properties
const cirle = {
    radius : 1,
    draw(){
        console.log('Hi!');
    }
}

for (let key in cirle)
    console.log(key, cirle[key]);

