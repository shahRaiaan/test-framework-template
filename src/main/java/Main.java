
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
private static Logger logger = LoggerFactory.getLogger(Main.class);
	public static void main(String[] args) {
		//System.out.println(System.getProperty("user.dir"));
		//System.setProperty("log4j.configurationFile", System.getProperty("user.dir")+"/log4j2.properties");
		//PropertyConfigurator.configure(System.getProperty("user.dir")+"/log4j2.properties");
		//BasicConfigurator.configure();
		String message = "______Hello there_____";
		logger.info("Info--------------- "+message);
		logger.debug("debug--------------- "+message);
		logger.error("error--------------- "+message);
		logger.trace("trace--------------- "+message);
		
		
		
	}

}
