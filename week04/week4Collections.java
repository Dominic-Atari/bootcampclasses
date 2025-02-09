package bootcampClasses.week04;

public class week4Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name = "james";
		int num = 5;
		System.out.println(strBuilder(name, num));
		
/*String vs. StringBuilder


String:

In Java, a String is immutable, which means that it can not be modified.  
Strings are very useful in programming, but they should only be used if you are not modifying a String 
once you create it!  

The immutability of String is a feature, not a bug! 

James Gosling, the chief architect of Java,  is quoted as saying that he would use an immutable whenever 
he could.  The immutability of Strings provides features, such as security, caching, and reusability, 
without having to copy the String.  There are many resources that provide a lot of insight into Strings, 
such as the Oracle Java Tutorials -- Strings.  


To further unpack the immutability of the String Object, check this out: 
You can assign a new value to a String variable, but both values will remain in memory.  
In the following example, Java does not use the same space in memory, it leaves the value  Bob Brown and 
creates a new space for Sue Brown.  The syntax works, but it is not good coding practice to use the 
String datatype when you want to dynamically create or modify a String value within your code.


String name = "Bob Brown";
System.out.println(name);
name = "Sue Brown";
System.out.println(name);

Digging Deeper:   Explain what happens in the above example.   What does Java do when you assign a new 
value to a String? 


StringBuilder:

Java provides another Object that allows a programmer to build a String dynamically called StringBuilder, 
and it is mutable, which means that a StringBuilder can be modified.  
There are also great resources which discuss this Object, including the Oracle Java Tutorials -- The 
StringBuilder Class.

Here is an example using a StringBuilder:

package com.promineotech;
public class StringBuilderExample {
public static void main(String[] args) {

String firstName = "Bob";
String lastName = "Brown";
String middleInitial = "B";
String space = " ";

System.out.println(firstName);
System.out.println(lastName);

StringBuilder sb = new StringBuilder();

// use append() to dynamically create a String using StringBuilder 
sb.append(firstName);
sb.append(space);
sb.append(lastName);
System.out.println(sb.toString());

// Add a middle Initial
sb.insert(firstName.length()+1, middleInitial + space);
System.out.println(sb.toString());
}
}


Coding Challenge:  Write code that reverses a variable of type StringBuilder() without using the reverse() 
method, and then print the result to the Console.
________________________________________________________________________________________________________

	COLLECTIONS.
	What is a Collection?  Think of a Collection as an Object, but that Object can contain (or represent)
	 a group of Objects.  Java provides a Collection Framework, which is an architecture that allows a 
	 unified access to a variety of different collections.  You have already been introduced to Lists, 
	 and it was mentioned that a List an Interface that falls within the Collections Framework.  
	 Two additional types of Collection Interfaces are Sets and Maps.  

Collection Interfaces:  Set, List, Map, and others

Collection Implementations:  There are a number of classes provided in Java that are used to implement 
the Collection Interfaces.   See the Java Collections Framework Overview link below for additional 
information on Collection Implementations.

Interface --> Implementation
Set --> HashSet, TreeSet, LinkedHashSet
List --> ArrayList, LinkedList
Map --> HashMap, TreeMap, LinkedHashMap

The Collections Class:  

The Collections Class contains static methods that either return collections, or perform some operation 
on collections.  A NullPointerException is thrown by all methods of this class if the collections or 
Class Objects provided are null.  Check out the links below for information on the Java Class Collections.

Set:
No Duplicates
At most one Null element
Not guaranteed to be in any particular order

Set Example:

Notice the order of the Strings that are inserted into this Set. 

Set<String> vegetables = new HashSet<String>();

vegetables.add("Carrot");
System.out.println(vegetables);
vegetables.add("Onion");
System.out.println(vegetables);
vegetables.add("Broccoli");
System.out.println(vegetables);
vegetables.add("Asparagus");
System.out.println(vegetables);



What happens if you add a duplicate to a Set?
Questions to ask: 
1. Is an error thrown? 
2. Does the duplicate get stored?
   
vegetables.add("Carrot"); // no error thrown but the element will be printed as one object not two objects.
System.out.println(vegetables);

vegetables.add(null);
System.out.println(vegetables);

vegetables.add(null);
System.out.println(vegetables);

System.out.println("The size of our set is: " + vegetables.size());


Research question:  Think about usefulness of Sets.  What applications make sense for this Collection?



*
*/
	}

	public static String strBuilder(String name, int num) {
		
		String start = "";
		for(int i = 0; i < num; i++) {
			start += name;
		}
		return start;
	}
}
