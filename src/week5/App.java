package week5;

public class App {

	public static void main(String[] args) {
		Logger logger = new AsteriskLogger();
		
		logger.log("Hello");
		logger.error("Try Again ");
		
		Logger logger2 = new SpacedLogger();
		logger2.log("Hello Again");
		logger2.error("Incorrect");
	}


	}


