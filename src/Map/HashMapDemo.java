package src.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		// 1) A map contains values on the basis of key, i.e. key and value pair
		// 2) A Map is useful if you have to search, update or delete elements on the basis of a key.
		// 3) Each key and value pair is known as an entry
		// 4) A Map contains unique keys.
		// 5) A Map can have duplicate values
		// 6) Entry interface is inner interface of Map Interface
		// 7) Insertion order is not maintained..!!
		// 8) Insertion order is based on HASHCODE OF KEY
		// 9) Homogeneous and heterogeneous both are accepted  for keys or values
		
		// HASHCODE - UNIQUE NUMBER PROVIDED BY JVM TO THE OBJECT
				
		
		HashMap hm= new HashMap<>();
		
		hm.put(103, "Pink");
		hm.put(103, "Black");
		hm.put(100, "Red");
		hm.put(101, null);
		hm.put(109, null);
		hm.put(null, 10); 		//heterogeneous value
		hm.put('a', 100);		//heterogeneous key

		
		System.out.println("Values in Hashmap : "+hm);
		
		hm.put(100, "Grey"); //Will replace Red by Grey in position 100 as duplicate position/key not allowed
		System.out.println("Values in Hashmap after replacing Grey in 100 : "+hm);
		
		hm.put(105, "Green"); //Will add duplicate value Green in 105
		System.out.println("Values in Hashmap after adding Green in 105: "+hm);
		
		System.out.println();
		
		//Printing values of hash map
		System.out.println("Printing Values inside HashMap using values(): ");
		
			
		int i = 1;
		for (Object o : hm.values())
		{
			System.out.println(i +") " + o);
			i++;
		}
		
		System.out.println();
		
		//Printing keys of hash map
		System.out.println("Printing Keys inside HashMap using keySet(): ");
		
		int j = 1;
		for (Object o : hm.keySet())
		{
			System.out.println(j +") " + o);
			j++;
		}
		
		System.out.println();
		
		//Printing key Value pair
		System.out.println("Printing Key value pair inside HashMap using entrySet() : ");
		
		int k = 1;
		for (Object o : hm.entrySet())
		{
			System.out.println(k +") " + o);
			k++;
		}
		
		System.out.println();
		
		// Printing hashmap using iterator
		System.out.println("Printing Key value pair inside HashMap using iterator : ");
				
		Set s= hm.entrySet();
		Iterator it= s.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println();
		
		System.out.println("Hashcode value : "+hm.hashCode());
	
		//Get() use to get a value at a particular key location
		System.out.println("Value at given key : "+hm.get(100));
		
		//Getting size of HashMap
		System.out.println("Size of Hashmap: "+hm.size());

		hm.get(103);
		//Removing element at a given Key
		hm.remove(105);
		System.out.println("Values in Hashmap after removing 105 element: "+hm);
		
		System.out.println();
		
		HashMap hm1= new HashMap<>();
		hm1.putAll(hm);
		System.out.println("Values in Hashmap hm1 : " + hm1);
		
	}

}
