package org.array;

import java.util.Arrays;

public class BinarySearchExample {

	public static void main(String[] args) {
		int arr[] = { 10, 40, 33, 20, 30, 40, 50 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int key = 30;
		int result = Arrays.binarySearch(arr, key);
		if (result < 0)
			System.out.println("Element is not found!");
		else
			System.out.println("Element is found at index: " + result);
	}

}
/*
 * For Sorting for(int i=0;i<arr.length;i++){ for(int j=0;j<arr.length;j++){ if
 * (arr[j]>arr[j]){
 * 
 * int temp=arr[j]; arr[j]=arr[j+1]; arr[j+1]=temp; } } } for(int
 * i=0;i<arr.length;i++){ system.out.println(arr[i]); } } } }
 */
