package org.collection.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class ArrayListAllMethod_15 {

	public static void main(String[] args) {
//		ArrayList<String> languages1 = new ArrayList<>();
//		languages1.add("Java");
//		languages1.add("Python");
//		System.out.println("ArrayList 1: " + languages1);
//
//		ArrayList<String> languages2 = new ArrayList<>();
//		languages2.add("JavaScript");
//		languages2.add("C");
//		System.out.println("ArrayList 2: " + languages2);
//
//		languages2.addAll(1, languages1);
//
//		System.out.println("Updated ArrayList 2: " + languages2);
//
//		ArrayList<Integer> oddNumbers = new ArrayList<>();
//
//		oddNumbers.add(1);
//		oddNumbers.add(3);
//		oddNumbers.add(5);
//		System.out.println("Odd Number ArrayList: " + oddNumbers);
//
//		oddNumbers.removeAll(oddNumbers);
//		System.out.println("ArrayList after removeAll(): " + oddNumbers);
//
//		ArrayList<String> languages = new ArrayList<>();
//
//		languages.add("Java");
//		languages.add("JavaScript");
//		languages.add("Python");
//		System.out.println("Programming Languages: " + languages);
//
//		
//	        ArrayList<Integer> oddNumbers1 = new ArrayList<>();
//
//	        oddNumbers1.add(1);
//	        oddNumbers1.add(3);
//	        oddNumbers1.add(5);
//	        System.out.println("Odd Number ArrayList: " + oddNumbers1);
//
//	        oddNumbers.removeAll(oddNumbers1);
//	        System.out.println("ArrayList after removeAll(): " + oddNumbers);

	        
//	        ArrayList<Integer> number = new ArrayList<>();
//
//	        number.add(1);
//	        number.add(3);
//	        number.add(5);
//	        System.out.println("ArrayList: " + number);
//
//	        ArrayList<Integer> cloneNumber = (ArrayList<Integer>)number.clone();
//	        System.out.println("Cloned ArrayList: " + cloneNumber);
////	        
//	        ArrayList<Integer> prime = new ArrayList<>();
//	        prime.add(2);
//	        prime.add(3);
//	        prime.add(5);
//	        System.out.println("Prime Number: " + prime);
//
//	        System.out.println("Return value of clone(): " + prime.clone());
//	        
	        ArrayList<String> languages = new ArrayList<>();
	        languages.add("Java");
	        languages.add("Python");
	        languages.add("JavaScript");
	        System.out.println("ArrayList: " + languages);

	        System.out.print("Is Java present in the arraylist: ");
	        System.out.println(languages.contains("Java"));

	        ArrayList<String> languages1 = new ArrayList<>();

	        languages1.add("JavaScript");
	        languages1.add("Java");
	        languages1.add("Python");
	        System.out.println("Programming Languages: " + languages1);

	        String element = languages1.get(1);
	        System.out.println("Element at index 1: " + element);
	        
//	        ArrayList<Integer> numbers = new ArrayList<>();
//
//	        // insert element to the arraylist
//	        numbers.add(22);
//	        numbers.add(13);
//	        numbers.add(35);
//	        System.out.println("Numbers ArrayList: " + numbers);
//
//	        // return element at position 2
//	        int element = numbers.get(2);
//	        System.out.println("Element at index 2: " + element);
//	    
//	        
//	        ArrayList<Integer> numbers = new ArrayList<>();
//	        numbers.add(22);
//	        numbers.add(13);
//	        numbers.add(35);
//	        System.out.println("Number ArrayList: " + numbers);
//
//	        int position1 = numbers.indexOf(13);
//	        System.out.println("Index of 13: " + position1);
//
//	        int position2 = numbers.indexOf(50);
//	        System.out.println("Index of 50: " + position2);
//	    
//	        ArrayList<String> languages = new ArrayList<>();
//	        languages.add("JavaScript");
//	        languages.add("Python");
//	        languages.add("Java");
//	        languages.add("C++");
//	        languages.add("Java");
//	        System.out.println("Programming Languages: " + languages);
//
//	        int position = languages.indexOf("Java");
//	        System.out.println("First Occurrence of Java: " + position);
//	
//	        
//	        ArrayList<String> languages = new ArrayList<>();
//	        languages.add("Java");
//	        languages.add("JavaScript");
//	        languages.add("Python");
//	        System.out.println("Programming Languages: " + languages);
//
//	        languages.removeAll(languages);
//	        System.out.println("ArrayList after removeAll(): " + languages);
//	    
//	        
//	        ArrayList<String> languages1 = new ArrayList<>();
//	        languages1.add("Java");
//	        languages1.add("English");
//	        languages1.add("C");
//	        languages1.add("Spanish");
//	        System.out.println("Languages1: " + languages1);
//
//	        ArrayList<String> languages2 = new ArrayList<>();
//	        languages2.add("English");
//	        languages2.add("Spanish");
//	        System.out.println("Languages2: " + languages2);
//
//	        languages1.removeAll(languages2);
//	        System.out.println("Languages1 after removeAll(): " + languages1);
//	
//	        
//	        ArrayList<Integer> primeNumbers = new ArrayList<>();
//	        primeNumbers.add(2);
//	        primeNumbers.add(3);
//	        primeNumbers.add(5);
//	        primeNumbers.add(7);
//	        System.out.println("ArrayList: " + primeNumbers);
//
//	        int size = primeNumbers.size();
//	        System.out.println("Length of ArrayList: " + size);
//	        
//	        		
//	                ArrayList<String> languages = new ArrayList<>();
//	                languages.add("JavaScript");
//	                languages.add("Java");
//	                languages.add("Python");
//	                System.out.println("ArrayList: " + languages);
//
//	                int size = languages.size();
//	                System.out.println("Length of ArrayList: " + size);
//
//	                ArrayList<String> languages = new ArrayList<>();
//	                System.out.println("Newly Created ArrayList: " + languages);
//
//	                boolean result = languages.isEmpty(); // true
//	                System.out.println("Is the ArrayList empty? " + result);
//
//	                languages.add("Python");
//	                languages.add("Java");
//	                System.out.println("Updated ArrayList: " + languages);
//
//	                result = languages.isEmpty();  // false
//	                System.out.println("Is the ArrayList empty? " + result);
//	      
//	                ArrayList<String> languages = new ArrayList<>();
//
//	                languages.add("JavaScript");
//	                languages.add("Java");
//	                languages.add("Python");
//	                languages.add("C");
//	                System.out.println("ArrayList: " + languages);
//	                 System.out.println("SubList: " + languages.subList(1, 3));
//	            
//	                 
//	                 ArrayList<Integer> ages = new ArrayList<>();
//	                 ages.add(10);
//	                 ages.add(12);
//	                 ages.add(15);
//	                 ages.add(19);
//	                 ages.add(23);
//	                 ages.add(34);
//	                 System.out.println("List of Age: " + ages);
//
//	                 System.out.println("Ages below 18: " + ages.subList(0, 3));
//	                 System.out.println("Ages above 18: " + ages.subList(3, ages.size()));
//	           
//	                 
//	                 ArrayList<String> languages = new ArrayList<>();
//	                 languages.add("Python");
//	                 languages.add("English");
//	                 languages.add("JavaScript");
//	                 System.out.println("ArrayList: " + languages);
//
//	                 String element = languages.set(1, "Java");
//	                 System.out.println("Updated ArrayList: " + languages);
//	                 System.out.println("Replaced Element: " + element);
//	                 
//	                 
//	                 ArrayList<String> languages1 = new ArrayList<>();
//	                 languages1.add("Python");
//	                 languages1.add("English");
//	                 languages1.add("JavaScript");
//
//
//	                 ArrayList<String> languages2 = new ArrayList<>();
//	                 languages2.addAll(languages1);
//	                 System.out.println("ArrayList: " + languages1);
//
//	                 languages1.set(1, "Java");
//	                 System.out.println("ArrayList after set(): " + languages1);
//	                 languages2.add(1, "Java");
//	                 System.out.println("ArrayList after add(): " + languages2);
//	                 
//	                 
//	                 ArrayList<Integer> numbers = new ArrayList<>();
//	                 numbers.add(7);
//	                 numbers.add(3);
//	                 numbers.add(9);
//	                 numbers.add(-33);
//	                 System.out.println("Unsorted ArrayList: " + numbers);
//	                 numbers.sort(Comparator.naturalOrder());
//	                 System.out.println("Sorted ArrayList: " + numbers);
//	                 
//	                 
//	                 ArrayList<String> languages= new ArrayList<>();
//	                 languages.add("Java");
//	                 languages.add("Python");
//	                 languages.add("C");
//	                 System.out.println("ArrayList: " + languages);
//	                 String[] arr = new String[languages.size()];
//	                 languages.toArray(arr);
//	                 System.out.print("Array: ");
//	                 for(String item:arr) {
//	                   System.out.print(item+", ");
//	                 
//	                
//	                   ArrayList<String> languages= new ArrayList<>();
//	                   languages.add("Java");
//	                   languages.add("Python");
//	                   languages.add("C");
//	                   System.out.println("ArrayList: " + languages);
//
//	                   Object[] obj = languages.toArray();
//	                   System.out.print("Array: ");
//	                   for(Object item : obj) {
//	                     System.out.print(item+", ");
//	                     
//	                     
//	                     ArrayList<String> languages= new ArrayList<>();
//	                     languages.add("Java");
//	                     languages.add("Python");
//	                     languages.add("C");
//	                     System.out.println("ArrayList: " + languages);
//	                     String list = languages.toString();
//	                     System.out.println("String: " + list);
//	                     
//	                     
//	                     ArrayList<String> languages= new ArrayList<>();
//	                     languages.ensureCapacity(3);
//	                     languages.add("Java");
//	                     languages.add("Python");
//	                     languages.add("C");
//	                     System.out.println("ArrayList: " + languages);
//	                     
//	                     
//	                     ArrayList<String> languages= new ArrayList<>();
//	                     languages.ensureCapacity(3);
//	                     languages.add("Java");
//	                     languages.add("Python");
//	                     languages.add("C");
//	                     languages.add("Swift");
//	                     System.out.println("ArrayList: " + languages);
//	                     
//	                     ArrayList<String> languages = new ArrayList<>();
//	                     languages.add("JavaScript");
//	                     languages.add("Python");
//	                     languages.add("Java");
//	                     languages.add("C++");
//	                     languages.add("Java");
//	                     System.out.println("Programming Languages: " + languages);
//	                     int position1 = languages.lastIndexOf("Java");
//	                     System.out.println("Last Occurrence of Java: " + position1);
//	                     int position2 = languages.lastIndexOf("C");
//	                     System.out.println("Last Occurrence of C: " + position2);
//	             
//	                     
//	                     ArrayList<String> languages1 = new ArrayList<>();
//	                     languages1.add("JavaScript");
//	                     languages1.add("Python");
//	                     languages1.add("Java");
//	                     System.out.println("ArrayList 1: " + languages1);
//
//	                     
//	                     ArrayList<String> languages2 = new ArrayList<>();
//	                     languages2.add("English");
//	                     languages2.add("Java");
//	                     languages2.add("Python");
//	                     System.out.println("ArrayList 2: " + languages2);
//	                     languages1.retainAll(languages2);
//	                     System.out.println("Common Elements: " + languages1);
//	              
//	                     
//	                     ArrayList<Integer> numbers = new ArrayList<>();
//	                     numbers.add(1);
//	                     numbers.add(2);
//	                     numbers.add(3);
//	                     System.out.println("ArrayList: " + numbers);
//
//
//	                     HashSet<Integer> primeNumbers = new HashSet<>();
//	                     primeNumbers.add(2);
//	                     primeNumbers.add(3);
//	                     primeNumbers.add(5);
//	                     System.out.println("HashSet: " + primeNumbers);
//	                     numbers.retainAll(primeNumbers);
//	                     System.out.println("Common Elements: " + numbers);
//	                 
//	                     
//	                     ArrayList<String> languages = new ArrayList<>();
//	                     languages.add("Java");
//	                     languages.add("Python");
//	                     languages.add("JavaScript");
//	                     System.out.println("ArrayList: " + languages);
//	                     languages.trimToSize();
//	                     System.out.println("Size of ArrayList: " + languages.size());
//	              
//	                     
//	                     ArrayList<String> languages = new ArrayList<>();
//	                     languages.add("java");
//	                     languages.add("javascript");
//	                     languages.add("swift");
//	                     languages.add("python");
//	                     System.out.println("ArrayList: " + languages);
//	                     languages.replaceAll(e -> e.toUpperCase());
//	                     System.out.println("Updated ArrayList: " + languages);
//	                     
//	                     
//	                     ArrayList<Integer> numbers = new ArrayList<>();
//
//	                     // add elements to the ArrayList
//	                     numbers.add(1);
//	                     numbers.add(2);
//	                     numbers.add(3);
//	                     System.out.println("ArrayList: " + numbers);
//
//	                     // multiply 2 to all elements of the hashmap
//	                     numbers.replaceAll(e -> e * 2);;
//	                     System.out.println("Updated ArrayList: " + numbers);
//
//
//	                     
//} ArrayList<Integer> numbers = new ArrayList<>();
//
//// add elements to the ArrayList
//numbers.add(1);
//numbers.add(2);
//numbers.add(3);
//numbers.add(4);
//numbers.add(5);
//numbers.add(6);
//System.out.println("Numbers: " + numbers);
//// remove all even numbers
//numbers.removeIf(e -> (e % 2) == 0);;
//System.out.println("Odd Numbers: " + numbers);
//
//
//ArrayList<String> countries = new ArrayList<>();
//
//// add elements to the ArrayList
//countries.add("Iceland");
//countries.add("America");
//countries.add("Ireland");
//countries.add("Canada");
//countries.add("Greenland");
//System.out.println("Countries: " + countries);
//
//// remove all even countries
//countries.removeIf(e -> e.contains("land"));;
//System.out.println("Countries without land: " + countries);
//
//
//ArrayList<Integer> numbers = new ArrayList<>();
//numbers.add(1);
//numbers.add(2);
//numbers.add(3);
//numbers.add(4);
//System.out.println("ArrayList: " + numbers);
//
//System.out.print("Updated ArrayList: ");
//
//// multiply each element by 10
//// using the lambda expression
//numbers.forEach((e) -> {
//  e = e * 10;
//  System.out.print(e + " ");
//  
//  
//  ArrayList<Integer> numbers = new ArrayList<>();
//
//  // add elements to the ArrayList
//  numbers.add(3);
//  numbers.add(4);
//  numbers.add(5);
//  numbers.add(6);
//  System.out.println("ArrayList: " + numbers);
//
//  System.out.print("Updated ArrayList: ");
//
//  // multiply each element by themselves
//  // to compute the square of the number
//  numbers.forEach((e) -> {
//    e = e * e;
//    System.out.print(e + " ");
//    
//    
//    ArrayList<String> languages = new ArrayList<>();
//
//    // Add elements in the array list
//    languages.add("Java");
//    languages.add("Python");
//    languages.add("JavaScript");
//    languages.add("Swift");
//
//    // Create a variable of Iterator
//    // store the iterator returned by iterator()
//    Iterator<String> iterate = languages.iterator();
//    System.out.print("ArrayList: ");
//
//    // loop through ArrayList till it has all elements
//    // Use methods of Iterator to access elements
//    while(iterate.hasNext()){
//      System.out.print(iterate.next());
//      System.out.print(", ");
//      
//      
//      
//      ArrayList<String> languages = new ArrayList<>();
//
//      // Add elements in the array list
//      languages.add("Java");
//      languages.add("Python");
//      languages.add("JavaScript");
//      languages.add("Swift");
//
//      // Create a variable of Iterator
//      // store the iterator returned by iterator()
//      Iterator<String> iterate = languages.iterator();
//      System.out.println("Element: Index");
//
//      // loop through ArrayList till it has all elements
//      // Use methods of Iterator to access elements
//      while(iterate.hasNext()){
//
//        // access element
//        String element = iterate.next();
//        System.out.print(element + ": ");
//      
//        // access index of each element
//        System.out.println(languages.indexOf(element));
//      }
//    }
//  }
//languages.clear();
//System.out.println("ArrayList after clear(): " + languages);
//
	}
}
	        