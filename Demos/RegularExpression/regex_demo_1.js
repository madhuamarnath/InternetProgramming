var str = 'GlenMcGrath';
var regexp = /[A-G]/gi;	// g - global flag and i - ignore case flag
var matches_array = str.match(regexp);
alert(matches_array);


var str = "Welcome to RMKCET";
var n = str.search("RMKCET");
alert(n);

var str = "HTML5";
var n = str.search(/\d/);
console.log(n);

var str = "HTML5-CSS3-JavaScript-JQuery";
var n = str.split(/-/g);
console.log(n);


let text = "India"; 
let pattern = /e/;
let result = pattern.test(text);
console.log(result);

let text = "Visit RMKCET!";
let result = text.replace("RMKCET", "IIT Madras");
console.log(result);

let text = "Rahul Dravid is the best batsman. Wasim Akram is the best fast bowler. Shane Warne is the best spin bowler";
console.log(text.replaceAll("best","great"));

let inputString = "R#8alotru";
let pattern = /(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8,}/g;
console.log(inputString.match(pattern));
