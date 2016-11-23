package Exercise1;

import java.util.HashSet;

public class HashSetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hashset = new HashSet<String>();
		hashset.add("A");
		hashset.add("B");
		hashset.add("C");
		hashset.add("D");
		hashset.add("E");
		hashset.add("F");
		hashset.add("G");
		hashset.add("H");
		System.out.println(hashset);
		hashset.add("A");
		System.out.println(hashset);
		hashset.add(null);
		hashset.add(null);
		System.out.println(hashset);


	}

}
