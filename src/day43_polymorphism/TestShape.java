package day43_polymorphism;

public class TestShape {

	public static void main(String[] args) {
	
		Shape s1= new Shape();
		 s1.draw();
		
		//When we create polymorphism, we have two simple RULES.
		Shape s2 = new Circle();
		
		s2.draw(); //which method will be called the method in parent or the method in child class ? 
		
		//RULE-1, it calls the method that is overridden in child.
		s2.draw(); //Drawing a circle
		
		//RULE-2, If the method is not overridden in child, then it calls the method from Parent.
		s2.draw(); //Drawing a shape
		
		/*WHAT if RULE 1 and 2 fails, 
		 which means what if we want to call a method, but; 
		 that method is not overridden and that method does NOT exist in parent class as well.
		 So it gives error. (check the picture Ozzy drawn).
		 
		 !!! Basically, Reference classes (parent or interfaces decide which method needs to be called)
		 
		 Turkcesi:)
		 !Yani tum kural ayni kapiya cikiyor, 
		 Eger cagrilan method parent da var ve child classta override olmussa child daki cagrilir.
		 yok override olmamissa Parenntaki cagrilir. 
		 cagrilan method child da var olsa bile parentta yoksa ERROR verir.
		 
		 Kisa yol; Polymorphismde Reference type(parent or interface) bak cagirdigin method yoksa zaten ERROR verir.
		 varsa bak overridden olmus mu olmussa childdakini cagirir, olmamisssa parenttakini cagirir.
		 */
		 
	}

}
