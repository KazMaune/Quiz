package quiz;

import java.util.ArrayList;

public class MultipleChoice extends Question{
    private String validAnswer;

    public MultipleChoice(String className, String questionText, ArrayList<String> choices, String validAnswer) {
        super(className, questionText, choices);
        this.validAnswer = validAnswer;
    }

    @Override
    public boolean grade() {
        // validAnswer = "1"
        // userInput = "2"
        if(getUserInput().equals(validAnswer)) {
            return true;
        }
        else {
            return false;
        }
    }

    public String getValidAnswer() {
        return validAnswer;
    }
}
