package basic;

import java.util.HashMap;

/*Map:
 * predefined interface in java.util-->jdk 1.2
 * Map is a part of collection framework which does not extends the collection from 
 * Map is used to organize the data in terms of key and value pair
 *1.Keys cannot be duplicated
 *2.values can be duplicated
 *One key and value together we call it as entry
 *Implementation classes:
 *1.HashMap
 *2.LinkedHashMap
 *3.TreeMap
 *4.Hash Table
 *Important methods used wrt maps:
 *1.put()
 *2.get()
 *3.clear()
 *4.keySet()
 *
 *HashMap-->
 *predefined order is not maintained-->jdk 1.2
 *insertion orderis not maintained
 *underlined ds is HashTable
 * 
 */
public class ExampleForMap {

	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<String ,String>();
		hm.put("Name","eren");
		hm.put("Place","wallmaria");
		System.out.println(hm);
		System.out.println("--------");
		System.out.println(hm.get("Name"));
		System.out.println("-----------");
		for(Object i:hm.keySet()) {
			System.out.println(i);
		}

	}

}
