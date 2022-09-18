package quiz;

import java.util.ArrayList;
import java.util.Arrays;

public class TrueOrFalse extends Question {

    private boolean validAnswer;

    public TrueOrFalse(String className, String questionText, boolean validAnswer) {
        super(className, questionText, new ArrayList<String>(Arrays.asList("True", "False")));
        this.validAnswer = validAnswer;
    }

    @Override
    public boolean grade() {
        if(getUserInput().equals("1") && validAnswer == true) {
            return true;
        }
        else if(getUserInput().equals("2") && validAnswer == false) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isValidAnswer() {
        return validAnswer;
    }
}
