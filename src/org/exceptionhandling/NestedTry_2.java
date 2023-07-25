package org.exceptionhandling;

public class NestedTry_2 {
	public static void main(String args[]) {

		try {

			int a2 = 10 / 2;
			System.out.println(a2);

			try {
				int b = 39 / 0;
			}

			catch (ArithmeticException e) {
				System.out.println("First Inner Catch Block" + e);
			}
			try {
				int a[] = new int[5];
				a[5] = 4;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Second inner catch block :" + e);
			}
          finally {
	     System.out.println("Sab chal rha");
          }
			
		}

		catch (Exception e) {
			System.out.println("Exception ko handle krliya gya  (outer catch)" + e);
		}
		finally {
			System.out.println("normal flow..");
		} 
		
	}
}
