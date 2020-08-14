
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
private static Logger logger = LoggerFactory.getLogger(Main.class);
	public static void main(String[] args) {
		String message = "______Hello there_____";
		logger.info("Info--------------- "+message);
		logger.debug("debug--------------- "+message);
		logger.error("error--------------- "+message);
		logger.trace("trace--------------- "+message);
		
		
		
	}

}
