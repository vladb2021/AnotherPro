package loggers;
import org.apache.logging.log4j.*;

public class Logging {

    static Logger logger = LogManager.getLogger(Logging.class);

    public static void main(String[] args) {

        logger.debug("Message: Debug");
        logger.error("Message: Error");
        logger.info("Message: Info");
        logger.fatal("Message: Fatal");
        logger.trace("Message: Trace");
        logger.warn("Message: Warn");
    }
}
