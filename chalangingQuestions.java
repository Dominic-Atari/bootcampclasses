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
		System.out.println(sumOfDigits(24578000));  // Output: 11
		
		
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
        
       /* - We use an enhanced for loop (also known as a for-each loop) to iterate 
           over the elements of charArray.
        - Inside the loop, we print each character to the console using System.out.println().
//_______________________________________________END______________________________________________
        
        
     4  Create a method call avgNameLength that takes in an Array of String stored in names, write a 
     program that will traverse the Array.
The names Array will hold 5 names that are entered by the user
Here is a reminder of how to access an element in an array:
    // if arrayName is an Array of String
    arrayName[index] // This will access the String located in arrayName at index
    arrayName[0] // This will access the first String in arrayName -- remember that Arrays are zero-indexed
    arrayName[0].length() // This will give the length of the String stored in location zero (0)
The method avgNameLength will traverse the Array and find the average length of all the names that are part of names
Return the average length of all the names 
        */
       
        String[] names = new String[5];
		names[0] = "John";
		names[1] = "Mina";
		names[2] = "Khan";
		names[3] = "Mzeefgsefrg";
		names[4] = "Oker";
		
		double avarageNameLenght = avarageNameLenght(names);
		System.out.println("_________________________");//show separator.
		
		System.out.println(avarageNameLenght);
//_______________________________________________END______________________________________________
	
	//5
		/* Write a loop (any type of loop will work) that does a countdown using the 
    	 * given variable countDown.
    	Check to make sure the number stored in countDown is not larger 
    	than 10 and is greater than or equal to 3
    	The loop should run from the value stored in countDown down to 1
    	Each time the loop runs, print the value of the counter followed by 
    	three periods (…)
    	Once out of the loop, print "We have lift off!"
    	Use System.out.println() to print everything to the console
    	If countDown is less than 3 or greater than 10, then the only message printed to 
    	the console is "We have lift off!"*/
    	int countDown = 5;
    	if(countDown <= 10 && countDown >=3) {
    		for(int i = countDown; i >= 1; i--) {
    			System.out.println(i+ "...");
    		} 
    			
}else {
	System.out.println("We have lift off!");
}
//_______________________________________________END______________________________________________

   //6
   /*Build A New Array

Given an Array of words named arr and variables word1, word2, and word3 do the following:
Create a new Array called newArr that has word1, word2, and word3 as it's elements
Create another Array that is big enough to hold all of the words from the original Array arr, 
as well as the three new words. You can name this Array to your liking.
Write a loop to get the words from the original Array arr and put them into your new Array
Add the words from newArr into the new Array also
Finally, loop through your new Array and print each element to the console
An idea to get more practice with Arrays: You could create an Array for the three new words, and 
then loop through two Arrays to create your new Array.
    	
    	//loop through arr and coppy elements to arrCombined
    			for(int i = 0; i < arr.length; i++){
    			arrCombined[i] = arr[i];
    			}
    			
    			//loop through newArr and coppy elements to arrCombined
    			for(int i = 0; i < newArr.length; i++){
    			arrCombined[arr.length +i] = newArr[i];
    			}
    			
    			//loop through arrCombined and print each element.
    			for (int i =0; i < arrCombined.length; i++) {
    	            System.out.println(arrCombined[i]);
    	        }
    			*/
    			
    	
//_______________________________________________END______________________________________________
  
    	
    	
    	//7.
    	/*Reverse An Array

Using the initialized Array named arr that uses five (5) integers provided by the user as elements.
Create a new Array called reverseArr that is the reverse of the original Array arr
Then write a loop that will iterate through each Array and print each element in the console
Note: You should print the elements of both Arrays
Hint: Both Array should have the same amounts of elements and therefore have the same lengths

    	//loop through arr and print elements before reversed
    	for(int i = 0; i < arr.length; i++){
    	    System.out.println(arr[i]);
    	}
    	
    	//loop through arr and print reversed elements
    	int[] reverseArr = new int[arr.length];
    	for(int i = 0; i < arr.length; i++){
    	    reverseArr[i] = arr[arr.length -1-i];
    	    System.out.println(reverseArr[i]);
    	}
    	*/
//_______________________________________________END______________________________________________

    	//8
    	/*Multidimensional Arrays
   This is an advanced problem!

In this problem you will create a multidimensional Array of int named arr.
You are given two integer variables, a and b that are user inputs
Use these integer values to initially declare your new Array arr, where these integers determine
 the size of both dimensions of the Array
Then, use these int values to create both an inner and outer Array using some type of loop 
(maybe a for loop) that starts at zero and goes to whatever number values are stored in a and b
To complete this problem, when you've populated the Arrays (after the nested loops have completed),
 print the last element of the first Array to the console.
Here are a few tips:

Error Checking: Make sure both numbers entered by the user are greater than two (2). 
If not, print the following message to the console: "Both numbers need to be greater than 2."
You will need to create two loops to populate the multidimensional Array, storing the index of the
 second loop in the Array positions.
Extra comments are provided to help you along the way.
Hint: With firstPosition meaning the first position in an Array, and lastPosition meaning the last
 position in an Array, print to the console the value stored in the following position 
 in the Array: arr[firstPosition][lastPosition]. For example: arr[0][arr[0].length - 1]
	
	
	// Check for error -- invalid parameters with an if/else
	        if(a <= 2 || b <= 2){
	            
	            System.out.println("Both numbers need to be greater than 2.");
	        }else{
	           
	        
	
		    // If both parameters are > 2
		    // Declare a multidimensional array something like this:
		    //          int[][] arr = new int[param1][param2];
		    int[][] arr = new int[a][b];
		        
	            
		
		    // Create two loops to populate your new multidimensional array
		    // Note:  you will need a new index in each for-loop. 
		    //          one index will be used for the first for-loop's index (0 to param1 - 1)
		    //          the second index will be used for the second for-loop's index (0 to param2 - 1)		
		            for(int i = 0; i < arr.length; i++){
	                for(int j = 0; j < arr[i].length; j++){
	                    arr[i][j] = j;
	                }
	            }
		  
	        
		
		    // After you have populated your multidimensional array, 
		    // Print out the value of arr[firstPosition][lastPosition]
		    System.out.println(arr[0][arr[0].length -1]);
		    
		    
	        }	    
		
	}
	
	*/
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
		1. Remove the last digit from the number by performing integer division by 10 
		(digits /= 10).
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
	//4
	//METHOD
	//Because the questiond need to calculate avarage, that mean the return data type is an double.
	public static double avarageNameLenght(String[] names) {
		
		int totalLength = 0;
		double sum1 = 0;
		for(int x = 0; x < names.length; x++) {
			sum1 += names[x].length();
			
			
		}
		
			
		return sum1 / names.length;
		
	
	
		
		
	}
}
