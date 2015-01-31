/* Purpose: This vending machine accepts specific payments from the user for the following 5 products and then 
 * returns the change in coins only. User presses "0" to stop the transaction and move on to 
 * choose their product. 
 * Name : Misheel Ganbat
 * Class : CSC 201
 * Instructor : Mr. Tanes
 * Date : 01.28.2015

 Algorithm: 
1. Initialize all five products with their names.
2. Initialize all the payments that are appropriate. (coins, $1,and $5)
3. Assign prices for each one of the products.
4. User can keep choosing more and more products as long as they have sufficient money.
5. Display all five items with its set prices.
6. Notify the user about only accepting coins, one dollar, and five dollar bills. 
7. User presses "0" to stop.
8. User presses product number to choose.
9. User receives the product.
10. User receives the change if any, but only in coins. 
*/
import java.util.Scanner;
public class VendingMachine {

	public static void main(String[] args){
		// initializing products and prices
		String  product1  = "hot cheetos"; 			double penny = 0.01;
		String	product2 = "lays";					double nickel = 0.05;
		String	product3 = "sunchips";				double dime = 0.10;
		String	product4 = "fritos";				double quarter = 0.25;
		String	product5 = "doritos";			    double dollar1 = 1;
													double dollar5 = 5;												
	double product1Price = 1.25;					boolean money = true;
	double product2Price = 1.55;					double total = 0;
	double product3Price = 1.75;					
	double product4Price = 2.00;
	double product5Price = 3.00;
	// welcoming user and introducing products offered with its prices
	System.out.println("Hello! Welcome to the Chips Vending Machine. Here are the five products I offer.");
	System.out.println(product1 + "= $"+ product1Price);
	System.out.println(product2 + "= $"+ product2Price);
	System.out.println(product3 + "= $"+ product3Price);
	System.out.println(product4 + "= $"+ product4Price);
	System.out.println(product5 + "= $"+ product5Price);

	System.out.println("Please enter your payment in only coins, one dollar bill, and/or five dollar bills");
	//instantiation
	Scanner keyboard = new Scanner (System.in);
	while (money){ 
	double payments = keyboard.nextDouble ();
	if (payments==penny || payments==nickel || payments==dime || payments ==quarter || payments==dollar1 || payments==dollar5){
		total += payments;
		System.out.println("Payments=" + total);
		
		money = true;
		
	}
	else if ( payments == 0){
		// while money is being accepted
		System.out.println("Go ahead and choose your product");
		money = false;
	}
	
	
	else {
		 money = false;
		System.out.println("Sorry, I do not recognize this amount. Transaction is cancelled");
		 System.exit(0);
		 
	// if all conditions are satisfied and the user is ready 
		 if (payments > 0){
			 System.out.println("Please select more than one item");
			 boolean newMoney = true;
			 // if and only if the user has more money than for only 1 product
			 while (money){
				 int selection = keyboard.nextInt ();
			// if the user is finished and/or wish to cancel
				 if (selection==0) {
					 if (payments > 0) {
				System.out.println("Your change is");
				System.out.println("Thank you for your transaction");
					 } else {
						 System.out.println("Transaction cancelled");
					 }
					 System.exit(0);
	//check again if the user has anymore money left
							

					}
				}
			}
						 
				
					 }
				 }
				 
			 }

	

	}

