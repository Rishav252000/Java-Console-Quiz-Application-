import java.util.Scanner;

public class QuizApplication {

    public static void main(String[] args) {
        // Questions and Answers
        String[] ques = {
            "1. The Buddhist sites Vaishali and Nalanda are situated in which of the following states ?",
            "2. Jawaharlal Nehru port is located in ?",
            "3. Which of the following is the capital of the Union Territory Dadra and Nagar Haveli ?"
        };
        
        String[][] opt = {
            {"A. Bihar", "B. Chhattisgarh", "C. Telangana", "D. Odisha"},
            {"A. Kerala", "B. Maharashtra", "C. Andhra Pradesh", "D. West Bengal"},
            {"A. Port Blair ", "B. Kavaratti", "C. Daman", "D. Silvassa"}
        };
        
        char[] crtAns = {'A', 'B', 'D'};

        int score = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < ques.length; i++) {
            System.out.println(ques[i]);
            for (String option : opt[i]) {
                System.out.println(option);
            }
            System.out.print("Your answer: ");
            char answer = scanner.next().toUpperCase().charAt(0);

            if (answer == crtAns[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was: " + crtAns[i] + "\n");
            }
        }

        System.out.println("Quiz finished! Your score: " + score + "/" + ques.length);
        
        scanner.close();
    }
}
