package src.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class EntryInterfaceDemo {

	public static void main(String[] args) {

		HashMap hm = new HashMap<>();

		hm.put(103, "Pink");
		hm.put(104, "Black");
		hm.put(100, "Red");
		hm.put(101, "Green");
		hm.put(102, "Blue");

		System.out.println("Original HM: "+hm);
		System.out.println();
		
		Set s = hm.entrySet();
		Iterator it = s.iterator();

		System.out.println("Replacing/Setting value inside HashMap using Entry Interface : ");

		while (it.hasNext()) {
			Entry m = (Entry) it.next();
			if (m.getValue().equals("Red")) {
				m.setValue("GREY");
			}
			System.out.println(m.getKey() + " = " + m.getValue());
		}
		
		System.out.println();
		System.out.println("New HM: " + hm);

	}

}
