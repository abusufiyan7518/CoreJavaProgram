package org.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryCatch_3 {
	public static void main(String[] args) {

		PrintWriter pw;
		try {
			pw = new PrintWriter(" "); //
			pw.println("saved");
		} catch (FileNotFoundException e) {

			System.out.println(e);
		}
		System.out.println("File saved successfully");
	}
}
