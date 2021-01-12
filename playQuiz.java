/* playQuiz.java
 * Purpose: Executes the steps necessary for the user to take a science quiz using data from the Quiz class. The user
 * should run the main method with no arguments to do so.
 * Written by: Randy Dang
 */
import java.io.*;
import java.util.*;
public class playQuiz {
    
    public static void main(String args[]) {
        //Create Quiz object using data from the Quiz class and set initial values.
        Quiz thisQuiz = new Quiz();
        int score = 0;
        int questionCount = 0;
        
        //Prompt user for number of questions, keeping it in the range between 0 and 180.
        Scanner kbReader = new Scanner(System.in);
        System.out.println("How many questions? (MAXIMUM: 180)");
        int numQuestions = kbReader.nextInt();
        if (numQuestions > 180) {
            numQuestions = 180;
        } else if (numQuestions < 0) {
            numQuestions = 0;
        }
        
        //Shuffle questions in the array.
        thisQuiz.shuffleQuestions();
        
        //Display questions from the array until the number displayed matches with the number of questions that the 
        //user wishes to answer (based on inputted number of questions). Adds to the score if the user answered correctly.
        for (int i = 1; i <= numQuestions; i++) {
            boolean correct = thisQuiz.displayQuestion(i);
            if (correct) {
                score++;
            }
        }
        
        //Display final score.
        System.out.println("YOUR SCORE: " + score + "/" + numQuestions);
    }
}