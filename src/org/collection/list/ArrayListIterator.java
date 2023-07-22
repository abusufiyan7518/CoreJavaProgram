package org.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
	public static void main(String[] args) {
		ArrayListStudent s1 = new ArrayListStudent(101, "AbuSufiyan", 23);
		ArrayListStudent s2 = new ArrayListStudent(102, "Abuzar", 21);
		ArrayListStudent s3 = new ArrayListStudent(103, "Ansarul", 25);

		ArrayList<ArrayListStudent> al = new ArrayList<ArrayListStudent>(); //
		al.add(s1);
		al.add(s2);
		al.add(s3);

		Iterator<ArrayListStudent> itr = al.iterator();

		while (itr.hasNext()) {
			ArrayListStudent st = (ArrayListStudent) itr.next();
			System.out.println("Roll no: " + s1.rollno + ";" + " " + "Name:" + st.name + ";" + " " + "Age:" + st.age);
		}
	}
}
