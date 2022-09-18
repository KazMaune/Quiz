package quiz;

import java.util.ArrayList;

public abstract class Question {
    private String className;

    private String questionText;

    private String userInput;

    private ArrayList<String> choices;

    Question(String className, String questionText, ArrayList<String> choices) {
        this.className = className;
        this.questionText = questionText;
        this.choices = choices;
    }

    public abstract boolean grade();

    public String getClassName() {
        return className;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getUserInput() {
        return userInput.trim();
    }

    public ArrayList<String> getChoices() {
        return choices;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }
}
