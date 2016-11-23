package Exercise3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MyClassTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass myClass = new MyClass();
		HashSet<Object> hashSet = new HashSet<Object>();
		hashSet.add("String1");
		hashSet.add("String2");
		hashSet.add(myClass.name);
		hashSet.add(myClass.age);
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(3);
		Iterator<Object> iterator = hashSet.iterator();
		 System.out.println("Hash Set:");
	     while (iterator.hasNext())
	        System.out.println(iterator.next());

	 	LinkedHashSet<Object> linkedhset = new LinkedHashSet<Object>();
	 	linkedhset.add("String1");
	 	linkedhset.add("String2");
	 	linkedhset.add(myClass.name);
	 	linkedhset.add(myClass.age);
	 	linkedhset.add(1);
	 	linkedhset.add(2);
	 	linkedhset.add(3);
	 	
	 	iterator = linkedhset.iterator();
	 	 System.out.println("Linked Hash Set:");
	      while (iterator.hasNext())
	         System.out.println(iterator.next());

	   	ArrayList<Object> arrayList = new ArrayList<Object>();
	   	arrayList.add("String1");
	   	arrayList.add("String2");
	   	arrayList.add(myClass.name);
	   	arrayList.add(myClass.age);
	   	arrayList.add(1);
	   	arrayList.add(2);
	   	arrayList.add(3);
	   	
	   	iterator = arrayList.iterator();
	   	 System.out.println("Array List:");
	        while (iterator.hasNext())
	           System.out.println(iterator.next());
		}
}
