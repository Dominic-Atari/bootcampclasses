package week05;

public class App {

	public static void main(String[] args) {
		
		AsteriskLogger asteriskLoggerr = new AsteriskLogger();
		SpacedLogger spacedLogger = new SpacedLogger();
		
		asteriskLoggerr.log("Wix");
		asteriskLoggerr.error("I am trying");
		
		spacedLogger.log("Trying\n");
		spacedLogger.error("Hello");
	}
}
