package com.greatlearning.AlgorithmsLabSolution.PayMoney;

import java.util.Scanner;

class Transaction {

	public static void main(String args[]) throws Exception {
		
	Scanner s = new Scanner(System.in);
	
	System.out.println("enter the size of transaction array: ");
	
	int size = s.nextInt();
	
		int arr[] = new int[size];
		
		System.out.println("enter the values of array: ");
		
		for (int i = 0; i < size; i++);
		
			int i = 0;
			arr[i] = s.nextInt();
		
		System.out.println("enter the total number of targets that needs to be achieved: ");
		int targetNo = s.nextInt();
		
		while (targetNo-- != 0) {
			
		int flag = 0 ;
		
			long target;
			
			System.out.println("enter the value of target: ");
			target = s.nextInt();
			
			long sum = 0;
			
			for (int i1 = 0; i1 < size; i1++) { //linear iteration , linear searching
				
				sum += arr[i1];
				
				if (sum >= target) {
					
					System.out.println("target achieved after "+(i1 + 1) + " transactions\n ");
					
					flag = 1;
					
					break;
				}
			}
			
			if (flag == 0) {
				System.out.println(" given target is not achieved ");
			}
		}
	}
}
