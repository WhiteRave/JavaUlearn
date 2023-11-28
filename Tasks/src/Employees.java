public class Main {
    public static ArrayList<Employee> staff;

    public static void main(String[] args, String path) {
        /*
        TODO проинициализируйте переменную staff, в переменной path хранится путь до файла с staff.txt,
          где хранятся данные о сотрудниках в формате:
            Жанна Ковалёва	78000	20.02.2018
            Степан Богданов	140000	17.04.2016
            Виктор Рязанов	95000	20.03.2017
        */
    }

    public static Employee findEmployeeWithHighestSalary(int year) {
        /*
        TODO реализуйте метод поиска сотрудника с максимальной заработной платой за указанный год — year,
         обработайте возможные ошибки ввода.
         используйте Stream API.
         */
    }

    public static ArrayList<Employee> sortEmployee(String column) {
        /*
        TODO отсортируйте список сотрудников по указанной колонке — column, это может быть name, salary или date,
         и верните список сотрудников, обработайте возможные ошибки ввода.
         Используйте Stream API.
         */
    }
}

public class Employee {

    public Employee(String name, Integer salary, Date workStart) {
    }

    public static ArrayList<Employee> loadStaffFromFile(String path) {
        /*
        TODO напишите метод загрузки сотрудников из файла
         */
    }

    public String toString() {
        /*
        TODO переопределите метод toString() в формате <name> — <salary> — <date>
         //date в формате dd.MM.yyyy
         */
    }

    @Override
    public boolean equals(Object o) {
        //TODO переопределите метод equals(), чтобы он корректно работал с Employee
    }
}