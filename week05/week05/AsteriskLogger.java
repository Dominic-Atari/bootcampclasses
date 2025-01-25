package week05;

public class AsteriskLogger implements Logger{
	
	//implemented methods.

	@Override
	public void log(String log) {
		System.out.println("***" +log+ "***\n");
		
	}

	@Override
	public void error(String error) {
		
		System.out.println("****************");
		
		System.out.print("Error: " + error);
		
		System.out.println("\n****************");
		
	}
	

}
