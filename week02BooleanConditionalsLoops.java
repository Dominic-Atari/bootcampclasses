package bootcampClasses;

public class week02BooleanConditionalsLoops {

public static void main(String[] args) {
		
		//
		// BOOLEANS and CONDITIONALS:
		//
		
		// 1. Variable Declaration:
		//		a. Create a variable named age and assign it a value of 14
		
				int age = 10;
		
		
		// 2. Print a Boolean Expression:
		//		a. Print the boolean expression age >= 16 to the console and note the results.
		//		a. Change the value of age to 18 and print again.

				System.out.println(age >= 16);
		
		// 3. Can you drive?
		//		a. Using a conditional, print one of the following:
		//				i. "You can drive" if age is greater than or equal to 16
		//				ii. "You cannot drive" otherwise
		//
		//		a. Change the value of age and rerun to see the result
	
				if (age >= 16) {
					System.out.println("You can drive");
				}else {
					System.out.println("You cannot drive");
				}
		
		// 4. Update Solution to Question 3 as follows:
		//		a. Add a new variable called hasLicense before the conditional.
		//		b. Change the boolean expression in the conditional to additionally 
		//				include the need for hasLicense to be true.
		//		c. Try changing the values of age and hasLicense and note the different results.
				
				boolean hasLisence = true;
				boolean taller = true;
				if (age >= 16 && hasLisence && taller) {
					System.out.println("you are good to go");
				}else {
					System.out.println("not eliginle to drive");
				}
		
		// 5. Milk?
		//		a. Create two new variables - costOfMilk and thirstLevel
		//		b. Create a new conditional that prints "Milk Please" if costOfMilk is less than 2.50 
		//				or if thirstLevel is greater than 6 and prints "No Thanks" otherwise.
		//		c. Change the values and note the different results.
				double costOfMilk = 6.30;
				int thirstLevel = 7;
				
				if ( costOfMilk < 2.50 || thirstLevel > 6) {
					System.out.println("Milk Please");
					}else{
					System.out.println("no thanks");
				}
				
	
		
		// 6. Cookie Distribution: 
		//			Note:  You will evenly distribute all of the cookies to the children 
		//					and as the adult you get to keep the remaining cookies for yourself.
		//
		//		a. Create two variables called numberOfCookies and numberOfChildren.
		//		b. Initialize the two variables to integer values.
		//		b. Use a conditional to print the following based on the following conditions:
		//				i. If there are 0 cookies remaining, print "Sad Face"
		//				ii. If there are less than 2 cookies, print "Yes!"
		//				iii. If there are less than 5 cookies, print "Whoohoooo!"
		//				iv. If there are 5 or more cookies, print "Jackpot!"

				int numberOfCookies = 14;
				int numberOfChildren = 12;
				
				double remainingCookies = numberOfCookies % numberOfChildren;
				
			if (remainingCookies == 0) {
				System.out.println("Sad Face");
				
			}else if (remainingCookies < 2) {
				System.out.println("Yes");
				
			}else if(remainingCookies < 5) {
				System.out.println("Whoowoooo!");
				
			}else{
				System.out.println("Jackpot");
			}
				
				
		// 7.  Loyalty Member Program:
		//		a. Create a variable called loyaltyMemberStatus and assign the value "SILVER"
		//		b. Create a variable called loyaltyMemberDiscount and assign the value 0.0
		//		c. Using a switch, set the value of loyaltyMemberDiscount based on 
		//				the following loyaltyMemberStatus scale: 
		//				i. "SILVER" is 0.10
		//				ii. "GOLD" is 0.15
		//				iii. "PLATINUM" is 0.25
			String loyaltyMemberStatus = "GOLD";
			double loyaltyMemberDiscount = 0.0;
			
			switch(loyaltyMemberStatus) {
			case "SILVER":
				loyaltyMemberDiscount = 0.1;
				break;
			case "GOLD":
				loyaltyMemberDiscount = 0.15;
				break;
			case "PLATINUM":
				loyaltyMemberDiscount = 0.25;
				break;
				
			}

			System.out.println(loyaltyMemberDiscount);
			
		// 8. Using the Loyalty Member Program variables from Question 7, do the following:
		//		a. Create a variable called billTotal and assign a value
		//		b. Create a variable called adjustedTotal and assign it the billTotal minus 
		//				the loyaltyMemberDiscount percent of the billTotal
		//		c. If the adjustedBillTotal is greater than $500 upgrade the 
		//				loyaltyMemberStatus from SILVER to GOLD or from GOLD to PLATINUM

			int billTotal = 700;
			double adjustedTotal = billTotal - loyaltyMemberDiscount * billTotal;
			if (adjustedTotal > 500) {
				if (loyaltyMemberStatus == "SILVER") {
					System.out.println("GOLD");
				}else if(loyaltyMemberStatus == "GOLD") {
					System.out.println("PLATINUM");
				}
			}
			System.out.println(loyaltyMemberDiscount);
		
		// 9. Login -- username & password:
		//		a. Create two variables, username and password
		//		b. Create a conditional that prints one of the following:
		//				i. "login successful" if the username is "Tommy123" and the password is "12345"
		//				ii. "access denied" otherwise

				String username = "Tommy123";
				String password = "1234";
				if (username.equals("Tommy123") && password.equals("1234")) {
					System.out.println("loged successfull");
				}else {
					System.out.println("access denied");
				}
		
		//
		// LOOPS:
		//
		
		// 10. Write a for loop that prints each number from 0 to 9
				
				for (int i = 0; i < 10; i++) {
				System.out.println(i);	
				}
		
		
		// 11. Write a for loop that prints each number from 10 to 0 backwards

				for (int i = 10; i >= 0; i--) {
					System.out.println(i);
				}
					
		
		// 12. Write a for loop that prints every other number from 0 to 100

				for (int j = 10; j <= 100; j+=10)  // this j+=10 iterates numbers that are divisible by 10 only.
					System.out.println(j+" "+(j % 10 ==0)); //Even Or System.out.println(j % 2 !=0); for Odd
		
		// 13. Write a for loop that iterates from 0 to 100 and prints 
		//			"EVEN" if the number is even and "ODD" if it's odd
				
				for(int x = 0; x <= 100; x++) {
					if(x % 2 ==0) {
						System.out.println(x + " EVEN");
					}else{
						System.out.println(x + " ODD");
					}
				} 
					
			
				
		
		// 14. Write a while loop that starts at 100 and iterates backwards by 1 until it reaches 0
		//			within the loop, divide each number by 3 and print the remainder to the console.
					
					int d = 100;
					while(d > 0) {
						System.out.println(d + " difided by 3 remains: " + (d % 3));
						d--;
					}
					
/*
 * BOOLEAN OPERATIONS PART 2.
 *

Some Review Sections are included here from the Boolean Operations Part 1 lesson.

Review: Boolean Operations
In Java, boolean is a data type that can hold one of two values: true or false. A boolean is commonly used to represent
 the result of a logical operation, such as a comparison or a conditional statement.
The operators often used in Boolean Expressions are &&, ||, and !. 
In Java, the boolean data type is a primitive data type.

Logical AND Operator
The && operator is called the logical AND operator. It evaluates to true only if both operands are true. 
If either operand is false, the operator evaluates to false. For example:

    boolean result1 = true && true;     //Output: true
    boolean result2 = true && false;    //Output: false
    boolean result3 = false && true;    //Output: false
    boolean result4 = false && false;   //Output: false
Example:
     int x = 5;
     int y = 10;
     boolean result = ( x < y && x == 5 );
     System.out.println(result);
In this example, we're using the && operator to check if both of these two conditions are true, first,
 if x is less than y, and second, if x is equal to 5. 
 Since both conditions are true, the result variable will be assigned the value true and, therefore, 
 true will print to the console.

Review: Logical OR Operator
The || operator is called the logical OR operator. It evaluates to true if either operand is true. 
If both operands are false, the operator evaluates to false. 
It is useful when we want to check if at least one of two conditions is true. 
If either condition is true, the entire expression evaluates to true.

    boolean result1 = true || true;     //Output: true
    boolean result2 = true || false;    //Output: true
    boolean result3 = false || true;    //Output: true
    boolean result4 = false || false;   //Output: false
     
Review: Logical NOT Operator
The ! operator is called the logical NOT operator. It negates the value of its operand. 
If the operand is true, the operator evaluates to false, and vice versa. 
It is a useful tool for negating the value of a Boolean Expression, 
which can be useful in certain situations where we want to check if something is not true.

Example:
    boolean result1 = !true;      //Output: false
    boolean result2 = !false;     //Output: true
 */
					/*Discounts are awarded if a person is a student OR if they are under the age of 18.
					 *  Using an integer variable called age and a boolean variable called isStudent, 
					 *  write an if/else statement that checks if age is under 18 or if isStudent is true.
					If age is less than 18 years old or isStudent is true then print to the console "You get a discount!"
					Else, print "Sorry, no discount for you."*/
					
					int myAge = 7;
					boolean isStudent = true;
					if(myAge < 18 || isStudent) {
						System.out.println("You get a discount!");
					}else {
						System.out.println("Sorry, no discount for you.");
					}
					
	}
}
