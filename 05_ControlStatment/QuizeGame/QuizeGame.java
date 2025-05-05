public class QuizeGame {

    public static void main(String[] args) {

        int score = 0;
        int[] answer = {4, 10, 25};

        String[] questions = {
            "What is 2 + 2?",
            "What is 5 * 2?",
            "What is 5 squared?"
        };
        System.out.println("== Quiz Game ==");

        for (int i = 0; i < 3; i++) {
            System.out.println(questions[i]);
            int useranswer = i + 4;
            System.out.println("Your answer: " + useranswer);

            if (useranswer == -1) {
                System.out.println("Quiz Ended");
                break;
            }

            if (useranswer == answer[i]) { 
                score += 10;
                System.out.println("Correct");
            } else {
                System.out.println("Wrong, correct answer is " + answer[i]);
            }
        }

        System.out.println("Final score: " + score);
    }
}