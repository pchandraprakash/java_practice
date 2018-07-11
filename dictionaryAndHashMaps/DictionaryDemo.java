package dictionaryAndHashMaps;

import java.util.HashMap;
import java.util.Map;

public class DictionaryDemo {

	public static void main(String[] args) {
		// Initializing a dictionary using HashMap
		Map<String, String> engKanCal = new HashMap<String, String>();
		// putting or inserting data into the HashMap/dictionary
		engKanCal.put("Monday", "Soomavaara");
		engKanCal.put("Tuesday", "Mangalavaara");
		engKanCal.put("Wednesday", "Budhavaara");
		engKanCal.put("Thursday", "Guruvaara");
		engKanCal.put("Friday", "Shukravaara");
		engKanCal.put("Saturday", "Shanivaara");
		engKanCal.put("Sunday", "Bhaanuvaara");
		// retrieve all the key/value pairs from dictionary/HashMap
		System.out.println(engKanCal);
		// retrieve values for the keys
		System.out.println(engKanCal.get("Monday"));
		System.out.println(engKanCal.get("thursday"));// returns null(case sensitive)
		System.out.println(engKanCal.get("Thursday"));
		// to get all the key values
		System.out.println(engKanCal.keySet());// returns keys array
		// to get all the value pairs
		System.out.println(engKanCal.values());// returns value array
		// size of the dictionary
		System.out.println(engKanCal.size());
		// check whether dictionary is null or not?
		System.out.println(engKanCal.isEmpty());
		// check whether a key entity is present or not?
		System.out.println(engKanCal.containsKey("x"));
		// check whether a value entity is present or not?
		System.out.println(engKanCal.containsKey("y"));
		
		Map<String,Boolean> shopList = new HashMap<String,Boolean>();
		shopList.put("spinach",true);
		shopList.put("onions",true);
		shopList.put("potatoes",false);
		shopList.put("cilantro",true);
		shopList.put("eggs",false);
		//remove an item
		System.out.println(shopList.size());
		//System.out.println(shopList.remove("eggs", false));
		
		System.out.println(shopList.remove("eggs"));
		System.out.println(shopList.size());
		
		System.out.println(shopList.toString());
		shopList.clear();
		System.out.println(shopList.toString());
	}

	
}
