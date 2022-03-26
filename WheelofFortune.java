/* Date: November 15th, 2019
 * Name: Stephen Huang
 * Teacher: Ms.Leung
 * Description: program the wheel of fortune
 */
import java.util.Scanner; //import scanner for user input
import java.util.Random; //import random number ganerator for random numbers

class WheelofFortune1 { //start the class
  static char[] chosen = new char[26]; //assuming they entered capital letters, there are 26 letters in the alphabet, this is for storing guessed letters
  
  public static boolean findRepeat(int guess, int t) { //method to find if there is a repeated letter guessed
    
    for (int i = 0; i < (t-1); i++) { //for checking if there is a repeating letter, t-1 so the most recent letter is not included or it will always return true
      if (chosen[i] == guess) { //if there is a guessed letter that is equal to the current letter, this will be true
        return true; // if the if statement is true, it will return true and return that there is a repeating guessed letter
      }
    } 
    
    return false;  // if there is not a repeating guessed letter, then it will return false to the main method because there is not a repeating letter
  }
  public static char ComputerVowel() { // method for choosing which letter a computer will guess using random number generator
    Random Rand3 = new Random(); // declare a random number generator
    int rand;// declare an int that will store the random number
    char g = ' '; // initialize the variable first
    rand = Rand3.nextInt(5) + 1; //tell random number generator the limits of the number generated, 1-5 and the +1 so the smallest number will not be 0 and the greatest will be 5
    
    if (rand ==1) { // if the random number is 1, the computer will guess A
      g = 'A'; 
    }
    else if (rand ==2) { // if the random number is 2, the computer will guess E
      g = 'E'; 
    }
    else if (rand ==3) { // if the random number is 3, the computer will guess I
      g = 'I'; 
    }
    else if (rand ==4) { // if the random number is 4, the computer will guess O 
      g = 'O'; 
    }
    else if (rand ==5) { // if the random number is 5, the computer will guess U
      g = 'U'; 
    }   
    return g; // return the stores variable the the main method so the main method can display and use this value for other methods
  }
  
  public static char ComputerConstant() { //method for computer to guess a constant using a random number generator and returning the guessed letter to the main method for other uses
    Random Rand3 = new Random(); //declare a random number generator
    int rand; //declare a variable to store the random number
    rand = Rand3.nextInt(21) + 1; //tell the random number generator the limitations of the number, in this case is is 1 to 21 since there are 26 letters in the alphabet and there are 21 constants because there are 5 vowels
    char g = ' '; //initiate the variable first to store a letter later
    if (rand ==1) { //if the random number generated a 1, the letter will be 'B' and it will be sent back to the main method for further use
      g = 'B'; 
    }
    if (rand ==2) { //if the random number generated a 2, the letter will be 'C' and it will be sent back to the main method for further use
      g = 'C'; 
    }
   else if (rand ==3) { //if the random number generated a 3, the letter will be 'D' and it will be sent back to the main method for further use
      g = 'D'; 
    }
   else if (rand ==4) { //if the random number generated a 4, the letter will be 'F' and it will be sent back to the main method for further use
      g = 'F'; 
    }
   else if (rand ==5) { //if the random number generated a 5, the letter will be 'G' and it will be sent back to the main method for further use
      g = 'G'; 
    }
   else if (rand ==6) { //if the random number generated a 6, the letter will be 'H' and it will be sent back to the main method for further use
      g = 'H'; 
    }
   else if (rand ==7) { //if the random number generated a 7, the letter will be 'J' and it will be sent back to the main method for further use
      g = 'J'; 
    }
   else if (rand ==8) { //if the random number generated a 8, the letter will be 'K' and it will be sent back to the main method for further use
      g = 'K'; 
    }
   else if (rand ==9) { //if the random number generated a 9, the letter will be 'L' and it will be sent back to the main method for further use
      g = 'L'; 
    }
   else if (rand ==10) { //if the random number generated a 10, the letter will be 'M' and it will be sent back to the main method for further use
      g = 'M'; 
    }
   else if (rand ==11) { //if the random number generated a 11, the letter will be 'N' and it will be sent back to the main method for further use
      g = 'N'; 
    }
   else if (rand ==12) { //if the random number generated a 12, the letter will be 'P' and it will be sent back to the main method for further use
      g = 'P'; 
    }
   else if (rand ==13) { //if the random number generated a 13, the letter will be 'Q' and it will be sent back to the main method for further use
      g = 'Q'; 
    }
   else if (rand ==14) { //if the random number generated a 14, the letter will be 'R' and it will be sent back to the main method for further use
      g = 'R'; 
    }
   else if (rand ==15) { //if the random number generated a 15, the letter will be 'S' and it will be sent back to the main method for further use
      g = 'S'; 
    }
   else if (rand ==16) { //if the random number generated a 16, the letter will be 'T' and it will be sent back to the main method for further use
      g = 'T'; 
    }
   else if (rand ==17) { //if the random number generated a 17, the letter will be 'V' and it will be sent back to the main method for further use
      g = 'V'; 
    }
   else if (rand ==18) { //if the random number generated a 18, the letter will be 'W' and it will be sent back to the main method for further use
      g = 'W'; 
    }
   else if (rand ==19) { //if the random number generated a 19, the letter will be 'X' and it will be sent back to the main method for further use
      g = 'X'; 
    }
   else if (rand ==20) { //if the random number generated a 20, the letter will be 'Y' and it will be sent back to the main method for further use
      g = 'Y'; 
    }
   else if (rand ==21) { //if the random number generated a 21, the letter will be 'Z' and it will be sent back to the main method for further use
      g = 'Z'; 
    }   
    return g; //return the value stored in the variable from the if statements above
  }
  
