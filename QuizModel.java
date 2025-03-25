package model;

import java.util.ArrayList;
import java.util.List;

public class QuizModel {

    private List<String> questions;
    private List<String[]> options;
    private List<String> correctAnswers;

    public QuizModel() {
    
        questions = new ArrayList<>();
        options = new ArrayList<>();
        correctAnswers = new ArrayList<>();
        questions.add("Who invented Java Programming?");
        options.add(new String[]{"1.Guido van Rossum","2.James Gosling","3.Dennis Ritchie","4.Bjarne Stroustrup"});
        correctAnswers.add("2");

        questions.add("Which component is used to compile, debug and execute the java programs?");
        options.add(new String[]{"1.JIT", "2.JRE","3.JDK","4.JVM"});
        correctAnswers.add("3");

        questions.add("Which one of the following is not a Java feature?");
        options.add(new String[]{"1.Object-oriented","2.Use of pointers","3.Portable","4.Dynamic and Extensible"});
        correctAnswers.add("2");
    }
    public int getTotalQuestions() {
        return questions.size();
    }
    public String getQuestion(int index) {
        return questions.get(index);
    }
    public String[] getOptions(int index) {
        return options.get(index);
    }
    public String getCorrectAnswer(int index) {
        return correctAnswers.get(index);
    }
}