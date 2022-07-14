import java.util.*;
import java.util.Scanner;

public class Traveller {

	public static void main(String[] args) {
		int amount=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of Denominations");
		int denomination = scan.nextInt();
		int array []= new int[denomination];
		int temp=0;
		for (int i =0; i<denomination;i++) {
			System.out.println("Enter the denomination values "+(i+1));
			array[i]=scan.nextInt();
		}
		System.out.println("Enter the amount you want to pay in multiples of denomination input");
		amount=scan.nextInt();
	    for(int i=0;i<denomination-1;i++) {
	    	for(int j=i+1;j<denomination;j++) {
	    		if(array[j]>array[i]) {
	    			temp=array[i];
	    			array[i]=array[j];
	    			array[j]=temp;
	    		}
	    	}
		}
		for (int i =0; i<denomination;i++) {
		System.out.println(array[i]);
	}
		
		int no_of_notes= amount;
		int flag = 0;
		
		while(amount>0 && flag ==0) {
			for(int i = 0; i<denomination;i++) {
				if((amount / array[i])>0) {
				    no_of_notes = amount / array[i];	
					amount = amount % array[i];
					System.out.println("Denomination "+ array[i]+", No of notes  =    "+no_of_notes);
					System.out.println(amount);
				}
				else if ((i==denomination-1) && (amount % array[denomination-1]!=0)){
						System.out.println(" Sorry!! "+amount+" Amount cant be divided by your input denomination, try with different denominations");
						flag = 1;
						break;
						}	
			
				}
				}
		}		
	}



