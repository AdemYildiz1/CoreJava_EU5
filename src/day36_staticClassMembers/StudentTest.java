package day36_staticClassMembers;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1=new Student("Mike", 30, 1000);
		Student s2=new Student("Ozzy", 30, 1200);
		Student s3=new Student("Jamal", 30, 1500);

		s1.school="CybertekEU"; //it is assigned for s2 and s3 as well because of "static" key word.
		                        //school/okul isminde yapilan bir degisiklik artik tum objecti etkiler
		                        //cunku static key word onu specific "instance variable" olmaktan cikardi
		                        //artik "class variable" oldu
		                        
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
	}

}
