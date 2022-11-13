package day37_inheritance;

public class FinalExam extends GradeActivity  {

	private int numQuestions;
	private double pointsEach;
	private int numMissed;
	
	public FinalExam (int numQuestions, int numMissed ) { //constructor
		
		double numericScore;
		
		//Here my goal is to receive the Grade letter based on numeric score.
		this.numQuestions=numQuestions;
		this.numMissed=numMissed;
		
		pointsEach=100.0/numQuestions;
		numericScore=100.0-(numMissed*pointsEach);
		
		//score=numericScore; 
		
		//REMEMBER RULE!!
		//it is not inherited because my score variable is private. 
		//so we can access with setter method
		
		setScore(numericScore);
	}
	
	
	
}
