var choice1Score = 1;
var choice2Score = 1;
var userChoice =prompt("Do you choose rock, paper or scissors?");


var computerChoice = Math.random();
  if (computerChoice < 0.34) {
	computerChoice = "rock";
  } else if(computerChoice <= 0.67) {
	computerChoice = "paper";
  } else {
	computerChoice = "scissors";
  } 
  //console.log("Computer chooses: " + computerChoice);



var compare = function(choice1,choice2) {
    
    if (choice1 === choice2) {
        
        return "The result is a tie!" + " " + "Lets play again." ;
    }
    
    else if (choice1 === "rock") {
        
        if (choice2 === "scissors") {
            return "rock wins" + "<br>" + "You beat the computer, nice job!" + choice1Score++;
        }
        else {
            return "paper wins" + "<br>" + "Your really smart computer beat you." + choice2Score++;
        }
    }
    
    else if (choice1 === "paper") {
        
        if (choice2 === "rock") {
            return "paper wins" + "<br>" + "You beat the computer, nice job!" + choice1Score++;
        }
        else {
            return "scissors wins" + "<br>" + "Your really smart computer beat you." + choice2Score++;
        }
            
    }
    
    else if (choice1 === "scissors") {
        
        if (choice2 === "rock") {
            return "rock wins" + "<br>" + "Your really smart computer beat you." + choice1Score++;
        }
        else {
            return "scissors win" + "<br>" + "You beat the computer, nice job!" + choice2Score++;
        }
    }
    
    alert(scoring(userChoice(), compChoice()));
    } 

    
   document.write("Computer chose: " + computerChoice + "<br>");
   document.write(compare(userChoice,computerChoice));
    
   alert(scoring(userChoice(), compChoice()));