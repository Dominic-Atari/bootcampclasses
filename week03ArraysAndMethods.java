package bootcampClasses;

public class week03ArraysAndMethods {

	public static void main(String[] args) {

		//
		// Arrays:
		//

		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		System.out.println("\nQuestion 1:");
		int[] array = { 1, 5, 2, 8, 13, 6 };

		// 2. Print out the first element in the array
		System.out.println("\nQuestion 2:");
		System.out.println(array[0]);

		// 3. Print out the last element in the array without using the number 5
		System.out.println("\nQuestion 3:");
		System.out.println(array[array.length - 1]);

		// 4. Print out the element in the array at position 6, what happens?
		System.out.println("\nQuestion 4:");
		// System.out.println(array[6]);

		// 5. Print out the element in the array at position -1, what happens?
		System.out.println("\nQuestion 5:");
		// System.out.println(array[-1]);

		// 6. Write a traditional for loop that prints out each element in the array
		System.out.println("\nQuestion 6:");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		// 7. Write an enhanced for loop that prints out each element in the array
		System.out.println("\nQuestion 7:");
		for (int number : array) {
			System.out.println(number);
		}

		// 8. Create a new variable called sum, write a loop that adds
		// each element in the array to the sum
		System.out.println("\nQuestion 8:");
		double sum = 0;
		for (int number : array) {
			sum += number;
		}
		System.out.println(sum);

		// 9. Create a new variable called average and assign the average value of the
		// array to it
		System.out.println("\nQuestion 9:");
		double average = sum / array.length;
		System.out.println(average);

		// 10. Write an enhanced for loop that prints out each number in the array
		// only if the number is odd
		System.out.println("\nQuestion 10:");
		for (int number : array) {
			if (number % 2 == 1) {
				System.out.println(number);
			}
		}

		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and
		// "Robert"
		System.out.println("\nQuestion 11:");
		String[] names = { "Sam", "Sally", "Thomas", "Robert" };
		for (String name : names) {
			System.out.println(name);
		}

		// 12. Calculate the sum of all the letters in the new array
		System.out.println("\nQuestion 12:");
		int sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters += name.length();
		}
		System.out.println(sumOfLetters);

		
		//
		// Methods:
		//

		// 13. Write and test a method that takes a String name and prints out a
		// greeting.
		// This method returns nothing.
		System.out.println("\nQuestion 13:");

		greet("Tom");
		greet("Sally");

		// 14. Write and test a method that takes a String name and
		// returns a greeting. Do not print in the method.
		System.out.println("\nQuestion 14:");
		String greeting = greet2("Nick");
		System.out.println(greeting);

		// Compare method 13 and method 14:
		// a. Analyze the difference between these two methods.
		// b. What do you find?
		// c. How are they different?

		// 15. Write and test a method that takes a String and an int and
		// returns true if the number of letters in the string is greater than the int
		System.out.println("\nQuestion 15:");
		System.out.println(isStringLongerThanNumber("Hello", 3));

		// 16. Write and test a method that takes an array of string and a string and
		// returns true if the string passed in exists in the array
		System.out.println("\nQuestion 16:");
		System.out.println(doesArrayContainString(names, "Sam"));

		// 17. Write and test a method that takes an array of int and
		// returns the smallest number in the array
		System.out.println("\nQuestion 17:");
		System.out.println(findSmallestNumber(array));

		// 18. Write and test a method that takes an array of double and
		// returns the average
		System.out.println("\nQuestion 18:");
		double[] doubles = { 45.7, 30.2, 67.3 };
		System.out.println(calculateAverage(doubles));

		// 19. Write and test a method that takes an array of Strings and
		// returns an array of int where each element
		// matches the length of the string at that position
		System.out.println("\nQuestion 19:");
		int[] nameLengths = extractStringLengths(names);
		for (int number : nameLengths) {
			System.out.println(number);
		}

		// 20. Write and test a method that takes an array of strings and
		// returns true if the sum of letters for all strings with an even amount of
		// letters
		// is greater than the sum of those with an odd amount of letters.
		System.out.println("\nQuestion 20:");
		System.out.println(hasMoreEvenWordCharacters(names));

