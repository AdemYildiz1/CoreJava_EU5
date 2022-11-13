package day24_arrays_part1;

public class AvarageScore {

	public static void main(String[] args) {


		int scores[]= {80,90,100,50,10,28,25,36,65,68,69,62,78,101};
		int sum=0;
		
		for(int i=0; i<scores.length; i++) {
			sum=sum+scores[i];
		}

		System.out.println("Avarage is "+sum/scores.length);
	}

}
