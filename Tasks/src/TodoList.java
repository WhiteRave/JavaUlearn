import java.util.ArrayList;
import java.util.Scanner;
/*
public class TodoList {
    private ArrayList<String> todos = new ArrayList<String>();

    public static void main(String[] args) {
        var todoList = new TodoList();
        var scanner = new Scanner(System.in);

        while (true) {
            var command = scanner.nextLine().split(" ");
            var length = command.length;

            switch (command[0]) {
                case "LIST":
                    if (length == 1) {
                        System.out.print(todoList.getTodos());
                    } else {
                        throw new IllegalArgumentException("Неправильный формат ввода LIST");
                    }
                case "ADD":
                    if (length == 3) {
                        todoList.add(Integer.parseInt(command[1]), command[2]);
                    }
                    else if (length == 2) {
                        todoList.add(command[1]);
                    } else {
                        throw new IllegalArgumentException("Неправильный формат ввода ADD");
                    }
                case "EDIT":
                    if (length == 3) {
                        todoList.edit(command[1], Integer.parseInt(command[2]));
                    } else {
                        throw new IllegalArgumentException("Неправильный формат ввода EDIT");
                    }
                case "DELETE":
                    if (length == 2) {
                        todoList.delete(Integer.parseInt(command[1]));
                    } else {
                        throw new IllegalArgumentException("Неправильный формат ввода DELETE");
                    }
                case "EXIT":
                    break;
                default:
                    throw new IllegalArgumentException("Неизвестная команда");
            }
        }
    }

    public void add(String todo) {
        todos.add(todo);
    }

    public void add(int index, String todo) {
        checkCorrectness(index);
        todos.add(index, todo);
    }

    public void edit(String todo, int index) {
        checkCorrectness(index);
        todos.set(index, todo);
    }

    public void delete(int index) {
        checkCorrectness(index);
        todos.remove(index);
    }

    public ArrayList<String> getTodos() {
        return todos;
    }

    public void checkCorrectness(int index) {
        if (index < 0 || index > todos.size()) {
            throw new IllegalArgumentException("Неправильный формат ввода");
        }
    }
}
*/