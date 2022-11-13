package day20_StringManipulation_Part2;

public class Task81_TimeStamp {

	public static void main(String[] args) {
		
		// it is more likely to use like this code in work environment!!!!
		
		String date="10/10/2019 14:59:00";

		  
		  System.out.println(timeStamp(date));
	}
	public static String timeStamp(String date) {
		
		date=date.replace("/", "").replace(" ","").replace(":", "");
		
		return date;
	}

}
