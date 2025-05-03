public class QuizeGame {

    public static void main(String[] args) {

        int score = 0;
        int[] answer = {4, 10, 25}; // Fixed typo in variable name

        String[] questions = {
            "What is 2 + 2?",
            "What is 5 * 2?",
            "What is 5 squared?"
        };
        System.out.println("== Quiz Game =="); // Fixed typo in "Quiz"

        for (int i = 0; i < 3; i++) { // Fixed missing loop variable declaration
            System.out.println(questions[i]); // Fixed typo in variable name
            int useranswer = i + 4; // Simulated user input
            System.out.println("Your answer: " + useranswer);

            if (useranswer == -1) {
                System.out.println("Quiz Ended");
                break;
            }

            if (useranswer == answer[i]) { // Fixed typo in variable name
                score += 10;
                System.out.println("Correct");
            } else {
                System.out.println("Wrong, correct answer is " + answer[i]); // Fixed typo in "corrent"
            }
        }

        System.out.println("Final score: " + score); // Moved outside the loop
    }
}