package day48_collection_part3;

import java.util.*;

import day46_collection_part1.Product;

public class LoopMap {

	public static void main(String[] args) {

		Map<String, String> dataMap = new HashMap<>();
		dataMap.put("url", "qa3.vytrack.com");
		dataMap.put("username", "user66");
		dataMap.put("password", "abc66");
		dataMap.put("browser", "chrome");
		dataMap.put("truckdriver", "Bob");
		dataMap.put("storemanager", "John");

		// keySet - > returns with all the keys in the map
		// values - > returns with all the values in the map
		System.out.println("+++++KEYS+++++");
		for (String key : dataMap.keySet()) {
			System.out.println(key);
		}

		System.out.println("+++++VALUES+++++");
		for (String value : dataMap.values()) {
			System.out.println(value);
		}
		
		System.out.println("+++++KEYS | VALUE +++++");
		for (String key : dataMap.keySet()) {
			System.out.println(key+"|"+dataMap.get(key)); //REMEMBER, dataMap.get(key)->gives value of that specific key
		}
		//Lets loop forEach method/ method.lambda expression, easy way
		dataMap.forEach((k,v)->System.out.println(k+"|"+v));
		
		//we can create maps in many ways by changing key and values
		
		Map<Integer,Product> studentMap = new HashMap<>(); // here, key Integer value comes from product class which we create in day46 
		Map<String,String[]> data = new HashMap<>();
		Map<Integer,List<String>> data2 = new HashMap<>();
		Map<Integer,List<String[]>> data3 = new HashMap<>();
		Map<String,Map<Integer,Integer>> data4 = new HashMap<>(); // key is String, value is another map:)
		Map<String,Map<Integer,Product>> data5 = new HashMap<>();
		
	}

}
