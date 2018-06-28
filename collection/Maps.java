package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {

	public static void main(String[] args) {
		
			Map<String,String> phoneNumbers=new HashMap<>();
			//                key        value
			phoneNumbers.put("Esen", "608-123-4567");
			phoneNumbers.put("E", "608-123-4569");
			phoneNumbers.put("Hi", "Hello");
			System.out.println("Ending");
//			System.out.println(phoneNumbers.get("Esen"));
//			System.out.println(phoneNumbers.get("E"));
//			System.out.println(phoneNumbers);
			
			Set<String>keys=phoneNumbers.keySet();
			for (String key : keys) {
				System.out.println(phoneNumbers.get(key));
			}

	}

}
