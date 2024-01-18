/*
public class Main {
    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {
        var hourCount = 2;
        var minutesInHour = 60;
        var secondsInMinute = 60;
        var millisecondsInSecond = 1000;

        var timeInMilliseconds = hourCount * minutesInHour * secondsInMinute * millisecondsInSecond;

        var startSearchTime = new Date(System.currentTimeMillis());
        var endSearchTime = new Date(startSearchTime.getTime() + timeInMilliseconds);

        return airport.getTerminals()
                .stream()
                .flatMap(time -> time.getFlights().stream())
                .filter(flyInfo -> flyInfo.getDate().after(startSearchTime)
                        && flyInfo.getDate().before(endSearchTime)
                        && flyInfo.getType() == Flight.Type.DEPARTURE)
                .collect(Collectors.toList());
    }
}

 */