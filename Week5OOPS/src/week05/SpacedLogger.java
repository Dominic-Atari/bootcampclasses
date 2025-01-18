package week05;

public class SpacedLogger implements Logger{

	@Override
	public void log(String name) {
		for(char c : name.toCharArray()) {
			System.out.print(c +" ");
			
		}
		
	}

	@Override
	public void error(String name2) {
		System.out.print("\nERROR:");
		for(char c : name2.toCharArray()) {
			System.out.print(c + " ");
		}
		
	}

	
	
}
	
	


