 Timed Number Guesser

 Overview

Timed Number Guesser is an interactive command-line game developed in Java. Players are challenged to guess a randomly generated number within a specified time limit. The game offers three difficulty levels, each with different number ranges and time constraints.

 Features

- Difficulty Levels: 
  - Easy (1-50, 60 seconds)
  - Medium (1-100, 30 seconds)
  - Hard (1-200, 15 seconds)
- Random Number Generation: The game generates a random number within the selected range.
- Timer: A countdown timer limits the time available to guess the number.
- User Interaction: Players interact with the game via the console.

 Technologies Used

- Java SE: Core programming language.
- Java Util Timer and TimerTask: Manage the countdown timer.
- Java Util Scanner: Handle user input for game interaction and difficulty selection.
- Math.random(): Generate random numbers.

 Getting Started

 Prerequisites

- Java Development Kit (JDK) installed on your system.

 Running the Game

1. Clone the repository:
    bash
    git clone https://github.com/somysrivastava/timed-number-guesser.git
    
2. Navigate to the project directory:
    bash
    cd timed-number-guesser
    
3. Compile the Java files:
    bash
    javac Game/GuessingGame.java
    
4. Run the game:
    bash
    java Game.GuessingGame
    

 How to Play

1. Select Difficulty: Choose a difficulty level by entering 1, 2, or 3.
   - 1: Easy (1-50, 60 seconds)
   - 2: Medium (1-100, 30 seconds)
   - 3: Hard (1-200, 15 seconds)
   
2. Guess the Number: Enter your guesses within the allotted time.
   - The game will provide feedback whether the guessed number is higher or lower than the target number.
   - Continue guessing until you either find the correct number or run out of time.

3. Play Again: After each round, you can choose to play again by entering 'yes' or 'no'.

 Example


Select difficulty level: 
1. Easy (1-50, 60 seconds)
2. Medium (1-100, 30 seconds)
3. Hard (1-200, 15 seconds)
Enter your choice (1/2/3): 2
Guess a number between 1 and 100. You have 30 seconds.
Enter your guess: 50
The number is higher. Try again.
Enter your guess: 75
The number is lower. Try again.
...


Enjoy the game!
