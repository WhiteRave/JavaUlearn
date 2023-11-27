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
        return String.format("[INFO] <%s> Вход пользователя: %s",
                calendar.getTime(), message);
    }

    public String debug(String message) {
        return String.format("[DEBUG] <%s> %s - %s",
                calendar.getTime(), name, message);
    }

    public String error(String message) {
        return String.format("[ERROR] <%s> Не удалось найти данные пользователя: %s",
                calendar.getTime(), message);
    }

    public String warning(String message) {
        return String.format("[WARNING] <%s> Обнаружен неавторизованный доступ в систему: %s",
                calendar.getTime(), message);
    }

    public String toString() {
        return String.format("%s — DefaultLogger", name);
    }
}

public class InputControlLogger extends AbstractLogger {
    public InputControlLogger(String name) {
        this.name = name;
    }

    public String info(String message) {
        return String.format("[INFO] <%s> Вход пользователя: %s",
                calendar.getTime(), message);
    }

    public String debug(String message) {
        return String.format("[DEBUG] <%s> %s - %s",
                calendar.getTime(), name, message);
    }

    public String error(String message) {
        return String.format("[ERROR] <%s> Не удалось найти данные пользователя: %s",
                calendar.getTime(), message);
    }

    public String warning(String message) {
        return String.format("[WARNING] <%s> Обнаружен неавторизованный доступ в систему: %s",
                calendar.getTime(), message);
    }

    public String toString() {
        return String.format("%s — InputControlLogger", name);
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