package day17_classObjects_part2;

public class BmwObjects {

	public static void main(String[] args) {
		
		BMW b1=new BMW ();
		BMW b2=new BMW ();
		
		System.out.println(b1.make);
		System.out.println(b2.make);
		
		b1.make="BMW2019";
		
		System.out.println(b1.make);// yeni atandi degisir.
		System.out.println(b2.make);// BMW dir, degismez.
		
		System.out.println(b1.model);
		b1.model="m3";
		b1.showprice(); //class daki switche gidip buldu
		
		b2.model="x3";
		b2.showprice();
		
		

	}

}
