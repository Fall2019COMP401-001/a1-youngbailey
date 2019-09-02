package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int numOfCustomers = scan.nextInt();
		
		for(int i = 0; i < numOfCustomers; i++) {
		
		Double total = 0.0;
		
		String firstName = scan.next();
		
		String lastName = scan.next();
		
		int items = scan.nextInt();
		
		int[] amount = new int[items];
		
		Double[] price = new Double[items];
		
		String[] itemName = new String[items];
		
		
	
		 for (int j = 0; j < items; j++) {
			amount[j] = scan.nextInt();
			itemName[j] = scan.next();
			price[j] = scan.nextDouble();
		}
		 
		 
		
		for(int j = 0; j < amount.length; j ++) {
			total = (Double) (total + (amount[j] * price[j]));
		}
		
		
		
		System.out.println(firstName.charAt(0) + "." + " " + (lastName) + ": " + String.format("%.2f", total));
		
				
		
		
		}
scan.close();
	}

}
 
