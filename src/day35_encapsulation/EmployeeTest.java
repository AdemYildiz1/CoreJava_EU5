package day35_encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e1= new Employee();
		Employee e2= new Employee("Mark", 392119);
		Employee e3= new Employee("Tedd", 817283, "Sales", "Sales Person");
		
		System.out.println(e1.getName()+"|" + e1.getIdNumber()+"|"+e1.getDepartment()+"|"+e1.getPosition());// it gets from no parameters cons
		System.out.println(e2.getName()+"|" + e2.getIdNumber()+"|"+e2.getDepartment()+"|"+e2.getPosition());// it gets from cons with two parameters
		System.out.println(e3.getName()+"|" + e3.getIdNumber()+"|"+e3.getDepartment()+"|"+e3.getPosition());// it goes to cons that has 4 parameters
		
		//I can assign values for e1 by using "setter" because variables are private
		e1.setName("Mike");
		e1.setIdNumber(89778);
		e1.setDepartment("Accounting");
		e1.setPosition("VP");
		
		System.out.println(e1.getName()+"|" + e1.getIdNumber()+"|"+e1.getDepartment()+"|"+e1.getPosition());
		
		//to have string output(first we created to string method with sort cut.)
		
		System.out.println(e1.toString());//Employee [name=Mike, idNumber=89778, department=Accounting, position=VP]

		System.out.println(e2.toString());//Employee [name=Mark, idNumber=392119, department=, position=]
	}
	
	
}
