import java.util.ArrayList;
import java.util.Scanner;
/*
class Main {
    private static final String HELP_MESSAGE = "Примеры команд:\n" +
            "Добавление клиента: add Иван Иванов ivanivanov@mail.ru +79876543210\n" +
            "Вывод списка клиентов: list\n" +
            "Удаление клиента: remove Иван Иванов\n" +
            "Подсчет клиентов: count\n" +
            "Вывод примеров команд: help";

    public static void main(String[] args) {
        //TODO напишите консольное приложение для взаимодействия с продавцами
        var customerStorage = new CustomerStorage();
        var scanner = new Scanner(System.in);

        while (true) {
            var currentInput = scanner.nextLine();
            var command = currentInput.split(" ");

            switch (command[0]) {
                case "add":
                    customerStorage.addCustomer(currentInput.substring(4));
                    continue;
                case "list":
                    customerStorage.listCustomers();
                    continue;
                case "remove":
                    customerStorage.removeCustomer(currentInput.substring(7));
                    continue;
                case "count":
                    System.out.println(customerStorage.getCount());
                    continue;
                case "help":
                    System.out.println(HELP_MESSAGE);
            }
        }
    }
}

class Customer {
    private final String name;
    private final String surname;
    private final String email;
    private final String phone;
    //TODO реализуйте методы и поля класса Customer

    public Customer(String name, String surname, String email, String phone) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String toString() {
        return name + " - " + surname + " - " + email + " - " + phone;
    }
}

class CustomerStorage {
    //TODO реализуйте методы и поля класса CustomerStorage
    ArrayList<Customer> customers = new ArrayList<Customer>();

    public void addCustomer(String data) {
        var info = data.split(" ");

        checkLengthCorrectness(info, 4);

        checkEmailCorrectness(info[2]);
        checkPhoneCorrectness(info[3]);

        customers.add(new Customer(info[0], info[1], info[2], info[3]));
    }

    public void listCustomers() {
        for (Customer customer: customers) {
            System.out.println(customer.toString());
        }
    }

    public void removeCustomer(String data) {
        customers.remove(getCustomer(data));
    }

    public Customer getCustomer(String data) {
        var info = data.split(" ");

        checkLengthCorrectness(info, 2);

        for (Customer customer: customers) {
            if (customer.getName().equals(info[0])
                    || customer.getSurname().equals(info[1])) {
                return customer;
            }
        }

        return null;
    }

    public int getCount() {
        return customers.size();
    }

    public static void checkPhoneCorrectness(String phone) {
        var correctPhone = "\\+7\\d{10}";
        if (!phone.matches(correctPhone)) {
            throw new IllegalArgumentException("Неверный формат номера телефона: " + phone);
        }
    }

    public static void checkEmailCorrectness(String email) {
        var correctEmail = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";
        if (!email.matches(correctEmail)) {
            throw new IllegalArgumentException("Неверный формат номера телефона: " + email);
        }
    }

    public void checkLengthCorrectness(String[] data, int correctLength) {
        if (data.length != correctLength) {
            throw new IllegalArgumentException("Недопустимая длина строки: " + data.length);
        }
    }
}

 */
