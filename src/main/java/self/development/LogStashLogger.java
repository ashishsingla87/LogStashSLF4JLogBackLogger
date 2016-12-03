package self.development;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by ashish on 11/25/2016.
 * simple sorts which writes
 */
public class LogStashLogger {
    private final static Logger logger = LoggerFactory.getLogger(LogStashLogger.class);
    public static void main(String[] args) {
        for(int i=0; i<200; i++){
            logger.info("this is log statement "+i);

        }
        logger.error("test error");
    }
}
