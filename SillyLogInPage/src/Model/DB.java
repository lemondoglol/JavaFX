package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;



public class DB {
	private Map<QuestionSet, Map<String, Boolean>> questionLibrary;
    private int correctAnswer;
    private List<String> pictureList;

	public DB(){
		initLibrary();
    	Random random = new Random();
    	pictureList = new ArrayList<>();
    	int set = random.nextInt(2);
    	switch(set) {
    		case 0:
    			this.pictureList.addAll(this.questionLibrary.get(QuestionSet.set1).keySet());
    			this.correctAnswer = 0;
    			break;
    		case 1:
    			this.correctAnswer = 1;
    			this.pictureList.addAll(this.questionLibrary.get(QuestionSet.set2).keySet());
    			break;
    		default:
    			break;
    	}
    }

    public void initLibrary(){
        questionLibrary = new HashMap<>();
        Map<String, Boolean> map1 = new HashMap<>();
        map1.put("p1.jpg", true);
        map1.put("p2.png", false);
        map1.put("p3.jpg", false);
        map1.put("p4.jpg", false);
        
        Map<String, Boolean> map2 = new HashMap<>();
        map2.put("dog1.jpg", false);
        map2.put("dog2.jpg", true);
        map2.put("dog3.jpg", false);
        map2.put("dog4.jpeg", false);
        questionLibrary.put(QuestionSet.set1, map1);
        questionLibrary.put(QuestionSet.set2, map2);
    }
   
    

    public Map<QuestionSet, Map<String, Boolean>> getQuestionLibrary() {
        return questionLibrary;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public List<String> getPictureList() {
		return pictureList;
	}
    
}


