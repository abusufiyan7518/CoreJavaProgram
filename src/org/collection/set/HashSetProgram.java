package org.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetProgram {
	public static void main(String[] args) {
		Set<String> hs = new HashSet<>();
		hs.add("Sufiyan");
		hs.add("Zaid");
		hs.add("Munna");
		boolean HS=hs.add("Lucky");
		System.out.println(HS);
		boolean HS1 = hs.add("Lucky");
		System.out.println(HS1);
		System.out.println(hs);
	}


}
