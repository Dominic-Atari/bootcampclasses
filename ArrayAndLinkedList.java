package bootcampClasses;

public class ArrayAndLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 
 ARRAY LIST
 
 This lesson contains Questions 11-20 (Part 2) of the OpenClass Lists Lesson, and contains five (5) 
 coding questions, each followed by a mastery question.

Some Review Sections are included here from the Lists Part 1 lesson.




Review: Lists
Lists are a commonly used data structure in Java that allow you to store collections of data. 
Unlike Arrays, which have a fixed size, Lists can grow or shrink dynamically as elements are added or removed. 
In Java, the most commonly used implementation of a List is the ArrayList class, 
which is part of the java.util package.

Review: Vocabulary terms to know for Lists:
List: An ordered collection of elements that can be accessed by their index.
ArrayList: A class in Java that implements the List interface using an Array to store the elements.
LinkedList: A class in Java that implements the List interface using a Linked List to store the elements.
Element: An individual item in a List.
Index: A numeric value that represents the position of an element in a List.
Size: The number of elements in a List.
Iterator: An object that provides a way to traverse the elements of a List.
Review: Methods to know for Lists:
add(): A method used to add an element to a List.
clear(): A method used to remove all elements from a List.
contains(): returns true if the List contains the specified element, otherwise false.
get(): A method used to retrieve an element from a List at a specified index.
indexOf(): A method used to retrieve the index of a specified element in a List.
isEmpty(): A method used to check if a List is empty.
remove(): A method used to remove an element from a List.
set(): A method used to replace an element in a List at a specified index.
size(): returns the number of elements in the List.
subList(): A method used to retrieve a portion of a List between two specified indexes.
To use an ArrayList, you first need to import the java.util package at the beginning of your code. 
Then, you can declare a new ArrayList variable and specify the type of data that the list will store. 
For example, to create an ArrayList that stores integers, you can do:

    import java.util.*;
    public class App {
        public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);

           System.out.println(numbers.get(0));
        }
    }
In the example above, once the ArrayList is declared, elements can be added to it using the .add() method. 
You can also access elements in an ArrayList using their index, just like with Arrays. 
The .get() method returns the element at the specified index, where it says numbers.get(0), 
the first element, 1, will be printed to the console.

To remove elements from an ArrayList, you can use the .remove()method. For example:

    import java.util.*;
    public class App {
        public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);

            numbers.remove(1);
        }
    }
The .remove() method as used here, will remove the second element because it has an index of 1, or rather, 
the 2 will be removed
_________________________________________________________________________________________________________________ 
 
 LINKED LIST
 
 A Linked List is a data structure that is used to store a sequence of elements. Unlike an Array, which stores 
 elements in contiguous memory locations, a Linked List stores elements in separate nodes that are 
 linked together by pointers.

Each node in a Linked List contains an element of data, and a reference to the next node in the List. 
The first node in the List is called the head, and the last node is called the tail. 
The tail node's reference to the next node is null.

Linked Lists are dynamic data structures, meaning that they can grow or shrink in size during program execution. 
This makes them very useful for situations where the size of the data being stored is not known ahead of time.

Java LinkedList
To use a Linked List in Java, you need to create a LinkedList Object, which is part of the java.util package. 
You can then add elements to the List using the .add() method, remove elements using the .remove() method, and 
access elements using the .get() method similarly to an ArrayList Object.

Advantages and Disadvantages of LinkedList
One advantage of a LinkedList over an Array is that adding or removing elements from the middle of the 
LinkedList is very efficient. To insert an element into a LinkedList, you simply create a new node and adjust the 
references of the surrounding nodes. To remove an element, you just need to adjust the references of the surrounding 
nodes. However, LinkedLists can be less efficient than Arrays when it comes to accessing elements by index, 
because you need to traverse the List from the head or tail to get to the desired element. Overall, 
LinkedLists are a useful data structure to know about in Java and can be used in a variety of programming tasks.

Overall, ArrayList is a good choice when random access to elements is important, while LinkedList is a good choice 
when frequent insertions or deletions in the middle of the List are expected.

LinkedList Example:
    public class ShoppingList {
        public static void main(String[] args) {
            // Create a new LinkedList to store our shopping list
            LinkedList<String> shoppingList = new LinkedList<>();

            // Add some items to the list
            shoppingList.add("Apples");
            shoppingList.add("Bread");
            shoppingList.add("Bananas");
            shoppingList.add("Milk");
            shoppingList.add("Cheese");
            shoppingList.add("Eggs");
            shoppingList.add("Ham");

            shoppingList.remove(2);

            // Print out the entire shopping list using an enhanced for loop
            System.out.println("Shopping List:");

            for (String item : shoppingList) {
                System.out.println(item);
            }
        }
    }
In the example above, a LinkedList is initialized and 7 items are added to it.
Then the following is printed to the console:

    Shopping List:
    Apples
    Bread
    Bananas
    Milk
    Cheese
    Eggs
    Ham
Now imagine that you remember that you already have a pound of ham and a bunch of bananas at home. 
You need to remove the ham and bananas from the shopping list. This can be done by adding these two lines of code:

    shoppingList.remove(2);
    shoppingList.remove(6);
After removing those two elements from the LinkedList, the following is then printed to the console:

    Shopping List:
    Apples
    Bread
    Milk
    Cheese
    Eggs
 
 */
	}

}
