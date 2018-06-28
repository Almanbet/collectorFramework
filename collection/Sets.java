package collection;

import java.util.HashSet;
import java.util.Set;

public class Sets {
	
	
	static Set<String> names=new HashSet<>();
	
	
	public static void addValue(String name) {
		if(names.contains(name)) {
			System.out.println("Name: "+name+"Already exist in the set");
			throw new RuntimeException();
			
		}System.out.println("Adding the name: "+name);
		names.add(name);
		
	}
	
	public static String getName() {
		for (String string : names) {
			if (names.contains(names)) {
				return null;
			}
		}
		return null;
	}
	

	public static void main(String[] args) {
		addValue("John");
		addValue("Wick");
		addValue("John");//-->Exception
		
		
//		
//		Set<String> values =new HashSet<>();
//		values.add("School");
//		values.add("Car");
//		values.add("Cat");
//		values.add("Car");
//		
//		boolean schoolChek=values.contains("School");
//		System.out.println("Check: "+schoolChek);
//		
//		for (String value : values) {
//			System.out.println(value);
//		}
//		System.out.println("Size: "+values.size());
	}
	
	
	
	

}
