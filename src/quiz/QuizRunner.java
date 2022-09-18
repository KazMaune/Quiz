package quiz;

import java.util.ArrayList;
import java.util.Arrays;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz newQuiz = new Quiz();
        MultipleChoice question1 = new MultipleChoice("Pokemon", "Which type is super effective against water(Select One)", new ArrayList<String>(Arrays.asList("Steel", "Electric", "Dark", "Rock")), "2");
        Checkbox question2 = new Checkbox("Pokemon", "Which of the following are valid Pokemon types(Select all that apply)", new ArrayList<String>(Arrays.asList("Ghost", "Iron", "Fairy", "Thunder")), new ArrayList<String>(Arrays.asList("1", "3")));
        TrueOrFalse question3 = new TrueOrFalse("Pokemon", "True or false, Alolan marowak is a Rock/Ghost type", false);
        newQuiz.addQuestion(question1);
        newQuiz.addQuestion(question2);
        newQuiz.addQuestion(question3);
        newQuiz.quizRunner();
        newQuiz.quizGrader();
    }
}
