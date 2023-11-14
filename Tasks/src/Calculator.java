public class Calculator {

    public static String calculate(String input) {
        String[] parts = input.split(" ", 3);

        if (isNumeric(parts[0]) && isNumeric(parts[2])) {
            double firstNum = Double.parseDouble(parts[0]);
            double secondNum = Double.parseDouble(parts[2]);
            return String.valueOf(calculate(firstNum, secondNum, parts[1]));
        } else {
            return calculate(parts[0], parts[2], parts[1]);
        }
    }

    private static String calculate(String a, String b, String operation) {
        switch (operation) {
            case "+":
                return a + b;
            case "-":
                if (a.contains(b)) {
                    return a.replace(b, "");
                } else {
                    return a;
                }
            default:
                throw new IllegalArgumentException();
        }
    }

    private static double calculate(double a, double b, String operation) {
        switch (operation) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b != 0) {
                    return a / b;
                } else {
                    throw new IllegalArgumentException();
                }
            case "%":
                if (b != 0) {
                    return a % b;
                } else {
                    throw new IllegalArgumentException();
                }
            default:
                throw new IllegalArgumentException();
        }
    }

    public static int getNumbers(int a, int b) {
        int sum = a + b;
        int count = 0;
        while (sum != 0) {
            if (sum % 2 == 0) {
                count++;
            }
            sum = sum / 10;
        }
        return count;
    }

    public static String getMinimalType(String input) {
        try {
            long num = Long.parseLong(input);
            if (num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE) {
                return ("Byte");
            } else if (num >= Short.MIN_VALUE && num <= Short.MAX_VALUE) {
                return ("Short");
            } else if (num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE) {
                return ("Int");
            } else {
                return ("Long");
            }
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }

    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}