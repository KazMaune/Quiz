package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> questions;

    public Quiz() {
        questions = new ArrayList<>();
    }

    public void quizRunner() {
        Scanner input = new Scanner(System.in);
        System.out.println("Starting quiz");
        for(int i = 0; i < questions.size(); i++) {
            Question question = questions.get(i);
            System.out.println(question.getQuestionText());
            for(int j = 0; j < question.getChoices().size(); j++) {
                System.out.println((j+1) + ": " + question.getChoices().get(j));
            }
            System.out.println("Enter your answer: ");
            question.setUserInput(input.nextLine());
        }
    }

    public void quizGrader() {
        int totalGrade = 0;
        int totalNumberOfQuestions = questions.size();
        for(int i = 0; i < totalNumberOfQuestions; i++) {
            if(questions.get(i).grade() == true) {
                totalGrade += 1;
            }
        }
        double score = Math.round(((double) totalGrade / (double) totalNumberOfQuestions * 100) * 10) / 10.0;

        System.out.println("You got " + totalGrade + " number of questions right out of " + totalNumberOfQuestions + " for a score of " + score + "%");
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }
}
