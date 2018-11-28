package Model;

import java.util.HashMap;
import java.util.Map;



public class DB {
    Map<QuestionSet, Map<String, Boolean>> questionLibrary;
    private int correctAnswer;


    public DB(){
        initLibrary();
    }

    public void initLibrary(){
        questionLibrary = new HashMap<>();
        Map<String, Boolean> map1 = new HashMap<>();
        map1.put("p1.jpg", false);
        map1.put("p2.png", false);
        map1.put("p3.jpg", true);
        map1.put("p4.jpg", false);
        correctAnswer = 2;
        questionLibrary.put(QuestionSet.set1, map1);
    }

    public Map<QuestionSet, Map<String, Boolean>> getQuestionLibrary() {
        return questionLibrary;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
