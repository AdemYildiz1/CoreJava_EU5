package day26_arrays_part3;

public class Task93_HowManyWords {

	public static void main(String[] args) {
		//How many words in this sentences?
		
		String str ="�As he crossed toward the pharmacy at the corner he involuntarily turned his head because"
		+" of a burst of light that had ricocheted from his temple, and saw, with that quick smile with which"
		+"we greet a rainbow or a rose,a blindingly white parallelogram of sky being unloaded from the van�a"
		+"dresser with mirrors across which, as across a cinema screen,passed a flawlessly clear reflection"
		+"of boughs sliding and swaying not arboreally, but with a human vacillation, produced by the nature"
        + " of those who were carrying this sky, these boughs, this gliding"+" fa�ade.�";

		String[]arr=str.split(" ");
		
		System.out.println(arr.length);//it prints How many words/elements we have.
		
		System.out.println(arr[33]); // it prints element index number is 33 it prints which means 34th element
		
		for(String value: arr) {
			System.out.println(value);
		}
	}

}
