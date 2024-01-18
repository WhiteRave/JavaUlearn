import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    public static void main(String[] args) {
        var fileName = "C:\\Users\\koksh_3gp5jbj\\Documents\\GitHub\\JavaUlearn\\Tasks\\src\\movementList.csv";

        var movements = new Movements(fileName);
        System.out.println("Сумма расходов: " + movements.getExpenseSum() + " руб.");
        System.out.println("Сумма доходов: " + movements.getIncomeSum() + " руб.");

        System.out.println("Расходы по организациям:");
        var expenses = movements.getListOfExpenses();
        for (var expense : expenses) {
            System.out.println(expense);
        }
    }
}

class Movements{
    private final ArrayList<Movement> movements;

    public Movements(String path){
        movements = new ArrayList<>();

        if (path == null) {
            throw new IllegalArgumentException("Некорректные данные " + path);
        }

        var file = Paths.get(path);
        if (!Files.exists(file)) {
            throw new IllegalArgumentException("Некорректные данные: несуществующий файл");
        }

        try {
            var lines = Files.readAllLines(file);
            for (var i = 0; i < lines.size(); i++) {
                if (i == 0) {
                    continue;
                }
                var data = lines.get(i).split(",");

                var accountType = data[0];
                var accountNumber = data[1];
                var currency = data[2];
                var date = data[3];
                var reference = data[4];
                var description = data[5];

                var income = 0.0;
                var expense = 0.0;
                if (data.length == 8) {
                    income = format(data[6]);
                    expense = format(data[7]);
                } else if (data.length == 9) {
                    income = format(data[6]);
                    expense = format(data[7] + "." + data[8]);
                }

                var movement = new Movement(accountType, accountNumber, currency,
                        date, reference, description, income, expense);
                movements.add(movement);
            }
        } catch (java.io.IOException e) {
            throw new IllegalArgumentException("Некорректные данные в файле");
        }

    }

    public double getExpenseSum() {
        java.math.BigDecimal sum = new java.math.BigDecimal(0);
        for (var movement: movements) {
            sum = sum.add(java.math.BigDecimal.valueOf(movement.getExpense()));
        }
        return sum.doubleValue();
    }

    public double getIncomeSum() {
        java.math.BigDecimal sum = new java.math.BigDecimal(0);
        for (var movement: movements) {
            sum = sum.add(java.math.BigDecimal.valueOf(movement.getIncome()));
        }
        return sum.doubleValue();
    }

    public double format(String sum) {
        if (sum.startsWith("\"")) {
            sum = sum.substring(1, sum.length() - 1);
        }
        return Double.parseDouble(sum);
    }

    public ArrayList<String> getListOfExpenses() {
        HashMap<String, Double> expenses = new HashMap<>();

        for (var movement : movements) {
            var organization = movement.getOrganization();
            expenses.put(organization,
                    expenses.getOrDefault(organization, 0.0)
                            + movement.getExpense());
        }

        ArrayList<String> expensesList = new ArrayList<>();
        for (var organization : expenses.keySet()) {
            var expense = expenses.get(organization);
            expensesList.add(organization + " -> " + expense + " руб.");
        }

        return expensesList;
    }
}

class Movement {
    private final String type;
    private final String number;
    private final String currency;
    private final String date;
    private final String reference;
    private final String description;
    private final double income;
    private final double expense;

    public Movement(String accountType, String accountNumber,
                    String currency, String date, String reference,
                    String description, double income, double expense) {
        this.type = accountType;
        this.number = accountNumber;
        this.currency = currency;
        this.date = date;
        this.reference = reference;
        this.description = description;
        this.income = income;
        this.expense = expense;
    }

    public String getType() {
        return type;
    }

    public String getNumber() {
        return number;
    }

    public String getCurrency() {
        return currency;
    }

    public String getDate() {
        return date;
    }

    public String getReference() {
        return reference;
    }

    public String getDescription() {
        return description;
    }

    public double getIncome() {
        return income;
    }

    public double getExpense() {
        return expense;
    }

    public String getOrganization() {
        var parts = description.split("[ ]{2,}");

        for (var part: parts) {
            if (part.contains("\\")) {
                var startIndex = part.indexOf("\\");
                return part.substring(startIndex);

            } else if (part.contains("/")) {
                var startIndex = part.indexOf("/");
                return part.substring(startIndex);
            }
        }

        return "";
    }
}
