package day24_arrays_part1;

public class AssigninValuesToArray_And_Printing {

	public static void main(String[] args) {
		
		int[] scores=new int[5];
		
		scores[0]=80;
		scores[1]=85;
		scores[2]=90;
		scores[3]=100;
		scores[4]=50;
			
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		System.out.println(scores[4]);
			
		int avgScores=(scores[0]+scores[1]+scores[2]+scores[3]+scores[4])/5;
		
		System.out.println(avgScores);
				
	}

}
