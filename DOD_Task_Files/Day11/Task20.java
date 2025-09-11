import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Task20 {
    private static final Logger logger = LogManager.getLogger(Task20.class);

    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        int sum = x + y;
        logger.debug("x = " + x);
        logger.debug("y = " + y);
        logger.debug("sum = " + sum);
    }
}
