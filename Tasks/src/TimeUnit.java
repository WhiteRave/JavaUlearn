/*
public interface TimeUnit {
    //TODO реализуйте интерфейс TimeUnit
    public long toMillis();

    public long toSeconds();

    public long toMinutes();

    public long toHours();
}

public class TimeUnitUtils {
    //TODO реализуйте методы toMillis(), toSeconds() и toHours()
    public static Milliseconds toMillis(TimeUnit object) {
        return new Milliseconds(object.toMillis());
    }

    public static Seconds toSeconds(TimeUnit object) {
        return new Seconds(object.toSeconds());
    }

    public static Hours toHours(TimeUnit object) {
        return new Hours(object.toHours());
    }
}

public class Seconds implements TimeUnit{
    //TODO реализуйте класс Seconds, который наследует интерфейс TimeUnit
    private final long value;

    public Seconds(long value) {
        this.value = value;
    }

    @Override
    public long toMillis() {
        return value * 1000;
    }

    @Override
    public long toSeconds() {
        return value;
    }

    @Override
    public long toMinutes() {
        return (long)Math.round(value / 60.0);
    }

    @Override
    public long toHours() {
        return (long)Math.round(value / 60.0 / 60.0);
    }
}

public class Minutes implements TimeUnit{
    //TODO реализуйте класс Minutes, который наследует интерфейс TimeUnit
    private final long value;

    public Minutes(long value) {
        this.value = value;
    }

    @Override
    public long toMillis() {
        return value * 60 * 1000;
    }

    @Override
    public long toSeconds() {
        return value * 60;
    }

    @Override
    public long toMinutes() {
        return value;
    }

    @Override
    public long toHours() {
        return (long)Math.round(value / 60.0);
    }

}

public class Milliseconds implements TimeUnit{
    //TODO реализуйте класс Milliseconds, который наследует интерфейс TimeUnit
    private final long value;

    public Milliseconds(long value) {
        this.value = value;
    }

    @Override
    public long toMillis() {
        return value;
    }

    @Override
    public long toSeconds() {
        return (long)Math.round(value / 1000.0);
    }

    @Override
    public long toMinutes() {
        return (long)Math.round(value / 1000.0 / 60.0);
    }

    @Override
    public long toHours() {
        return (long)Math.round(value / 1000.0 / 60.0 / 60.0);
    }
}

public class Hours implements TimeUnit{
    //TODO реализуйте класс Hours, который наследует интерфейс TimeUnit
    private final long value;

    public Hours(long value) {
        this.value = value;
    }

    @Override
    public long toMillis() {
        return value * 60 * 60 * 1000;
    }

    @Override
    public long toSeconds() {
        return value * 60 * 60;
    }

    @Override
    public long toMinutes() {
        return value * 60;
    }

    @Override
    public long toHours() {
        return value;
    }

}


 */