  public static char GuessC() { //method for the user to guess a constant
    Scanner Sc = new Scanner(System.in); //declare a scanner so it can store the user's input in a variable so it can be returned to the main method for other uses
    char G; //declare a variable to store the value that will be returned into the main method for future use
    System.out.println("Which constant do you want to guess?"); //print the instruction to the user on which constatn he wants to guess
    do { //start a do while loop for errors such as the user inputting a vowel
    G = Sc.next().charAt(0); //use the scanner Sc to record what the user types into the char variable
    if ((G ==('A')) ||(G ==('E')) ||(G ==('I')) ||(G ==('O')) ||(G ==('U'))) { //if the letter guessed is a vowel, this if statement will be true and activate, if not, the code continues
      System.out.println("Letter choosed is not a constant, please try again"); //this tells the user that the letter he inputted in invalid and he will have to type it again
    }
    } while ((G ==('A')) ||(G ==('E')) ||(G ==('I')) ||(G ==('O')) ||(G ==('U'))); //for the user to stay in this loop until he has entered a constant
    Sc.close(); // close the scanner since it will not be used again and for the warning message to go away
    return G; // return the stored value into the main method so it can be used by other methods
  }
  public static char GuessV() { //method for the user to guess a vowel and return it back into the main method so it can be used by other methods
    Scanner Sc = new Scanner(System.in);// declare a scanner so it can record user input snd store it in a variable that can be used in the main method so it can be used my other methods
    System.out.println("Which vowel do you want to buy?"); //ask user which vowel does he want to buy by outputting it on the screen using System.out.println
    char G; //declare a variable to store the guessed variable so it can be return to the main method so it can be used by other methods
    
    do { //start a do while loop to catch any errors such as inputting a constant
    G = Sc.next().charAt(0); //use scanner Sc to record user input so it can be returned to the main method so it can be used by other methods
    
    if ((G !=('A')) &&(G !=('E')) && (G !=('I')) &&(G !=('O')) &&(G !=('U'))) { //this if loop is for the error that the letter inputted is not a vowel and if true, this if loop will execute
      System.out.println("Invalid, letter choosed is not a vowel. please try again"); //this tell the user that the value inputted is invalid and the letter the user want to guess will have to be inputted again
    }
    
    } while ((G !=('A')) &&(G !=('E')) && (G !=('I')) &&(G !=('O')) &&(G !=('U'))); //so if the letter guessed is not a vowel, it will run again so the user will have to keep inputting the value until it is valid
    Sc.close(); // close the scanner since it will not be used again
    return G; // this will return the letter the user wants to guess to the main method where it can be used by other methods
  }
  
  public static String GuessW() { // this method is for the user to guess a word and return it to the main method so other methods can use it
    Scanner Sc = new Scanner(System.in); // this declares a scanner to record what the user inputted
    System.out.println("Which word do you want to guess"); //this tells the user what to do. in this case, it is telling the user to guess a word by outputting the message on the screen using System.out.println
    String gu; //this will store what the user eneters so it can be reuturned to the main method so other users can use it
    gu = Sc.next(); //this will record what the user want to guess so it can be returned to the main method so other methods can use it
    Sc.close(); // this will close the scanner since it will not be used again
    return gu; //this will return the string that the user entered to the main method to see if the user guessed the word right
  } 
  
