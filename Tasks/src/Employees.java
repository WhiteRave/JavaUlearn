import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;
/*
public class Main {
    public static ArrayList<Employee> staff;

    public static void main(String[] args, String path) {
        if (path == null) {
            throw new IllegalArgumentException("Некорректные данные");
        }
        staff = Employee.loadStaffFromFile(path);
    }

    public static Employee findEmployeeWithHighestSalary(int year) {
        if (year < 1910 || year > 2024) {
            throw new IllegalArgumentException("Некорректные данные");
        }

        var employeesByYear = staff
                .stream()
                .filter(employee -> employee.getWorkStartYear() == year)
                .collect(Collectors.toCollection(ArrayList::new));

        return employeesByYear
                .stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElse(null);
    }

    public static ArrayList<Employee> sortEmployee(String column) {
        if (column == null) {
            throw new IllegalArgumentException("Некорректные данные");
        }
        switch (column) {
            case "name":
                return staff.stream()
                        .sorted(Comparator.comparing(Employee::getName))
                        .collect(Collectors.toCollection(ArrayList::new));
            case "salary":
                return staff.stream()
                        .sorted(Comparator.comparing(Employee::getSalary))
                        .collect(Collectors.toCollection(ArrayList::new));
            case "date":
                return staff.stream()
                        .sorted(Comparator.comparing(Employee::getWorkStart))
                        .collect(Collectors.toCollection(ArrayList::new));
            default:
                throw new IllegalArgumentException("Некорректные данные");
        }
    }
}

public class Employee {
    private final String name;
    private final Integer salary;
    private final Date workStart;

    public Employee(String name, Integer salary, Date workStart) {
        this.name = name;
        this.salary = salary;
        this.workStart = workStart;
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    public Date getWorkStart() {
        return workStart;
    }

    public int getWorkStartYear() {
        var yearFormat = new SimpleDateFormat("yyyy");
        return Integer.parseInt(yearFormat.format(getWorkStart()));
    }

    public static ArrayList<Employee> loadStaffFromFile(String path) {
        if (path == null) {
            throw new IllegalArgumentException("Некорректные данные");
        }

        var file = Paths.get(path);
        if (!Files.exists(file))
            throw new IllegalArgumentException("Некорректные данные");

        var dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        var employees = new ArrayList<Employee>();

        try {
            var lines = Files.readAllLines(file);
            for (var line: lines) {
                var data = line.split("\\s+");
                var name = String.format("%s %s", data[0], data[1]);
                var salary = Integer.parseInt(data[2]);
                var workStart = dateFormat.parse(data[3]);

                employees.add(new Employee(name, salary, workStart));
            }
        } catch (java.io.IOException | java.text.ParseException e) {
            throw new IllegalArgumentException("Не удалось прочитать файл");
        }

        return employees;
    }

    public String toString() {
        var dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        return String.format("%s — %s — %s", getName(), getSalary(), dateFormat.format(getWorkStart()));
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass())
            return false;

        var employeeObject = (Employee) o;
        return (Objects.equals(name, employeeObject.name)) &&
                (Objects.equals(salary, employeeObject.salary)) &&
                (workStart.equals(employeeObject.workStart));
    }
}

 */