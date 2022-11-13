package day33_classObject_Constructor;

public class Mouse {

	int numTeeth;
	int numWhiskers;
	int weight;
	
	//cons 1
	public Mouse(int weight) {                
		this(30,weight);                     // here we call cons 2 from cons 1---RULL!! this() key word must be in the first line
		this.weight = weight;
		System.out.println("JAVA");
	}
	
    //cons 2
	public Mouse(int numTeeth, int weight) {
		this(numTeeth,20,weight);                  // here we call cons 3 from cons 2
		this.numTeeth = numTeeth;
		this.weight = weight;
		System.out.println("JS");
	}


	public Mouse(int numTeeth, int numWhiskers, int weight) {
		this.numTeeth = numTeeth;
		this.numWhiskers = numWhiskers;
		this.weight = weight;
		System.out.println("C");
	}
	
	public void print() {
		System.out.println(weight +" "+numTeeth+" "+ numWhiskers);
	}
	
}
