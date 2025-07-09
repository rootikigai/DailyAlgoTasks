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
    console.log(i)
}

console.log()

// Print even numbers from 1 to 20
for(let i = 1; i <= 10; i++){
    if(i % 2 == 0)console.log(i)
}

console.log()

// Print your name 5 times
for(let i = 0; i < 5; i++){
    console.log("Kelvin Ifeanyi")
}

console.log()

// Print all numbers from 50 to 100
for(let i = 50; i <= 100; i++){
    console.log(i + (end = " "))
}

console.log()

// Print all odd numbers between 1 and 30
for(let i = 1; i <= 30; i++){
    if(i % 2 != 0){
        console.log(i)
    }
}

console.log()

// Print numbers in reverse from 10 to 1
for(let i = 10; i >= 1; i--){
    console.log(i)
}

console.log()

for(let i = 1; i <= 10; i++){
    console.log(i * 3)
    }

console.log()