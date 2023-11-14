import java.util.*;
/*
public abstract class AbstractLogger {
    protected String name;
    protected Calendar calendar;

    public void setCalendar(TimeZone timeZone, int year, int month, int day, int hours, int minutes, int seconds) {
        calendar = new GregorianCalendar();
        TimeZone.setDefault(timeZone);
        calendar.setTimeZone(timeZone);
        calendar.set(year, month - 1, day, hours, minutes, seconds);
    }
    public abstract String info(String message);

    public abstract String debug(String message);

    public abstract String error(String message);

    public abstract String warning(String message);

    public abstract String toString();

}

public class DefaultLogger extends AbstractLogger {
    public DefaultLogger(String name) {
        this.name = name;
    }

    public String info(String message) {
        return "[INFO] " + "<" + calendar.getTime()
                + "> Вход пользователя: " + message;
    }

    public String debug(String message) {
        return "[DEBUG] " + "<" + calendar.getTime()
                + "> " + name + " - " + message;
    }

    public String error(String message) {
        return "[ERROR] " + "<" + calendar.getTime()
                + "> Не удалось найти данные пользователя: " + message;
    }

    public String warning(String message) {
        return "[WARNING] " + "<"+ calendar.getTime()
                + "> " + "Обнаружен неавторизованный доступ в систему: " + message;
    }

    public String toString() {
        return name + " — DefaultLogger";
    }
}

public class InputControlLogger extends AbstractLogger {
    public InputControlLogger(String name) {
        this.name = name;
    }

    public String info(String message) {
        return "[INFO] " + "<" + calendar.getTime()
                + "> Вход пользователя: " + message;
    }

    public String debug(String message) {
        return "[DEBUG] " + "<" + calendar.getTime()
                + "> " + name + " - " + message;
    }

    public String error(String message) {
        return "[ERROR] " + "<" + calendar.getTime()
                + "> Не удалось найти данные пользователя: " + message;
    }

    public String warning(String message) {
        return "[WARNING] " + "<" + calendar.getTime()
                + "> Обнаружен неавторизованный доступ в систему: " + message;
    }

    public String toString() {
        return name + " — InputControlLogger";
    }
}

public class LogManager {
    private final Map<String, AbstractLogger> loggers = new HashMap<String, AbstractLogger>();

    public void addLogger(AbstractLogger logger) {
        loggers.put(logger.name, logger);
    }

    public AbstractLogger getLogger(String name) {
        for (String key: loggers.keySet()) {
            if (key.equals(name))
                return loggers.get(name);
        }
        return new DefaultLogger(name);
    }

    public String printLoggers() {
        var info = new StringBuilder();
        for (String name: loggers.keySet()) {
            info.append(loggers.get(name).toString()).append("\n");
        }
        return info.toString();
    }
}


 */