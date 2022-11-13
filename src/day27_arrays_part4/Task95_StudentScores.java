package day27_arrays_part4;

public class Task95_StudentScores {

	public static void main(String[] args) {
		//row--students
		//column-- subjects
		int[] []scores= {
				{68,75,54,80}, //student-1
				{100,64,20,50},
				{10,35,40,90},
				};
		//avgScore student -1
		int SubjectsScore=0;
		double avgScore=0;
		for(int i=0; i<scores[0].length; i++) {
			SubjectsScore=SubjectsScore+scores[0][i];
			 avgScore= SubjectsScore/scores[0].length;
		}
		System.out.println("Avarage of student -1: "+avgScore);
		
		System.out.println("-------");
		
		//total math score
		int mathScore=0;
		for(int i=0; i<scores.length; i++) {
			mathScore=mathScore+scores[i][0];	
		}
		System.out.println("total: "+mathScore);
	}
}
