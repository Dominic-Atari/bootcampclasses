package weeek01;

public class week01Questions {

	public static void main(String[] args) {
		/*Review: Overview
		Remember, in Java, programs contain data in three different forms: literals (or unnamed constants), variables, 
		and named constants.

		Every variable has a data type, which specifies the type of value that the variable can hold. Types 
		in Java fall into two categories, primitive types and reference types. 
		There are eight primitive data types in Java. All other types are reference types. 
		Reference data types in Java are data types which contains the address or the reference of dynamically created
		 objects, including classes which specify the types of Objects and Arrays.


		Review: Primitive & Reference Data Types
		Primitive Data Types:
        ____________________
		>byte: 8-bit integer (range of -128 to 127)
		>short: 16-bit integer (range of -32768 to 32767)
		>int: 32-bit integer (range of -2147483648 to 2147483647)
		>long: 64-bit integer (range of -9223372036854775808 to 9223372036854775807)
		>float: 32-bit floating point number (range of -3.4028235E38 to 3.4028235E38, with 7 digits of precision)
		>double: 64-bit floating point number (range of -1.7976931348623157E308 to 1.7976931348623157E308, with 15 
			digits of precision)
		>char: a single 16-bit Unicode character (range of '\u0000' to '\uffff'), use single quotes
		>boolean: true or false value
		Reference Data Types:

		>String: An Object that represents a sequence of characters, use double quotes
		>Array: A container Object of variables that holds a fixed number of values of a single type.
		and many others
		Review: Variable Initialization
		In Java, variables must be declared before they can be used. The syntax for declaring a variable is as follows:

		    <data type> <variable name>;
		It is also possible to declare a variable and assign it a value at the same time, this is referred to as 			initializing a variable. The syntax is as follows:

		    <data type> <variable name> = <initial Value>;
		Example:

		    int x = 7;

		    // The <data type> is int.
		    // The <variable name> is x.
		    // The <initial Value> is 7.
		Literals are values that are assigned directly to variables, for example:

		      int age = 25; 
		Here, the value 25 is a literal assigned to the variable age with a primitive data type of int, which is an 			integer.


		Review: Variable Declaration & Initialization
		Variables are named memory locations, the contents of which can vary. A variable declaration includes a data type 			and an identifier; optionally, it can include an initialization. For example:

		    1a    double price;  // declaration
		    2a    price = 14.99;  // initialization
		In the example above, the first line is declaring the variable with a data type of double and the identifier is 			price. On line 2a, the variable is assigned a value of 14.99 and it is being initialized.

		In the next example, notice that everything is being done simultaneously. Therefore, line b1 here is equivalent 			to the entire first example, lines 1a and 2a above accomplish what line 1b does below.

		    1b    double price = 14.99;  // doing both all at once 


		Review: Examples of Variable Declaration
		    // integer data type:  int
		    int myInteger = 42;

		    // double data type
		    double myDouble = 3.14159;

		    // boolean data type
		    boolean isSunny = true;

		    // character data type: char
		    char myChar = 'a';

		    // String data type
		    String myString = "Hello, world!";


		HOW TO SWAP VALUES.
		swap the following question.
		x = 3 and y = 5.
		SOLUTION
		*/
		int x = 3;
		int y = 5;
		 // We need to swap the values of two variables, x and y.
        // First, we store the value of x in a temporary variable so we don't lose it.
            
            int temporary = x;

        // Now, we can change the value of x to the value of y.
            x = y;

        //Finally, we assign the value stored in temporary (which was the original value of x) to y.
            y = temporary;
            //after printing in the concole, the result after this working will be
            //x = 5
            //y = 3
             System.out.println(x);
             System.out.println(y);
				// 1. Create a variable to hold the quantity of 
				//		available plane seats left on a flight		
					int availablePlaneSits = 6;
				
				// 2. Create a variable to hold the cost of groceries at checkout
					double costOfGroceriesAtCheckout = 26.904;
				
				// 3. Create a variable to hold a person's middle initial
					char midleInitial = 'D';
			
				// 4. Create a variable to hold true if it's hot outside 
				//		and false if it's cold outside
					boolean itIsHotOutside = true;
					
				// 5. Create a variable to hold a customer's first name
					String firstName = "Saima";
				
				// 6. Create a variable to hold a street address
					String streetAddress = "4700 East J Street";

				// 7. Print all variables to the console
					System.out.println(availablePlaneSits);
					System.out.println(costOfGroceriesAtCheckout);
					System.out.println(midleInitial);
					System.out.println(itIsHotOutside);
					System.out.println(firstName);
					System.out.println(streetAddress);

				// 8. A customer booked 2 plane seats, 
				//		remove 2 seats from the available seats variable
					//int availablePlaneSeats = availablePlaneSeats - 2;
					availablePlaneSits -= 2;

				// 9. Impulse candy bar purchase, add 2.15 to the grocery total
				// 		costOfGroceries = costOfGroceries + 2.15;
					//double CostOfGroceriesAtCheckout = costOfGroceriesAtCheckout + 2.15;
					costOfGroceriesAtCheckout += 2.05;
					
				// 10.  The birth certificate was printed incorrectly, 
				//		change the middle initial to something else
					midleInitial = 'F';
					System.out.println(midleInitial);
					
				// 11.  The season has changed, update the hot outside 
				//			variable to be opposite of what it was
					//itIsHotOutside = false;
					itIsHotOutside = !itIsHotOutside;
					System.out.println(itIsHotOutside);

				// 12.  Create a new variable called full name using the customer's first name, 
				//			the middle initial, and a last name of your choice
					String fullName = firstName + " "+ midleInitial+ " Loboi.";
					System.out.println(fullName);
					
				// 13.  Print a line to the console that introduces the customer and says they live
				// 			at the address variable
					System.out.println("hello, " + fullName + " welcome to the shop!, you live at " + streetAddress);
	}

}

/* TERMS USED.
 * String concatenation refers to the process of joining two or more Strings together to create a new String
 * camocase = is naming a variable by using uppercase at the beginning of each joined word.
 */

/*WHAT TO KNOW
 * // The <data type> is int.
    // The <variable name> is x.
    // The <initial Value> is 7.
     * int x = 7;
     * 
     * MODULO OPERATORS
     * in java and other programing languages modulo oprerator is used to calculate the remaining anount.
     * example
     * instead, int remainder = a - b;
     * you can use
     * int remainder = a % b;
     * hint:Let's suppose that int a = 20 and int b = 6. When we divide we get, 
     * 3 wholes with a remainder of 2 out of 20.
       Since 
       we can prove that the remainder is 2. The modulus is 2.
       Therefore, a % b returns a result of 2.
       
       EXAMPLE
       print the modulo of the following
       int x = 5 % 2;  // Output: x = 1, because 5 divided by 2 has a remainder of 1
    int y = 8 % 3;  // Output: y = 2, because 8 divided by 3 has a remainder of 2
    int z = 10 % 5;  // Output: z = 0, because 10 divided by 5 has no remainders

     */