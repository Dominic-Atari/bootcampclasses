package bootcampClasses.week1.src.week1;

public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a loop (any type of loop will work) that does a countdown using the given variable countDown.
Check to make sure the number stored in countDown is not larger than 10 and is greater than or equal to 3
The loop should run from the value stored in countDown down to 1
Each time the loop runs, print the value of the counter followed by three periods (…)
Once out of the loop, print "We have lift off!"
Use System.out.println() to print everything to the console
If countDown is less than 3 or greater than 10, then the only message printed to the console is "We have lift off!"*/
int countDown = 3;
			if(!(countDown >= 10) && countDown >= 3){
		for(int i = countDown; i >1; i--) {
			System.out.println(i+"...");
		}
		System.out.println("We have lift off!");
		}else{
			System.out.println("We have lift off!");
		}
		

	}

}
