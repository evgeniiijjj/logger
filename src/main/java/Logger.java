import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    private static Logger logger;
    private int count;

    private Logger() {}

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String message) {
        System.out.printf("\r[%s %s %d] %s\n", LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
                , LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")), ++count, message);
    }
}
