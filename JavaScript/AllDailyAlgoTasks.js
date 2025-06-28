const prompt = require("prompt-sync")();
//Collect and print sum
function CollectAndPrintSum(scores){
    let addScores = 0;
    for(let i = 0; i < scores.length; i++){
	    addScores += scores[i];
    }
    return addScores
}
let studentScores = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
console.log(CollectAndPrintSum(studentScores))


/*
let scores = [];
let sum = 0;
for(let i = 1; i <= 10; i++){
	let input = parseInt(prompt("Enter score " + i + ": "));
    scores[i] = input;
	sum = sum + scores[i];
}
console.log("Sum is " + sum);
*/
