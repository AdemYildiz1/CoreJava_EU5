package day10_controlFlowStatement_part4;

public class Task44_SpeedConverter {

	public static void main(String[] args) {
		// WAY-1
		System.out.println("KPH\t\tMPH");
		System.out.println("___________________");
		
		double mph=0;
		
		
		for(int kph=60; kph<=130; kph++) {
		   if(kph%10==0)	{
			   mph=kph*0.6219;
			   System.out.println(kph+"\t   "+ mph);
		   }
		}
	System.out.println("*************************************");
		//WAY-2
		final int START_KPH=60;
		final int MAX_KPH=130;
		final int INCREMENT=10;
		int KPH;
		double MPH;
		
		for(KPH=START_KPH; KPH<=MAX_KPH; KPH+=INCREMENT) {
			MPH=KPH*0.6214;
			System.out.println(KPH+"\t\t"+ MPH);
		}
		
	}

}
