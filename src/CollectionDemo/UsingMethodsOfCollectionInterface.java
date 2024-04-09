package src.CollectionDemo;

import java.util.Vector;

public class UsingMethodsOfCollectionInterface {

	public static void main(String[] args) {
		
		//VECTOR and STACK can use their own old methods of V 1.0 as well as collection
		//class methods of v 1.2, which makes it a legacy class
		
		Vector v= new Vector<>();
		
		System.out.println("Initial size: "+ v.size());
		System.out.println("Initial Capacity: " + v.capacity());
		
		v.add(10);
		v.addElement("Shivani"); // Old method of vector class
		v.addElement(20);
		v.add(30);
		v.add(50);
		
		System.out.println("Elements in vector v : "+v);
		
		v.remove(1);
		System.out.println("Values after removal of 3rd element in vector v: "+v);
		
		System.out.println("isEmpty: " + v.isEmpty());
		System.out.println("New size: "+ v.size());
		
		Vector v1 =new Vector();
		v1.addAll(v);
		System.out.println("Elements in vector v1 :"+ v1);
		
		System.out.println("Does v1 contains given value: "+v1.contains(10));
		System.out.println("size of V1 : "+v1.size());

		//v.clear();
		//System.out.println("Size of v after clear: "+v.size());
		
		Vector v2 =new Vector();
		v2.add(10);
		v2.add(20);
		v2.add(30);
		v2.add(40);
		v2.add(10);
		v2.add(20);
		v2.add(30);
		v2.add(40);
		v2.add(20);
		v2.add(30);
		v2.add(40);
		v2.add(60);
		
		System.out.println("................Use of retainAll()................");
		
		System.out.println("Elemets in v2 before retailAll :" +v2);
		System.out.println("Elemets in v before retailAll :" +v);
		
		v2.retainAll(v); //Will compare v and v2 and will delete the extra values from v2
		
		System.out.println();
		
		System.out.println("Elemets in v2 after retailAll :" +v2);
		System.out.println("Elemets in v after retailAll :" +v);
		
		System.out.println("Capacity of v2: "+ v2.capacity());
		
		v2.add(60);
		v2.removeAll(v);
		
		System.out.println(v2);
	}

}
