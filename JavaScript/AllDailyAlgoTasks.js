const prompt = require("prompt-sync")();
//Collect and print sum
let scores = [];
let sum = 0;
for(let i = 1; i <= 10; i++){
	let input = parseInt(prompt("Enter score " + i + ": "));
    scores[i] = input;
	sum = sum + scores[i];
}
console.log("Sum is " + sum);
