package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int numOfCustomers = scan.nextInt();
		
		Double total = 0.0;
		
		String firstName = scan.next();
		
		String lastName = scan.next();
		
		int items = scan.nextInt();
		
		int[] amount = new int[items];
		
		Double[] price = new Double[items];
		
		String[] itemName = new String[items];
		
		
	
		 for (int i = 0; i < items; i++) {
			amount[i] = scan.nextInt();
			itemName[i] = scan.next();
			price[i] = scan.nextDouble();
		}
		 
		 
		
		for(int i = 0; i < amount.length; i ++) {
			total = (Double) (total + (amount[i] * price[i]));
		}
		
		
		System.out.println(firstName.charAt(0) + "." + " " + (lastName));
		System.out.println(total);
				
		scan.close();
		
	
}

}
 
