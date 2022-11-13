package day33_classObject_Constructor;

public class StudentTest {

	public static void main(String[] args) {

		Student s1 = new Student("Mike", 17, 'M', 2016, "Java");// here "Cybertek" name is the same to make efficient
		Student s2 = new Student("Smith", 18, 'M', 2016, "JS"); // to make efficient, let's assign it in instance variable.														 
		Student s3 = new Student("Marry", 19, 'F', 2016, "TS"); // and we can remove here

		s1.attendLecture();
		s2.attendingLab();

		System.out.println(s1.university);

	}

}
