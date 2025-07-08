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

// console.log(DivisibleByFive(22))

// Print numbers from 1 to 10
for(let i = 1; i <= 10; i++){
    console.log(i + " ")
}
