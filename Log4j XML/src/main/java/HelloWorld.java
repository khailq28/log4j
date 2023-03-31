import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class HelloWorld {

    private static final Logger logger = LogManager.getLogger(HelloWorld.class);
    public static void main(String[] args) {
        DOMConfigurator.configure("src/main/resources/log4jConsoleAndFile.xml");
        logger.debug("Sample debug message");
        logger.info("Sample info message");
        logger.warn("Sample warn message");
        logger.error("Sample error message");
        logger.fatal("Sample fatal message");

    }

}  