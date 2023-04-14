const prompt = require("prompt-sync")();


let number;
while(number != 16){
    number = prompt("Guess my birth date ")
    if(number == 16){
        console.log("Correct. Well done!")
        break
    }
    else{
        console.log("Incorrect guess. Try again")
    }
}