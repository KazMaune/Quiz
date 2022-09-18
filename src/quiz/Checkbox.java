package quiz;

import java.util.ArrayList;

public class Checkbox extends Question{
    private ArrayList<String> validAnswers;

    public Checkbox(String className, String questionText, ArrayList<String> choices, ArrayList<String> validAnswers) {
        super(className, questionText, choices);
        this.validAnswers = validAnswers;
    }

    @Override
    public boolean grade() {
        String[] answers = getUserInput().split(",");
        if(answers.length != validAnswers.size()) {
            return false;
        }
        for(int i = 0; i < answers.length; i++) {
            if(!validAnswers.contains(answers[i])) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<String> getValidAnswers() {
        return validAnswers;
    }
}
