import java.util.Scanner;

/**
 * Solution class for code-eval.
 */
public final class Solution {
     /**
     * Constructs the object.
     */
    private Solution() {
        // leave this blank
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
         // instantiate this Quiz
        Quiz q = new Quiz();
         // code to read the test cases input file
        Scanner s = new Scanner(System.in);
        // check if there is one more line to process
        while (s.hasNext()) {
            // read the line
            String line = s.nextLine();
             // split the line using space
            String[] tokens = line.split(" ");
              // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "LOAD_QUESTIONS":
                System.out.println("|----------------|");
                System.out.println("| Load Questions |");
                System.out.println("|----------------|");
                loadQuestions(s, q, Integer.parseInt(tokens[1]));
                break;
                case "START_QUIZ":
                System.out.println("|------------|");
                System.out.println("| Start Quiz |");
                System.out.println("|------------|");
                startQuiz(s, q, Integer.parseInt(tokens[1]));
                break;
                case "SCORE_REPORT":
                System.out.println("|--------------|");
                System.out.println("| Score Report |");
                System.out.println("|--------------|");
                displayScore(q);
                break;
                default:
                break;
            }
        }
    }
    /**
     * Loads questions.
     *
     * @param      s              The scanner object for user input
     * @param      quiz           The quiz object
     * @param      questionCount  The question count
     */
    public static void loadQuestions(final Scanner s, final Quiz quiz, final int questionCount) {
        // write your code here to read the questions from the console
        // tokenize the question line and create the question object
        // add the question objects to the quiz class
        int count = 0;
        String[] field = new String[questionCount];        
        if(questionCount < 1) {
            System.out.println("Quiz does not have questions");
            return;
        }
        for(int i = 0; i < questionCount; i++) {
            String q = s.nextLine();
            field = q.split(":");
            }
            if(field.length != 5) {
                System.out.println("Error! Malformed question");
                return;
            }
            String[] choices = field[1].split(",");
            if(choices.length<2){
                System.out.println(field[0] + " " + "does not have enough answer choices");
                return;
            }
            if(Integer.parseInt(field[2]) < 1 || Integer.parseInt(field[2]) >= choices.length) {
                System.out.println("Error! Correct answer choice number is out of range for " + field[0]);
            }
            if(Integer.parseInt(field[3]) <= 0) {
                System.out.println("Invalid max marks for" + " " + field[0]);
                return;
            }
            if(Integer.parseInt(field[4]) > 0)
            {
                System.out.println("Invalid penalty for" + " " + field[0]);
                return;
            }
        }
    
            /*String[] field = q.split(":");
            if(Integer.parseInt(field[3]) <= 0){
                System.out.println("Invalid max marks for question about sony");
                return;
            }
            if(Integer.parseInt(field[4]) > 0)
            {
                System.out.println("Invalid max marks for question about sony");
                return;
            }
            for(int j = 0; j < field.length; j++) {
                count++;
            }
        }
        if(count != 0) {
            System.out.println("Error! Malformed question");
        }
        if(questionCount > 0) {
        System.out.println(questionCount + " are added to the quiz");
    }
    if(questionCount == 0) {
        System.out.println("Quiz does not have questions");
    }
    }*/

    /**
     * Starts a quiz.
     *
     * @param      s            The scanner object for user input
     * @param      quiz         The quiz object
     * @param      answerCount  The answer count
     */
    public static void startQuiz(final Scanner s, final Quiz quiz, final int answerCount) {
        // write your code here to display the quiz questions
        // read the user responses from the console
        // store the user respones in the quiz object
        //int choice = 4;
        for(int i = 1; i <= answerCount; i++) {
            System.out.println("question text " + i + "(" + i + ")");
            for(int j = 1; j <= 4; j++) {
                System.out.print("choice " + j + "\t");

            }System.out.println();
        }
    }

    /**
     * Displays the score report
     *
     * @param      quiz     The quiz object
     */
    public static void displayScore(final Quiz quiz) {
        // write your code here to display the score report
    }
}

class Quiz {


}
class Questions {
    Questions questions[] = new Questions[10];
}