  public static int Option(int TotalMoney) { //this will ask the user what the user want to buy a vowel, guess a constant, or guess the word
    Scanner Sc = new Scanner(System.in); // this declare a scanner so it can record user input so it can be returned to the main method so other methods can use it
    int optionM; //declare a variable to record what the user want to do so it can be returned to the main method so other methods can use it
    optionM = 0; //initiate the variable first so it can be used to record a value later on
    char choose1; //declare  a char to record what the user want to do so it can be returned to the main method so other methods can use it
    System.out.println("Type 'v' to buy a vowel, type 'c' to guess a constant, and type 'w' to guess the word"); //this tells the user the instruction about what to do
    choose1 = Sc.next().charAt(0);//this uses the scanner Sc to record what the user want to do
    if (choose1 == 'v') { // if the user want to guess a vowel, the option will be 1 which will be returned to the main method and trigger a method
      optionM = 1; //make the option 1 so it can be returned to the main method and trigger a method
    }
    else if (choose1 == 'c') { // if the letter recorded is c, the if loop will run
      optionM = 2; // make the option 2 so it can be returned to the main method and trigger a method
    }
    else if (choose1 == 'w') { // if loop will run if the letter recorded is w
      optionM = 3; // make the option 3 so it can be returned to the main method and trigger a method
    }
    if ((TotalMoney < 250) &&(optionM ==1)) { // if the user chose toe guess an vowel and the user does not have enough money to buy a vowel, this loop will activate
      optionM = 4; // this let option =4 so it can be returned to the main method and trigger a method
    }
    Sc.close(); // this closes the scanner since it will not be used again
    return optionM; // this will return the option value to the main method so it can trigger a method in the main method
  }
  
  public static int SpinResult(int spin) { //this will tell the user how the wheel spin turned out
    int choose = 0; //declare a variable to return to the main method so it can be used by other methods
    if (spin == 1) { //this loop will activate if the user landed on a bankrupt square when spinning the wheel
      System.out.println("You landed on bankrupt and you lost all your money. computer's turn"); //this will tell the user that the user landed on a bankrupt square by using System.out.println
      choose = 1; //this will make what happend in the main method by making the returning variable 1 and this will trigger a method or if loop
    }
    else if (spin ==2) { // of this else if loop is executed, it mean that the user landed on a miss a turn square on the wheel
      System.out.println("You landed on lose a turn and you lose a turn");  // this tell the user that he landed on a miss a turn square when spinning the wheel by using System.out.println
      choose = 2; // this will make the variable return into the main method =2 so it can trigger an if loop or a method
    }
    else { // the else loop will run if non of the if loops ar executed, meaning the user did not land on a bankrupt of miss a turn square
      System.out.println(" "); // this will outprint a space os the letters will not be squished
      System.out.println("You spun " + spin + " on the wheel"); // this will tell the user what value the user has spun on the wheel
      choose = 3; // this will make the value returned to the main method equal to 3 so it will trigger an if loop or a method
    }
    return choose; // this will return the value from the method to the main method so it can be used by other methods
  }
  
