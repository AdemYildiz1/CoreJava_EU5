package day15_methods_part3;

public class Task70_HighScore {

	public static void main(String[] args) {
		
		
		displayHighScorePosition("Mike",calculateHighScorePosition(600) );
		displayHighScorePosition("adem",calculateHighScorePosition(1100) );

	}  public static void displayHighScorePosition (String name, int position) {
		
		System.out.println(name+" managed to get into position "+ position + " on the high score table");
		
	}
	
	public static int calculateHighScorePosition(int score) {
		
		if (score>=1000) {
			return 1;                       // based on score we turn some rank!!
		}else if(score<1000&&score>=500) {
			return 2;
		}else if(score>=100&&score<500) {
			return 3;	
		}else {
			return 4;
		}

	}
        
}