		// 21. Write and test a method that takes a string and
		// returns true if the string is a palindrome
		System.out.println("\nQuestion 21:");
		System.out.println(isPalindrome("racecar"));

	}

	// Method 13:
	public static void greet(String name) {
		System.out.println("Hello, " + name + "!");
	}

	// Method 14:
	public static String greet2(String name) {
		return "Hi, " + name + "!";
	}

	// Method 15:
	public static boolean isStringLongerThanNumber(String string, int number) {
		return string.length() > number;
	}

	// Method 16:
	public static boolean doesArrayContainString(String[] array, String string) {
		for (String str : array) {
			if (str.equals(string)) {
				return true;
			}
		}
		return false;
	}

	// Method 17:
	public static int findSmallestNumber(int[] numbers) {
		int smallest = numbers[0];
		for (int number : numbers) {
			if (number < smallest) {
				smallest = number;
			}
		}
		return smallest;
	}

	// Method 18:
	public static double calculateAverage(double[] array) {
		double sum = 0;
		for (double number : array) {
			sum += number;
		}
		return sum / array.length;
	}

	// Method 19:
	public static int[] extractStringLengths(String[] strings) {
		int[] results = new int[strings.length];
		for (int i = 0; i < strings.length; i++) {
			results[i] = strings[i].length();
		}
		return results;
	}

	// Method 20:
	public static boolean hasMoreEvenWordCharacters(String[] array) {
		int evenLetters = 0;
		int oddLetters = 0;

		for (String string : array) {
			if (string.length() % 2 == 0) {
				evenLetters += string.length();
			} else {
				oddLetters += string.length();
			}
		}

		return evenLetters > oddLetters;
	}

	// Method 21:
	public static boolean isPalindrome(String string) {
		for (int i = 0; i < string.length() / 2; i++) {
			if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
}
		/*What is a method?
In Java, a method is a block of code that performs a specific task. Think of it this way, 
a method is a set of coding instructions which can be referenced by name, 
and called at any point in a program by simply using the method's name. 
The main purpose of writing methods is code reusability, which implies that the code is written 
once, and then can be used over and over. 
Additionally, methods are useful when breaking down complex programs into smaller, more manageable
 pieces. A method would then be written to solve the smaller piece, and would be called from the 
 main program or another method. Methods can be called from other parts of the program, 
 making it easy to reuse code and make changes to the program's behavior.

The Parts of a Method
method declaration: The only required parts of a method declaration are the method's return type,
 name, a pair of parentheses (), and a body between braces {}.
method signature: Two of the components of a method declaration comprise a method signature — 
the method's name and the parameter types. (Note: a method signature does not contain 
anything else.)
There are other parts that can be used when writing a Java method. 
The complete list of components of a method declaration are as follow:
-Modifiers: Access Modifiers (e.g. public, private, protected) or Non-Access Modifiers 
(e.g. static)
-Return Type: Either the data type (primitive or reference) of the value to be returned by the 
method, or void (no return value)
-Method Name: A name give to the method, following the rules for field names, written in camelCase
 format.
-Parameter List: Either (), or a list of input parameters, comma-delimited, preceded by the 
data type, enclosed in ().
-Exception List: This is a list of Exceptions that can be thrown by the method -- Error Handling.
-Method Body: the code written, enclosed in {}



Method Declaration
When writing a method, you need to specify its name, return type, and any parameters it may take, 
as well as write a body which contains the functionality of the method.

The name of the method should be descriptive and indicate what the method does.
The return type specifies the type of data that the method will return, and if the method does not
 return any data, its return type is void.
Any parameters are optional and allow you to pass data to the method when it is called if required.
The body will contain any Java statements that accomplish the purpose of the method.
Example Method Declaration
  public int calculateSum(int number1, int number2) {
        return number1 + number2;
  }


Method Invocation
To call a method, you simply use its name followed by parentheses (), and any necessary arguments 
within the parentheses. The method will then execute its code, and may return a value if a 
return type other than void is specified.

Example Method Invocation
   int num1 = 5;
   int num2 = 5;
   int sum = calculateSum(num1, num2);


Conclusion
Using methods in Java can help make your code more modular, efficient, and easier to understand. 
It also allows you to reuse code and avoid repeating the same code over and over again. 
By learning how to use methods effectively, you can become a more proficient and 
efficient Java programmer.

*
*Parts of a Static Method
public static: These are modifiers that specify the scope and behavior of the method. 
	public is an access modifier meaning the method can be accessed from anywhere in the program, 
	and static is actually a non-access modifier which means the method belongs to the class and 
	not to any instance of the class.
int: This is the return type of the method. It specifies what type of value the method will return.
addNumbers: This is the name of the method. It should be a descriptive name that tells you what 
the method does.
(int a, int b): These are the method parameters. In this case, the method takes two int values as 
input, which are named a and b.
int sum = a + b;: This line creates a new variable named sum, which is an int type, and assigns it
 the value of a + b. This calculates the sum of the two input values.
return sum;: This line returns the value of sum as the result of the method. 
	The return keyword is used to specify the value that the method will return. 
	In this case, it returns the sum of the two input values.
Calling a Static Method
To call this method outside of the class MyClass, you would use the following code:

   int result = MyClass.addNumbers(8, 6);

   System.out.println(result);

   // Output: 14
Where MyClass is the name of the class that contains the addNumbers method. 
This would assign the value 14 to the variable result.

Return Type void
Example of a Method with a void Return Type:
    public void printMessage(String message) {
        System.out.println(message);
    }
The example above takes a String argument and prints it to the console. 
It does not return any value, which is indicated by the void return type. 
To call this method, you would use the following code:

 printMessage("Hello, world!");

 // Output: Hello, world!
Vocabulary terms:
Argument: A value that is passed to a method when it is called. Arguments are enclosed in 
	parentheses and separated by commas.
Call: The act of invoking a method by its name. Method calls typically include the method name 
	followed by parentheses, which may contain arguments.
Method: A block of code that performs a specific task. Methods can be called by other parts of the
 	program to execute the task.
Method signature: The combination of a method name and its parameter types, which uniquely 
	identifies the method.
Overloading a method: Creating multiple methods with the same name but different parameter lists.
Return type: The data type of the value returned by a method. If a method doesn't return a value, 
	its return type is void.
Parameter: A variable that is declared in the method declaration and is used to accept an argument 
	passed to the method.
Scope: The region of the program where a variable can be accessed. Variables declared within a 
	method have local scope and can only be accessed within that method. 
	Additionally, a variable declared inside pair of brackets {} anywhere within any method has
 	scope within the brackets only, loop variables are an example of this.
Signature: The combination of a method name and its parameter types.
Static method: A method that is associated with a class, rather than with an instance of the class.
Syntax: The set of rules that govern the structure of a program.
void: A return type used when a method doesn't return a value.

The different types of variable scope in Java are:
Local Scope: A variable declared inside a method or a block of code has local scope. 
	It can only be accessed within that method or block.
Class Scope: A variable declared inside a class but outside a method has class scope. 
	It can be accessed by all methods and blocks of code within the class.
Method Parameter Scope: A variable declared as a parameter of a method has method parameter scope.
 	It can only be accessed within that method.
Static Scope: A variable declared as static has static scope. It can be accessed by all methods 
	and blocks of code within the class and can also be accessed without creating an instance of 
	the class.
It's important to understand variable scope in Java as it can help avoid errors and ensure code is
 	written in a way that is easy to maintain and understand.
 	
 	MULTIDIMENTIONAL ARRAY
 	Multidimensional Arrays
Multidimensional Arrays are a type of Array in Java that can store data in more than one dimension. They are essentially Arrays of Arrays, where each element in the Array is itself an Array. They are useful for storing and manipulating data that has a 2D structure, such as matrices, tables, and grids. A 2D Array is a special case of a multidimensional Array, where each element in the main Array contains another Array, resulting in two dimensions (rows and columns). However, in general, a multidimensional Array can have more than two dimensions, allowing for even more complex data structures to be created.

Example of how to Initialize 2D Arrays:
    //declares a 2D integer Array with 3 rows and 4 columns
    int[][] matrix1 = new int[3][4]; 


    //declares and initializes a 2D integer Array with 3 rows and 4 columns
    int[][] matrix2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}; 
The total elements in a 2D Array can be calculated by multiplying the number of rows by the number of columns. In the examples above, each 2D Array would be initialized with 12 elements total.

To access an element in a multidimensional Array, you need to specify the indices of both the row and column that the element is located in. Multidimensional Arrays can be useful for storing and manipulating data that has more than one dimension, such as matrices, images, and maps. They can also be sorted and searched just like one-dimensional Arrays. However, they can be more complex to work with than one-dimensional Arrays, and it's important to keep track of the dimensions and indices of the elements when working with multidimensional Arrays. Overall, understanding how to work with multidimensional Arrays is an important skill for any Java developer who needs to work with complex data structures.

Example of a MultiDimensional Array:
    public class App{
        public static void main(String[] args){

            // a 2D Array with 3 rows and 4 columns
            int[][] numbers = {{11, 12, 13, 14},
                               {21, 22, 23, 24},
                               {31, 32, 33, 34}};

            // print out the elements in the Array
            for (int i = 0; i < numbers.length; i++) {
               for (int j = 0; j < numbers[i].length; j++) {
                  // prints the columns of a row
                  System.out.print(numbers[i][j] + " ");
               }
               // prints each row on a new line
               System.out.println();
            }    
        }
    }
In this example, we first create a 2D Array called numbers with 3 rows and 4 columns using an Array initializer. We then use a nested for loop to iterate over the rows and columns of the Array, and print out each element using the indices i and j.

When we run this program, it will output the elements in each Array in the 2D Array, as follows:

   /* Output:
    11 12 13 14
    21 22 23 24
    31 32 33 34
    */ 