  public static int spin(int s) { // wheel spin method to return what the used spun ont he wheel
    Random rand2 = new Random(); //declare a random number generator to generate a random number
    int RandNumber, spin; // declare some variables that will be used in the method
    spin = 0; //initiate a variable so it can be later used to stor a value
    RandNumber = rand2.nextInt(24) + 1; // tell the parameters of the random number
    
    if (RandNumber ==1 ) { // if the randmumber is 1, this if statement will execute
      spin =1; //bankrupt
    }
    else if (RandNumber ==2 ) {// if the randmumber is 2, this if statement will execute
      spin =1; //bankrupt
    }
    else if (RandNumber ==3 ) {// if the randmumber is 3, this if statement will execute
      spin =2; //lose a turn
    }
    else if (RandNumber ==4 ) {// if the randmumber is 4, this if statement will execute
      spin = 500;// let the return variable be this value
    }
    else if (RandNumber ==5 ) {// if the randmumber is 5, this if statement will execute
      spin = 500;// let the return variable be this value
    }
    else if (RandNumber ==6 ) {// if the randmumber is 6, this if statement will execute
      spin = 500;// let the return variable be this value
    }
    else if (RandNumber == 7 ) {// if the randmumber is 7, this if statement will execute
      spin = 550;// let the return variable be this value
    }
    else if (RandNumber ==8 ) {// if the randmumber is 8, this if statement will execute
      spin = 550;// let the return variable be this value
    }
    else if (RandNumber ==9 ) {// if the randmumber is 9, this if statement will execute
      spin = 550;// let the return variable be this value
    }
    else if (RandNumber ==10 ) {// if the randmumber is 10, this if statement will execute
      spin = 600;// let the return variable be this value
    }
    else if (RandNumber ==11 ) {// if the randmumber is 11, this if statement will execute
      spin = 600;// let the return variable be this value
    }
    else if (RandNumber ==12 ) {// if the randmumber is 12, this if statement will execute
      spin = 600;// let the return variable be this value
    }
    else if (RandNumber ==13 ) {// if the randmumber is 13, this if statement will execute
      spin = 650;// let the return variable be this value
    }
    else if (RandNumber ==14 ) {// if the randmumber is 14, this if statement will execute
      spin = 650;// let the return variable be this value
    }
    else if (RandNumber ==15 ) {// if the randmumber is 15, this if statement will execute
      spin = 650;// let the return variable be this value
    }
    else if (RandNumber ==16 ) {// if the randmumber is 16, this if statement will execute
      spin = 700;// let the return variable be this value
    }
    else if (RandNumber ==17 ) {// if the randmumber is 17, this if statement will execute
      spin = 700;// let the return variable be this value
    }
    else if (RandNumber ==18 ) {// if the randmumber is 18, this if statement will execute
      spin = 750;// let the return variable be this value
    }
    else if (RandNumber ==19 ) {// if the randmumber is 19, this if statement will execute
      spin = 750;// let the return variable be this value
    }
    else if (RandNumber ==20 ) {// if the randmumber is 20, this if statement will execute
      spin = 800;// let the return variable be this value
    }
    else if (RandNumber ==21 ) {// if the randmumber is 21, this if statement will execute
      spin = 800;// let the return variable be this value
    }
    else if (RandNumber ==22 ) {// if the randmumber is 22, this if statement will execute
      spin = 850;// let the return variable be this value
    }
    else if (RandNumber ==23 ) {// if the randmumber is 23, this if statement will execute
      spin = 900;// let the return variable be this value
    }
    else if (RandNumber ==24 ) {// if the randmumber is 24, this if statement will execute
      spin = 3; // for the maximum value spin
    }
    if (spin ==3 && s == 0) { // if both these statements are true, the if statement will execute
      spin = 2500; // for the round 1 maximum spin value
    }
    if (spin == 3 && s == 1) {// if both these statements are true, the if statement will execute
      spin = 3500;// for the round 2 maximum spin value
    }
    if (spin == 3 && s == 2) {// if both these statements are true, the if statement will execute
      spin = 5000;// for the round 3 maximum spin value
    }
    return spin; // return the spun value the main method so other methods can use it
  }
  public static String puzzle() { //method for puzzle generation
    Random rand1 = new Random(); //declare a random number generator to generate a puzzle
    int RandNumber; // declare a needed variable
    String puzzle; // declare a needed variable
    puzzle = null; // initiate the variable so it can store a value later
    RandNumber = rand1.nextInt(25) + 1; // tell the parameters for the random number
    if (RandNumber ==1 ) { // if the randnumber is 1, the if statement will execute
      puzzle = "OTTAWA"; //make the puzzle this value
    }
    else if (RandNumber ==2 ) {// if the randnumber is 2, the if statement will execute
      puzzle = "WASHINGTON";//make the puzzle this value
    }
    else if (RandNumber ==3 ) {// if the randnumber is 3, the if statement will execute
      puzzle = "NUUK";//make the puzzle this value
    }
    else if (RandNumber ==4 ) {// if the randnumber is 4, the if statement will execute
      puzzle = "BEIJING";//make the puzzle this value
    }
    else if (RandNumber ==5 ) {// if the randnumber is 5, the if statement will execute
      puzzle = "SEOUL";//make the puzzle this value
    }
    else if (RandNumber ==6 ) {// if the randnumber is 6, the if statement will execute
      puzzle = "MOSCOW";//make the puzzle this value
    }
    else if (RandNumber ==7 ) {// if the randnumber is 7, the if statement will execute
      puzzle = "KIEV";//make the puzzle this value
    }
    else if (RandNumber ==8 ) {// if the randnumber is 8, the if statement will execute
      puzzle = "LONDON";//make the puzzle this value
    }
    else if (RandNumber ==9 ) {// if the randnumber is 9, the if statement will execute
      puzzle = "PARIS";//make the puzzle this value
    }
    else if (RandNumber ==10 ) {// if the randnumber is 10, the if statement will execute
      puzzle = "ROME";//make the puzzle this value
    }
    else if (RandNumber ==11 ) {// if the randnumber is 11, the if statement will execute
      puzzle = "REYKJAVIK";//make the puzzle this value
    }
    else if (RandNumber ==12 ) {// if the randnumber is 12, the if statement will execute
      puzzle = "OSLO";//make the puzzle this value
    }
    else if (RandNumber ==13 ) {// if the randnumber is 13, the if statement will execute
      puzzle = "HELSINKI";//make the puzzle this value
    }
    else if (RandNumber ==14 ) {// if the randnumber is 14, the if statement will execute
      puzzle = "STOCKHOLM";//make the puzzle this value
    }
    else if (RandNumber ==15 ) {// if the randnumber is 15, the if statement will execute
      puzzle = "MADRID";//make the puzzle this value
    }
    else if (RandNumber ==16 ) {// if the randnumber is 16, the if statement will execute
      puzzle = "LISBON";//make the puzzle this value
    }
    else if (RandNumber ==17 ) {// if the randnumber is 17, the if statement will execute
      puzzle = "COPENHAGEN";//make the puzzle this value
    }
    else if (RandNumber ==18 ) {// if the randnumber is 18, the if statement will execute
      puzzle = "AMSTERDAM";//make the puzzle this value
    }
    else if (RandNumber ==19 ) {// if the randnumber is 19, the if statement will execute
      puzzle = "BUDAPEST";//make the puzzle this value
    }
    else if (RandNumber ==20 ) {// if the randnumber is 20, the if statement will execute
      puzzle = "VIENNA";//make the puzzle this value
    }
    else if (RandNumber ==21 ) {// if the randnumber is 21, the if statement will execute
      puzzle = "BERLIN";//make the puzzle this value
    }
    else if (RandNumber ==22 ) {// if the randnumber is 22, the if statement will execute
      puzzle = "JAKARTA";//make the puzzle this value
    }
    else if (RandNumber ==23 ) {// if the randnumber is 23, the if statement will execute
      puzzle = "TOKYO";//make the puzzle this value
    }
    else if (RandNumber ==24 ) {// if the randnumber is 24, the if statement will execute
      puzzle = "CANBERRA";//make the puzzle this value
    }
    else if (RandNumber ==25 ) {// if the randnumber is 25, the if statement will execute
      puzzle = "WARSAW";//make the puzzle this value
    }
    System.out.println(puzzle);
    return puzzle; //return the value from the method to the main method so other methods can use it
  }
  
