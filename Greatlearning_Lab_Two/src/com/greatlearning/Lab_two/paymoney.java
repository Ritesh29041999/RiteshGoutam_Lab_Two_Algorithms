package com.greatlearning.Lab_two;
import java.util.Scanner;
import java.util.*;

public class paymoney {

	public static void main(String args [])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of transaction");
		int transaction_size = scan.nextInt();
		int array_size []= new int [transaction_size];
		System.out.println("Enter the no of transcation targets to be achieved ");
		int transaction_target= scan.nextInt();
		System.out.println("Enter the Value of target that needs to be achieved");
		int value_target= scan.nextInt();
		int temp = 0;
		
		for(int count = 0; count<transaction_size; count++) {
			System.out.print("Enter the amount "+(count + 1)+"  ");
			array_size[count]=scan.nextInt();
			}
		
			for(int count = 0; count<transaction_size ; count++){
			System.out.println(array_size[count]+" ");
			}
			
			for (int count = 0; count<transaction_size ;count++){
			temp = temp+array_size[count];
			if ( temp>=value_target) {
		    	System.out.println("Target Value achieved at "+ (count+1) +" Element ");
		    	break;
			}
		    	else {
		    		System.out.println("Target value NOT Achieved");
		    		break;
		    	}
			}
			if(transaction_size > transaction_target) {
		    	System.out.println("Transaction target Achieved");
		    }
		    	else {
		    		System.out.println("Transaction target NOT Achieved");
		    	}
			}	
	}


