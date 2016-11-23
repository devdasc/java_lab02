package Exercise2;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		      ArrayList<Object> arrayList = new ArrayList<Object>(2);
		      System.out.println("Initial contents of arraylist: " + arrayList);
		      System.out.println("Initial size of arraylist: " + arrayList.size());
		     
		      arrayList.add("string");
		      arrayList.add(9);
		      arrayList.add('c');
		      arrayList.add(9.9);
		      
		      System.out.println("Contents of arraylist: " + arrayList);
		      System.out.println("Size of arraylist: " + arrayList.size());
		      
		      arrayList.remove(2);
		      arrayList.remove(2);
		      System.out.println("Contents of arraylist after deletions: " + arrayList);
		      System.out.println("Contents of arraylist after deletions: " + arrayList.size());
		      if (arrayList.contains(9)== true)
		      {
		    	  System.out.println("True. arraylist does contain 9");
		      }
		      else
		      {
		    	  System.out.println("False. arraylist does not contain 9");
		      }
		      ListIterator<Object> listIterator = arrayList.listIterator();
		      System.out.println("Contents of arraylist using List Iteratror:");
		      while (listIterator.hasNext())
		         System.out.println(listIterator.next());
		      Object[] object = arrayList.toArray();

		      for(int i = 0; i < object.length; ++i)
		      {
		         Object contents = object[i];
		         System.out.print(contents+", ");
		      } 
	}
}
