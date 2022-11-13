package day48_collection_part3;

import java.util.*;

public class ListOfMaps {

	public static void main(String[] args) {
		
		List<Map<String,String>>employees=new ArrayList<>(); //list holding Map collection elements/objects that we'll to add
		
		Map<String,String> emp1Data=new HashMap<>();
		emp1Data.put("EmpID", "123");
		emp1Data.put("EmpName", "John");
		emp1Data.put("JobTitle", "SDET");
		emp1Data.put("Salary", "100000");
		
		Map<String,String> emp2Data=new HashMap<>();
		emp2Data.put("EmpID", "124");
		emp2Data.put("EmpName", "Mike");
		emp2Data.put("JobTitle", "Dev");
		emp2Data.put("Salary", "80000");
		
		employees.add(emp1Data); //we added our data in Map collections to the our list collection
		employees.add(emp2Data);
		
		System.out.println(employees.toString());
		
		System.out.println(employees.size());//2 --> employees List has emp1Data and emp2Data elements that come from maps
		
		//let's retrieve elements of list
		System.out.println(employees.get(0));//it prints first element of list/emp1Data
		
		//let's retrieve elements of map ex; retrieve - John
		System.out.println(employees.get(0).get("EmpName")); //go to list get first element which is emp1Data, then get key's value
		//or
		System.out.println(emp1Data.get("EmpName"));
		
		//Print each employee title by using for each loop
		for(Map<String, String> emp:employees) {
				System.out.println(emp.get("JobTitle"));
	
		}
		//Find the Total salary
		int totalSalary=0;
		
		for(Map<String, String> sal:employees) {
			
			totalSalary+= Integer.parseInt(sal.get("Salary"));
			//totalSalary= totalSalary+Integer.parseInt(sal.get("Salary")); same thing
		}
		System.out.println("Total salary= "+totalSalary);

	}

}
