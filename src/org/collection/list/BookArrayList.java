package org.collection.list;

import java.util.ArrayList;

public class BookArrayList {

	public static void main(String[] args) {
		ArrayList<Book> a = new ArrayList<Book>();

		Book b1 = new Book(101, "Java", 2);
		Book b2 = new Book(102, "C++", 4);
		Book b3 = new Book(103, "Operating System", 6);

		a.add(b1);
		a.add(b2);
		a.add(b3);

		for (Book b : a) {
			System.out.println(b.id + " " + b.name + " " + b.quantity);
		}
	}

}
