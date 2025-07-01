const prompt = require("prompt-sync")();
//Collect and print sum
function CollectAndPrintSum(scores){
    let addScores = 0;
    for(let i = 0; i < scores.length; i++){
	    addScores += scores[i];
    }
    return addScores
}

function CollectAndPrintAverage(scores){
    let addScores = 0;
    let average = 0
    for(let i = 0; i < scores.length; i++){
	    addScores += scores[i];
        average = (addScores / scores.length)
    }
    return average
}

function DivisibleByFive(number){
    if(number % 5 == 0){
      return number * number;
    }
    return number % 5;
}

console.log(DivisibleByFive(22))


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
