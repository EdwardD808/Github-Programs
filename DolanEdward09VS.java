import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Creates an array containing NUM_OF_SCORES exam scores and finds the 
 * average of the scores in that array. NUM_OF_SCORES can be changed to any
 * positive number to ask the user for that amount of scores to average.
 * When the user enters exam scores, only numbers 0 to 100 are accepted.
 * All other numbers will give an error saying to enter a valid number. 
 * Words are not accepted as input for exam scores. 
 * InputMismatchException gets caught and an error gets printed to the user
 * telling them to enter a number.
 * 
 * @author     Dolan, Edward
 * @assignment ICS 111 Assignment 09
 * @date       4/11/23
 */

public class DolanEdward09 {
  public static void main(String[] args) {
    // Constant variable that can be changed to ask the user for that number
    // or scores.
    final int NUM_OF_SCORES = 5;
    // Creates the array to hold the scores that the user will input.
    double[] examScores = new double[NUM_OF_SCORES];
    
    System.out.printf("Enter %d exam scores to calculate the average. " + 
                      "(valid scores are from 0 to 100)%n", NUM_OF_SCORES);
    
    int i = 0;
    // while loop that goes through each score the user enters to check if
    // it is between 0 and 100. It will add the score to the array and let
    // the user input the next score if it is valid. 
    while (i < NUM_OF_SCORES) {
      try {
        // Creates the Scanner object to reads the user's input from the
        // keyboard.
        Scanner reader = new Scanner(System.in);
        System.out.printf("Enter exam score #%d: ", i + 1);
        
        // Stores each score in a temporay variable to check for validity
        // before adding to the array. 
        double inputScore = reader.nextDouble();
        
        // Start of the if-else that checks to see if each score is between
        // 0 and 100. If not, it prints an error message and will not
        // continue asking for scores until the number is valid.
        if (inputScore < 0 || inputScore > 100) {
          System.out.println("Error: Please input a valid score between " +
                             "0 and 100.");
        } // Closes if.
        // Adds the inputted exam score to the array and moves to the next
        // score if it is between 0 and 100. 
        else {
          examScores[i] = inputScore;
          i++;
        } // Closes else.
      } // Closes try.
      // prints an error message to the user and continues to run the 
      // program, instead of crashing, when the user enters words instead 
      // of a valid score.
      catch (InputMismatchException ie) {
        System.out.println("Error: Please enter a number.");
      } // Closes catch.
    } // Closes while.
    
    double sumOfScores = 0;
    
    // for loop that adds all the scores contained in the completed array
    // in preparation for finding the average of the scores.
    for (i = 0; i < examScores.length; i++) {
      
      // // Holds the value of all scores of the examScores array added 
      // together. 
      sumOfScores = sumOfScores + examScores[i];
      
    } // Closes for. 
    
    double examAverage = 0;
    // Finds the average of the previously entered exam scores using the 
    // formula sum of scores divided by number of scores entered and them
    // prints that result to the user. 
    examAverage = sumOfScores / NUM_OF_SCORES;
    System.out.printf("%nExam average: %.2f", examAverage);
    
    // for loop that prints back all previously entered scores to the user
    // starting with the last score entered and ending with the first. 
    for (i = examScores.length - 1; i >= 0; i--) {
      System.out.printf("%nExam score #%d: %.2f", i + 1, examScores[i]);
    } // Closes for.
  } // Closes main.
} // Closes class.