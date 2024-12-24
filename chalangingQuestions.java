package bootcampClasses;

public class chalangingQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		1. Complete the method called sumOfDigits that takes an integer variable called
		   digits. Then return the sum of all the digits in digits. 
		   For example, 245 would be 2 + 4 + 5 = 11.
		*/
	//BODY
		System.out.println(sumOfDigits(24578));  // Output: 11
		
		
		/*2. Complete the method called passwordChecker that accepts the 
		String stored in variable password.
		The method should check to make sure that password is at least 8 characters in length 
		and contains one of 4 special symbols, !, $, %, or &
		The method should return true or false.
		String password = "MyP@ssword";
        boolean result = passwordChecker(password);
        System.out.println("Password meets requirements: " + result);
______________________________________END__________________________________________________*/
		
	
	/*2.Complete the method called passwordChecker that accepts the String 
	 * stored in variable password.
The method should check to make sure that password is at least 8 characters in length
 and contains one of 4 special symbols, !, $, %, or &
The method should return true or false.*/
		
		//BODY
		String password = "MyP@ssword";
        boolean result = passwordChecker(password);
        System.out.println("Password meets requirements: " + result);
        
        
    
		/*HOW IT WORKD
IN THE BODY
public static void main(String[] args) {
- This is the entry point of the Java program.
- The public access modifier means it can be accessed from any class.
- The static keyword means it can be called without creating an instance of the class.
- The void return type means it doesn't return any value.


Step 2: Define a password variable

String password = "MyP@ssword";

- We define a String variable named password and assign it a value.
- In a real-world application, you'd typically get the password from user input.


Step 3: Call the passwordChecker method

boolean result = passwordChecker(password);

- We call the passwordChecker method, passing the password variable as an argument.
- The method returns a boolean value, which we store in the result variable.


Step 4: Print the result

System.out.println("Password meets requirements: " + result);

- We use System.out.println to print a message to the console.
- The message includes the result of the password check.

IN THE METHOD.
Step 5: Define the passwordChecker method

public static boolean passwordChecker(String password) {

- This method checks if the password meets certain requirements.
- It takes a String parameter password and returns a boolean value.


Step 6: Check password length

if (password.length() < 8) {
return false;
}

- We check if the password length is less than 8 characters.
- If it is, we immediately return false.


Step 7: Check for special symbols

String[] symbols = {"!", "$", "%", "&"};
for (String symbol : symbols) {
if (password.contains(symbol)) {
return true;
}
}

- We define an array of special symbols.
- We iterate over the array using a for-each loop.
- For each symbol, we check if the password contains it using the contains method.
- If we find a symbol, we immediately return true.


Step 8: Return false if no symbols found

return false;

- If we've checked all symbols and haven't returned true, we return false.
- This indicates that the password does not meet the requirements.
______________________________________END___________________________________________________


3.Given the variable userWord, create a new Array that is made up of the 
characters of the word stored in the variable.
.Initialize a new Array, name it whatever you want
.Make sure to use the correct Java data type for this new Array (data type char)
.Add each letter of userWord to the Array as elements
.Once you have populated the Array, print to the console each element of the Array

		 */
        
        //Step 1: Declare the variable userWord

        String userWord = "Dominic";
        //- We declare a String variable named userWord and assign it the value "Hello".
        
       //Step 2: Create a new char array
        
        char[] stringToChar = new char[userWord.length()];
  /*- We create a new char array named charArray.
- We use the length() method of the String class to get the length of userWord.
- We pass this length to the char array constructor to set its size.*/
  
  		//Step 3: Populate the char array with characters from userWord
        
        for(int i = 0; i < userWord.length(); i++) {
        	stringToChar[i] = userWord.charAt(i);
        }
        /*- We use a for loop to iterate over the characters of userWord.
- Inside the loop, we use the charAt() method of the String class to get the character 
         at the current index.
- We assign this character to the corresponding index in the charArray.*/
        
        //Step 4: Print each element of the char array

        for (char c : stringToChar) {
        System.out.println(c);
        }

       /* - We use an enhanced for loop (also known as a for-each loop) to iterate over the elements of charArray.
        - Inside the loop, we print each character to the console using System.out.println().*/
//_______________________________________________END______________________________________________
        
        
	}
	//1.
	//METHOD.
	public static int sumOfDigits(int digits) {
	    int sum = 0;
	    while (digits > 0) {
	        sum += digits % 10;
	        digits /= 10;
	    }
	    return sum;
	    
/*
 * 		HOW IT WORKS.
	    1. Initialize a variable sum to 0 to store the sum of the digits.
	    1. Use a while loop to extract each digit from the input number.
	    1. Inside the loop, calculate the last digit of the number 
	     using the modulus operator (digits % 10).
		1. Add the last digit to the sum.
		1. Remove the last digit from the number by performing integer division by 10 (digits /= 10).
		1. Repeat steps 3-6 until all digits have been processed (i.e., until digits becomes 0).
		1. Return the final sum.
		In the main method, we call sumOfDigits with the example input 245 and print the 
		result to the console.
		___________________________________________________________________________________________
		
		3.Given the variable userWord, create a new Array that is made up of the characters 
		of the word stored in the variable.
		.Initialize a new Array, name it whatever you want
		.Make sure to use the correct Java data type for this new Array (data type char)
		.Add each letter of userWord to the Array as elements
		.Once you have populated the Array, print to the console each element of the Array
*/
	    	
	}
	//2
	//METHOD
	public static boolean passwordChecker(String password) {
        String[] symbols = {"!", "$", "%", "&"};
        if (password.length() < 8) {
            return false;
        }
        for (int i = 0; i < symbols.length; i++) {
            if (password.contains(symbols[i])) {
                return true;
            }
        }
        return false;
    }

}
