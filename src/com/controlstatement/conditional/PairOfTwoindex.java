package com.controlstatement.conditional;

public class PairOfTwoindex {
public static void main(String[] args) {
	int arr[]= {10,5,3,7,5,9,1,7,2};
	int result=10;
	for (int i = 0; i < arr.length-1; i++) {
		for (int j = i+1; j < arr.length; j++) {	
		
	
		if(arr[i]+arr[j]==result) {
			System.out.println("Pair of index found: "+i+"+"+j );	
			System.out.println(arr[i]+arr[j]);
		}
	}
}
}
}