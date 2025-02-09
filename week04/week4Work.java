package bootcampClasses.week04;

public class week4Work {

	public static void main(String[] args) {
		/*1. Create an array of int called ages that contains the following values:
		 *  3, 9, 23, 64, 2, 8, 28, 93.*/
		System.out.println("Question 1..............");// Organize display in the console.
		// array list.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
			
		//a). subtract the value the of first element from the value of the last element.
		System.out.println("a.............");
		int subtractNum = ages[ages.length -1] - ages[0];
		System.out.println(subtractNum);
	
		//b). create a new array called ages2. it should be longer than length in array in ages
		// i)
		
		int[] ages2 = new int[ages.length + 1];
		ages2[0] = 10;
		ages2[1] = 1;
		ages2[2] = 12;
		ages2[3] = 17;
		ages2[4] = 20;
		ages2[5] = 100;
		ages2[6] = 34;
		ages2[7] = 11;
		ages2[8] = 51;
		
		// ii). subtract the value the of first element from the value of the last element.
		System.out.println("ii)..............");
		int subtractNum1 = ages2[ages2.length -1] - ages2[0];
		System.out.println(subtractNum1);
		
		//iii). Show that using the index values for the elements is dynamic 
		//(works for arrays of different lengths).
		System.out.println("iii)..............");
		for(int i = 0; i < ages2.length; i++) {
			System.out.println(i+1+ "-" +ages2[i]);
		}
		
		//2). Create arrays of String
		System.out.println("Question 2a)..............");
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		//calculate sum of names.
		double sumOfNames = 0;
		for(String name : names) {
			sumOfNames += name.length();
			
		}
		System.out.println(sumOfNames);
		
		//average
		double average = sumOfNames/ names.length;
		System.out.println("Average number of letters per name: " + average);
	
		System.out.println("Question 2b)..............");
		
		//loop through Array of string and concatenated with space.
		String sum = "";
		for(int i = 0; i < names.length; i++) {
			sum += names[i] +" ";
			
		}
		System.out.println(sum);
		//How to access the last element of an Array
		System.out.println("Question 3)..............");
		System.out.println(names[names.length -1]);
		
		//how do i access the first element in Array
		System.out.println("Question 4)..............");
		System.out.println(names[0]);
		
		/*Question 5. Create a new array of int called nameLengths. 
		 	Write a loop to iterate over the previously created names array and add the length of each 
		    name to the nameLengths array.*/
		System.out.println("Question 5)..............");
		int[] nameLengths = new int[names.length];
			for(int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
			// Iterate through the new int Array to access each element 
			for(int c : nameLengths) {
				System.out.print(c + " ");
			}
			System.out.print("\nQuestion 6)..............\n");
			//6. calculate the sum of elements in the new array
			int sum1 = 0;
			for(int addedNum : nameLengths) {
			sum1 += addedNum;
			}
			System.out.println(sum1);
			
			/* Q7. Write a method that takes a String, word, and an int, n, as arguments and returns the word 
			 concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, 
			 I expect the method to return “HelloHelloHello”).*/
			System.out.println("Question 7)..............");
			System.out.println(concatenated("Hello", 2));
		
			/*Q8. Write a method that takes two Strings, firstName and lastName, and returns a full name 
		  (the full name should be the first and the last name as a String separated by a space).*/
			System.out.println("Question 8)..............");
			System.out.println(names("jacob", "rose"));
			
			/*Q9. Write a method that takes an array of int and returns true if the sum of all the ints 
			 * in the array is greater than 100.*/
			System.out.println("Question 9)..............");
				int[] num = new int[3];
				num[0] = 30;
				num[1] = 40;
				num[2] = 50;
				
				System.out.println(checkNum(num));
				
				/*10. Write a method that takes an array of double and returns the average of all the elements
				 *  in the array.*/
				System.out.println("Question 10)..............");
				double[] num1 = {10, 12, 6, 7};
				System.out.println(average(num1));
				
				/*Q11. Write a method that takes two arrays of double and returns true if the average of 
				 * the elements in the first array is greater than the average of the elements in the 
				 * second array.*/
				System.out.println("Question 11)..............");
				double[] numberA = {15, 80, 3};
				double[] numberB = {20, 120, 30};
				
				System.out.println(twoAverages(numberA, numberB));
				
				/*12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double 
				 * moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater 
				 * than 10.50.*/
				System.out.println("Question 12)..............");
				boolean isHotOutside = true;
				double  moneyInPocket = 10.50;
				
				System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
				
				/*13. Create a method of your own that solves a problem. 
				 * In comments, write what the method does and why you created it.*/
				
				//Declare a variable to hold the arguments.
				System.out.println("Question 13)..............");
				double aboveTheLine = 45.6;
				boolean canHearEverywhere = !true;
				
				System.out.println(detectNoice(aboveTheLine, canHearEverywhere));
				
	}
	
		//Q7 METHOD.
			
			public static String concatenated(String name, int n) {
				String num = "";
				for(int i = 0; i < n; i++) {
					num += name;
				}
				return num;
				
					
	}
			
		//Q8 METHOD.
			public static String names(String firstName, String lastName) {
				String fullName = firstName +" "+ lastName; 
		
				return fullName;
	}
		//Q9 METHOD.
			public static boolean checkNum(int[] num) {
				int n =0;
				for(int i =0; i < num.length; i++) {
					n += num[i];
					
				}
					return n > 100;
				
	}
		//Q10 METHOD.
			public static double average(double[] num1) {
				double sum =0;
				for(int i =0; i < num1.length; i++) {
					sum += num1[i];
				}
				return sum/ num1.length;
	}
		//Q11 METHOD.
			public static boolean twoAverages(double[] numberA, double[] numberB) {
				int sumA = 0;
				for (int i = 0; i < numberA.length; i++) {
					sumA +=numberA[i];
				}
				double averageA = sumA/numberA.length;
				
				int sumB = 0;
				for (int j = 0; j < numberB.length; j++) {
					sumB +=numberB[j];
				}
				double averageB = sumB/numberB.length;
				
				return averageA > averageB;
					
			}
			public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
				if(moneyInPocket <10.50 || !isHotOutside ) {
					return false;
				}
				    return true;
			}
			// prevent hearing lost.
			public static boolean detectNoice(double aboveTheLine, boolean canHearEverywhere) {
				if(aboveTheLine > 40 && canHearEverywhere) {
					System.out.println("please use ear plugs");
					return true;
				}else {
					System.out.println("it's optional to use ear plugs");
				}
				return false;
			}
}