  public static void main(String args []) { //start the main method
    //declare an initiate some variable and scanners and random number generators
    Random rand2 = new Random();
    int RandNumber2;
    RandNumber2 = 0;
    Scanner Sc = new Scanner(System.in);
    int wheel, TotalMoney, ComputerMoney, option, choose, turn, GuessedRight, TotalGuessed, CompRoundMoney, t, RoundMoney;
    ComputerMoney = 0;
    CompRoundMoney = 0;
    RoundMoney = 0;
    GuessedRight = 0;
    turn = 1;
    choose = 0;
    t = 0;    
    TotalMoney = 0;
    String startv, puzzle, GuessWord, ComputerGuess, PlayAgain;
    GuessWord = null;
    char v, CompC, CompV;
    boolean repeat = false;
    v = ' ';
    //explain rules of the game
    System.out.println("Welcome to the wheel of fortune! game rules are below");
    System.out.println("Contestant spin wheel to determine a dollar value that determins how much money they will earn with each letter guessed right");
    System.out.println("Contestant calls a letter, if correct you get money for every letter in the phrase");
    System.out.println("If contestants earned prize money, then they can buy vowels for $250");
    System.out.println("Control of the wheel moves to the next contestant when wheel lands on Bankrupt, lose a turn or an incorrect letter is called");
    System.out.println("The contestant that solves the puzzle keeps the prize money they've earned");
    System.out.println("there are 3 rounds per game, give the contestant the option to play again");
    System.out.println("the player with the most money after 3 rounds wins the game");
    do {
    do { // ask user to begin the game
      System.out.println("type 'start' to begin");//tell user what to do
      startv = Sc.next(); //record user input
    } while (!startv.equals("start")); //do this loop until the user types start ti begin game
    
    for (int s = 0; s < 3; s++) { //the for loop for 3 rounds
      TotalGuessed=0; //set the total number of guessed letters to 0
      
      //reset every round
      System.out.println("Round " + (s+1)); //print what round it is
      puzzle = puzzle(); //method for puzzle generator   
      int PuzzleLength = puzzle.length(); // for length of the word
      char[] WordChar = new char[PuzzleLength]; //create array to store the puzzle word
      char[] WordDashed = new char[PuzzleLength];// creat array to put dashed for the number of letters in he word and turn to letters when guessed
      for (int i = 0; i < PuzzleLength; i++) { //put puzzle into chars
        WordChar[i] = puzzle.charAt(i); //put the puzzle into the char array
      }
      for (int i = 0; i < PuzzleLength; i++) { //dashed version to show
        WordDashed[i] = '-'; //put a dash for how many letters there are in the puzzle
      }
      for (int w = 0; w < PuzzleLength; w++) { //print the dashed word for the user to see
        System.out.print(WordDashed[w]); 
      }
      System.out.println(" "); //leave space for clarity
      
      do { //every spin
        do {
          wheel = spin(s); //method for wheel spin
          if (turn == 1) {
            //tell user how much money you have and what the guessed letters are
            System.out.println("You have " + TotalMoney + " dollars");
            System.out.println("guessed letters are ");
            for ( int i = 0; i < 26; i++) {//printout the guessed letters
              System.out.print(chosen[i] + " "); 
            }
            choose = SpinResult(wheel); // method for telling player about spin results
          } 
            
          
          if (choose ==1) { //this is for bankrupt
            //player lose turn and all the money they got
            turn = 2;
            TotalMoney = 0;
          }
          if (choose ==2) {//this is for lose a turn
            //player will lose a turn and the computer will now pick a letter
            turn = 2; 
          }
          if (turn == 1) { //if the player still has the turn, the player can choose a letter
            option = Option(TotalMoney); // let user choose option of letter or word
            
            if (option ==1) { //for user guessing a vowel
              v = GuessV(); //input vowel into method
              TotalMoney = TotalMoney - 250;//subtract 250 from total money because you need to buy one
              chosen[t] = v;//store the guessed value
              t = t + 1; //increase counter so new guessed characters will not replace old ones
            }
            else if (option ==2) { //for user guessing a constant
              v = GuessC();  //use method for guessed letter
              chosen[t] = v; //store the guessed letter in an array for future reference
              t = t + 1; //increase counter so the new characters will not replace the olds ones
            }
            else if (option ==3) { //this is for gussing a word
              GuessWord = GuessW();//use method for guessing word
            }
            else { //for users that want to buy a vowel but do not have money for it
              System.out.println("invalid, you do not have enough money for a vowel, computer's turn"); //tell user that you lost your turn
              turn = 2; //make the turn go to the computer
            }
            if((option ==1) ||(option ==2)) { //for finding repeating letters
              repeat = findRepeat(v, t); //method for finding repeating letters
              
              if (repeat == true) { //if the method returns true, it mean there is a repeating letter
                System.out.println("You already guessed this letter. computer's turn"); //tell the user that you guessed a repeating letter
                turn = 2; //make the turn go to the computer
                t = t -1; //eraser the counter so there will be no duplicates is the guessed array
                chosen[t] = ' '; //make the value be a space again
              }
              
              else { //if there is no repetition, this else statement will execute
                for (int b = 0; b < PuzzleLength; b++) { // check for how many letters right
                  if(WordChar[b] == v) { //if on of the letters match
                    WordDashed[b] = v; //changed the dashed version of the puzzle into the letter
                    GuessedRight = GuessedRight + 1; //add 1 to the guess right, if guessed right = total number of letters, the user win the round, this on is for the current spin
                    TotalGuessed = TotalGuessed + 1;// the total number of guessed letters goes up by one for every letter guessed rigth
                  }      
                }
              }
            }
            if (turn ==1) { //so if the player lost his turn, this if statement will not execute
              if ((option ==1) ||(option ==2)) { //for telling user if he got any letters right so it is for guessing a vowel or conetant
                System.out.println("you got " + GuessedRight + " letters correct"); //tell user how many letters he got right
                if (GuessedRight > 0) { //if the user guessed 1 or more letters right, the user can guess again
                  System.out.print(" Guess again ");// this tells the user that he can guess again
                }
                
                else {// this statement will execute if the user didnt get anything right
                  System.out.println("You lost your turn because you guessed nothing right");//tell the user that you loset your turn because you didnt get anything right
                  turn = 2;//make the turn go to the computer
                }
                TotalMoney = wheel*GuessedRight + TotalMoney; //add money for how many letters right multiply by the wheel spin value
                RoundMoney = wheel*GuessedRight + RoundMoney; //this money will only be kept if the user win the round and will be reset every round
                GuessedRight = 0;//set the guessed rigth for every spin back to 0
                
                for (int y = 0; y < PuzzleLength; y++) { //print out the wolrd after the guess
                  System.out.print(WordDashed[y]); 
                }
              } 
              if(option ==3) { //this is statement will execute if the user is guessing th word
                if ((GuessWord).equals(puzzle)) { //this statement will execute if the user guessed the word right
                  System.out.println("You guessed it right!"); //tell the user that he got the word right
                  turn =2; //since this wins, the turn now go to the computer
                  System.out.println(puzzle); //print out what the puzzle is
                  TotalGuessed = PuzzleLength; //make the letters guessed rigth equal to the puzzle length because user guessed the puzzle right
                  for (int k = 0; k < PuzzleLength; k++) { //input the word in char into the word dashed since the user got the word right
                    WordDashed[k] = WordChar[k]; //make the word dashed version of the array equal to the word char version that contain the puzzle word
                  }
                }
                else { //this else statement is for the user not guessing the rigth word
                  System.out.println("You did not get it right. Computer's turn"); //this tell the user that the turn goes to the computer
                  turn = 2; //make the turn go to the computer
                }
              }
              
            }
          }
        } while(turn ==1); //keep spinning the wheel if the turn is still the user's
        
        if (TotalGuessed != PuzzleLength) { //if the word is not completely guessed, the computer will go
          while(turn ==2) { //the turn = 2 is for the computer
            System.out.println("Computer's turn"); //tell user that it is the computer's turn
            
            RandNumber2 = rand2.nextInt(3) + 1; //add random numer generator to see which option the computer chooses
            wheel = spin(s); //method for wheel spin
            System.out.println("Computer have " + ComputerMoney + " dollars"); //print out how much money the computer wins
            
            if(ComputerMoney < 250) {//this is for computer choose to buy a vowel but not having enough money for it, then it will guess a constant
              RandNumber2 = 1; //make the randnumber change making the computer guess a constant
            }
            if (RandNumber2 == 1) { //if the randnumber is 1, the computer will guess a constant      
              CompC = ComputerConstant();//method to simulate computer choosing a constant
              chosen[t] = CompC; //input the guessed character into the array of guessed characters
              t = t + 1; //increase the array counter
              
              System.out.println("Computer guesses constant " + CompC);//tell user that the computer guessed
              repeat = findRepeat(CompC, t); //method to see if there is a repeat
              
              if (repeat == true) { //this if statement is for there is a repeat
                System.out.println("Computer guessed a repeating letter, your turn"); //tell user that the computer has lost its turn
                turn = 1; //make the ruen back to 1 which is user's turn
                t = t - 1; //decrease the guessed characters array so there will be no duplicates
                chosen[t] = ' '; //make the duplicated charater equal a space
                GuessedRight = 0; //make the guessed right equal to 0 so computer will not get any money for repeated characters guessed
              }
              
              if (turn ==2) { //if the computer still has its turn, this will count how many letters it guessed right
                for (int b = 0; b < PuzzleLength; b++) { //check the char array that holds the puzzle to see if there are any right letters
                  if(WordChar[b] == CompC) { //if the guessed word equals a spot on the array, the computer guessed a letter right
                    WordDashed[b] = CompC; //make the displayed char contain the character
                    GuessedRight = GuessedRight + 1; //increase guessed right for this spin to add money
                    TotalGuessed = TotalGuessed + 1; //increase total guess right to end the loop for the round when all the letters are guessed
                  }      
                }
                
                System.out.println("Computer guessed " + GuessedRight + " letters right"); //tell the user what the computer guessed
                if (GuessedRight ==0) { //if the computer did not guess anything right, this loop will execute
                  System.out.println("The computer did not guess anything right. your turn"); //tell the user that the computer did not guess anything right
                  turn = 1; //make the turn = 1 which is making the turn go back to the user
                }
                else { //this is for the computer guessing a letter right and it can guess again
                  System.out.println("Computer guess again"); //tell the user that the computer guessed  letter(s) right
                  ComputerMoney = ComputerMoney + wheel*GuessedRight; //add moey for how many letters gotten rigth *what the computer got on the wheel spin
                }
              }
              GuessedRight = 0;//reset the guessed right so no extra money is given
              
            }
            if (RandNumber2 == 2) {//this is for the computer guessing a vowel
              
              ComputerMoney = ComputerMoney - 250;//decrease 250 from money because you need to buy a vowel
              CompV = ComputerVowel();//method for simulating computer gussing a vowel
              chosen[t] = CompV; // add the guessed letter into the array of guessed letters
              t = t + 1; //increase the counter for the guessed characters array
              repeat = findRepeat(CompV, t); //method for finding repeats
              System.out.println("Computer buys the vowel " + CompV); //tell the user that the computer bought a vowel
              
              if (repeat = true) {//if the repeat comes back true, the turn goes back to the user
                System.out.println("Computer guessed a repeating letter. your turn");//tell the user that the computer lost its turn
                turn = 1; //make the turn equal to 1 which is giving the user his turn back
                t = t - 1;//decrease the counter for the guessed characters array
                chosen[t] = ' ';//make the recently guessed character equal to a space again to remove the duplicate
                GuessedRight = 0;//make the guessed right equal to 0 again
              }
              
              
              if (turn == 2) { //if the computer still has its turn, this will execute
                for (int b = 0; b < PuzzleLength; b++) { //finds how many letter right
                  if(WordChar[b] == CompV) { // if the guessed letter equals a letter in the puzzle
                    WordDashed[b] = CompV; //display the letter guessed right
                    GuessedRight = GuessedRight + 1; //increase the guessed right for money
                    TotalGuessed = TotalGuessed + 1;//increase the total guessed right for thr round
                  }      
                }
                
                System.out.println("Computer guessed " + GuessedRight + " letters right"); //tell user how many letters the computer got right
                if (GuessedRight ==0) { //this is for the coputer not guessing anything right
                  System.out.println("The computer did not guess anything right. your turn");//tell use that the computer lost its turn
                  turn = 1; //make the turn go back to the user
                }
                else { //this is for the compupter getting something right
                  System.out.println("Computer guess again "); //this tell the user that the computr will guess again
                  ComputerMoney = ComputerMoney + wheel*GuessedRight; //add money for the round so it under 1000, it will add 1000
                  CompRoundMoney = CompRoundMoney + wheel*GuessedRight; //total money for the 3 rounds
                }
              }
            }
            GuessedRight = 0; //turn the guessed right into 0 again so there is no extra money given
            if ((RandNumber2 ==1) ||(RandNumber2 ==2)) { //if the computer guessed a letter, it will display the dashed version of the char again
              for (int a = 0; a < PuzzleLength; a++) { //for loop for displaying the char array
                System.out.print(WordDashed[a]); //print out the word
              }
            }
            
            if (RandNumber2 == 3) {//this is for the computer guessing the word
              System.out.println("Computer guess the word ");// tel the user that the computer is guessing a word
              ComputerGuess = puzzle();//method for stimulating computer guessing a word
              System.out.println(ComputerGuess); //print out what the computer guessed
              if ((puzzle).equals(ComputerGuess)) { //if the computer guessed it right, the if loop will execute
                System.out.println(puzzle); //printout the puzzle
                System.out.println("Computer guessed it right. you lose round " + (s + 1));//tell the user that the computer has won the round
                turn = 1; //make the turn back to you since you lose
                TotalGuessed = PuzzleLength; //make the total guessed = to puzzle to end the loop for th round
              }
              else if (!(puzzle).equals(ComputerGuess)) { //this if statement will execute if the computer guess does not equal to the puzzle word
                System.out.println("computer guessed wrong, your turn"); //tell the user that the computer didnt guess the right word
                turn = 1; //make the trun back to you again
              }
            }
          }
        }
             
      } while (TotalGuessed != PuzzleLength); //the round loop and it will stay until all the letters are guessed for the puzzle word is guessed right
      
      for (int y = 0; y < 24; y++) { //this will reset every round for the guessed letters
        chosen[y] = ' '; //make the guessed letters back to a space
      }  
      
      if(turn ==1) { //if it is your turn after the round, user lost
        //tell user that the user lost
        System.out.println("You did not win the round. computer keeps the money won in this round");
        if (CompRoundMoney < 1000) { //if the money earned this round is below 1000
          System.out.println("computer get 1000 dollar minimum prize for winning the round"); //give computer money for winning
          ComputerMoney = ComputerMoney - CompRoundMoney + 1000; // add computer money to include the 1000 minimum prive for every round
        }
        TotalMoney = TotalMoney - RoundMoney;//subtract the money the user earned this round because the user did not win
        if(TotalMoney < 0) { //if it becomes negative from a bankrupt, it will become  0
          TotalMoney = 0; //make the total money = to 0
        }
      }
      if(turn == 2) {//if it is the computer's turn after the round, you have won the round
        System.out.println("You won this round. you get to keep your money"); //tell user that he have won
        if (RoundMoney < 1000) { //if the round money is less than1000
          System.out.println("you get 1000 dollars for your minimum prize of winning the round"); //tell user that he gets the minimum prize
          TotalMoney = TotalMoney - RoundMoney + 1000; //add the 1000 minimum prize
        }
        ComputerMoney = ComputerMoney - CompRoundMoney; //subtract the computer's winning's for the round because the computer didnt win
        if(ComputerMoney < 0) { //if the computer's money is below 1000 because of bankrupt, it will execute
          ComputerMoney = 0;  //make the computer's money be equal to 0 again
        }
      }
      RoundMoney = 0; //reset the round money to be 0;
      t = 0; //reset the counter for the guessed letters array to be 0
      CompRoundMoney = 0; //reset the round money for the computer to be 0
    }//for loop 3 rounds
    
    if(TotalMoney > ComputerMoney) { //if you have more money, you won
      System.out.println("You won");  //tell the user that uer won
    }
    else { //if you have less money than computer, you lost
      System.out.println("you lose"); //tell user that you lost
    }
    System.out.println("Do you want to play again? if yes type 'yes'. if not, type anything else");//ask user to play again
    PlayAgain = Sc.next(); //use scanner Sc to record user input
    //resetting variables for new round
    t = 0;
    TotalMoney = 0;
    ComputerMoney = 0;
    for (int i = 0; i < 26; i++) {
     chosen[i] = ' '; 
    }
    turn = 1;
    } while(PlayAgain.equals("yes"));//if the user want to play again, this loop will run again
    //ask user to play again and reset all variables
    Sc.close();//close the scanner since there is no more use for it anymore
  }
}
