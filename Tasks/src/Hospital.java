import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.StringJoiner;
/*
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите количество пациентов: ");
        var scanner = new Scanner(System.in);
        var patientsCount = Integer.parseInt(scanner.nextLine());
        var hospital = new Hospital(patientsCount);

        System.out.println("Введите команду для получения информации: ");
        var command = scanner.nextLine();

        while (true) {
            switch (command) {
                case "HEALTH":
                    System.out.println(hospital.getCountHealthy());
                case "T STR":
                    System.out.println(hospital.getTemperaturesToString());
                case "T AVG":
                    System.out.println(hospital.getAverageTemp());
                case "REPORT":
                    System.out.println(hospital.getReport());
                case "EXIT":
                    break;
            }
        }
    }
}

public class Hospital {
    private static final int NOT_VALID_VALUE = -1;
    private static final int MIN_TEMPERATURE = 32;
    private static final int MAX_TEMPERATURE = 40;
    private static final float LOWER_HEALTH_TEMP_THRESHOLD = 36.2f;
    private static final float UPPER_HEALTH_TEMP_THRESHOLD = 36.9f;
    private final int patientsCount;
    private float[] patientsTemperatures;
    private int healthyPeopleCount = NOT_VALID_VALUE;
    private double avgTemperature = (double) NOT_VALID_VALUE;
    private String temperaturesList;
    private String report;


    public Hospital(int patientsCount) {
        if (patientsCount <= 0) {
            throw new IllegalArgumentException("Количество пациентов не может быть меньше 0");
        }
        this.patientsCount = patientsCount;
    }

    public float[] generatePatientsTemperatures() {
        var permissibleDeviation = MAX_TEMPERATURE - MIN_TEMPERATURE;

        if (patientsTemperatures == null) {
            patientsTemperatures = new float[patientsCount];

            for (var i = 0; i < patientsCount; i++) {
                patientsTemperatures[i] = (float) (MIN_TEMPERATURE +
                        permissibleDeviation * Math.random());
            }
        }
        return patientsTemperatures;
    }

    public int getCountHealthy() {
        if (healthyPeopleCount == NOT_VALID_VALUE) {
            checkIfTemperaturesGenerated();
            var healthyCount = 0;

            for (float t : patientsTemperatures) {
                if (t >= LOWER_HEALTH_TEMP_THRESHOLD
                        && t <= UPPER_HEALTH_TEMP_THRESHOLD) {
                    healthyCount++;
                }
            }
            healthyPeopleCount = healthyCount;
        }
        return healthyPeopleCount;
    }

    public String getTemperaturesToString() {
        if (temperaturesList == null) {
            var temperatureFormat = new DecimalFormat("#0.0");
            var sj = new StringJoiner(" ");

            checkIfTemperaturesGenerated();

            for (var t : patientsTemperatures) {
                sj.add(temperatureFormat.format(t));
            }
            temperaturesList = sj.toString();
        }
        return temperaturesList;
    }

    public double getAverageTemp() {
        var sum = 0.0;

        if (avgTemperature == NOT_VALID_VALUE) {
            checkIfTemperaturesGenerated();

            for (float t : patientsTemperatures) {
                sum += t;
            }
            avgTemperature = sum / patientsCount;
        }
        return avgTemperature;
    }

    public String getReport() {
        var averageFormat = new DecimalFormat("#0.00");

        checkIfValuesCalled();

        if (report == null) {
            report = "Температуры пациентов: " + temperaturesList +
                    "\nСредняя температура: " + averageFormat.format(avgTemperature) +
                    "\nКоличество здоровых: " + healthyPeopleCount;
        }
        return report;
    }

    void checkIfTemperaturesGenerated() {
        if (patientsTemperatures == null) {
            patientsTemperatures = generatePatientsTemperatures();
        }
    }

    void checkIfValuesCalled() {
        if (healthyPeopleCount == NOT_VALID_VALUE) {
            getCountHealthy();
        }
        if (avgTemperature == NOT_VALID_VALUE) {
            getAverageTemp();
        }
        if (temperaturesList == null) {
            getTemperaturesToString();
        }
    }
}

 */
