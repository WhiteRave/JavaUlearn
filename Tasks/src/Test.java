/*
public class Main {
    private final static String base64 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    public static void main(String[] args) {
        var size = 0;
        var hexValues = new String[0];

        try (var reader = new BufferedReader(new FileReader("base64.in"))){
            var line = reader.readLine();
            size = Integer.parseInt(line);
            line = reader.readLine();
            hexValues = line.split(" ");
            //reader.close();

        } catch (Exception e) {
            System.out.println("Ошибка1");
        }

        var sb = new StringBuilder();
        var len = 6;

        for (String value: hexValues) {
            var num = Integer.parseInt(value, 16);
            var str = Integer.toBinaryString(num);
            while (str.length() != 8)
                str = "0" + str;
            sb.append(str);
        }

        var binaryString = sb.toString();
        var digitalValues = new StringBuilder();

        for (var i = 0; i <= binaryString.length() - len; i++) {
            digitalValues.append(base64.charAt(Integer.parseInt(binaryString.substring(i, i + 6), 2)));
            i += 5;
        }

        var remainingLength = binaryString.length() % 6;
        var remainder = binaryString.substring(binaryString.length() - remainingLength);

        if (remainingLength == 2) {
            digitalValues
                    .append(base64.charAt(Integer.parseInt(remainder + "0000", 2)))
                    .append("==");
        }
        if (remainingLength == 4) {
            digitalValues
                    .append(base64.charAt(Integer.parseInt(remainder + "00", 2)))
                    .append("=");
        }

        try(FileWriter writer = new FileWriter("base64.out", false)) {
            writer.write(digitalValues.toString());
        } catch (Exception e) {
            System.out.println("Ошибка");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var input = scanner.nextLine();
        var n = input.length();
        var lines = new String[n];
        lines[0] = input;

        for (var i = 1; i < n; i++) {
            lines[i] = scanner.nextLine();
        }

        var winner = checkWinner(lines);

        if (winner == 'X') {
            System.out.println("X");
        } else if (winner == 'O') {
            System.out.println("O");
        } else {
            System.out.println("Ничья");
        }
    }

    public static char checkWinner(String[] board) {
        var n = board.length;
        var valuesBoard = fillArrayValues(board, n);

        for (var i = 0; i < n; i++) {
            var counter = 0;
            var startChar = board[i].charAt(0);
            for (var j = 0; j < n; j++) {
                counter += valuesBoard[i][j];
            }
            if (Math.abs(counter) == n) {
                return startChar;
            }
        }

        // Проверка вертикальных линий
        for (var i = 0; i < n; i++) {
            var counter = 0;
            var startChar = board[0].charAt(i);
            for (var j = 0; j < n; j++) {
                counter += valuesBoard[j][i];
            }
            if (Math.abs(counter) == n) {
                return startChar;
            }
        }

        //проверка диагоналей
        var counter = 0;
        var startChar = board[0].charAt(0);
        for (var i = 0; i < n; i++) {
            counter += valuesBoard[i][i];
        }
        if (Math.abs(counter) == n) {
            return startChar;
        }

        counter = 0;
        startChar = board[0].charAt(n - 1);
        for (var i = 0; i < n; i++) {
            counter += valuesBoard[i][n - i - 1];
        }
        if (Math.abs(counter) == n) {
            return startChar;
        }

        return '_'; // Нет победителя
    }

    public static int[][] fillArrayValues(String[] board, int size) {
        var valuesBoard = new int[size][size];

        for (var i = 0; i < size; i++) {
            for (var j = 0; j < size; j++) {
                if (board[i].charAt(j) == 'X')
                    valuesBoard[i][j] = 1;
                if (board[i].charAt(j) == 'O')
                    valuesBoard[i][j] = -1;
                if (board[i].charAt(j) == '_')
                    valuesBoard[i][j] = 0;
            }
        }
        return valuesBoard;
    }
}

public class Main {
    public static void main(String[] args) {
        var n = 0;

        try (var reader = new BufferedReader(new FileReader("input.txt"))){
            var line = reader.readLine();
            reader.close();
            System.out.println(line);
            n = Integer.parseInt(line);
        } catch (Exception e) {System.out.println("Ошибка1");}

        var x = 0;
        var y = 0;
        var step = 1;
        var direction = 0; // 0 - влево, 1 - вниз, 2 - вправо, 3 - вверх
        var counter = 0;

        for (var i = 1; i <= n; i++) {
            if (direction == 0) {
                x --;
                counter++;
            } else if (direction == 1) {
                y --;
                counter++;
            } else if (direction == 2) {
                x ++;
                counter++;
            } else if (direction == 3) {
                y ++;
                counter++;
            }
            if (counter == step) {
                counter = 0;
                direction = (direction + 1) % 4;
            }

            if (x == y) {
                step++;
                System.out.println(step);
            }
        }

        try(FileWriter writer = new FileWriter("output.txt", false)) {
            writer.write(x + " " + y);
        } catch (Exception e) {System.out.println("Ошибка");}
    }
}

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var string = scanner.nextLine();
        var count = 0;

        var letterString = string.replaceAll("[0-9+]", "");
        var numberString = string
                .replaceAll("[A-Z+]", " ")
                .trim()
                .replaceAll("\\s+", " ")
                .split(" ");

        var lettersCount = letterString.length();
        var numbersSum = 0;
        count += lettersCount;

        if (!numberString[0].equals("")) {
            for (String number : numberString) {
                var intNumber = Integer.parseInt(number);
                numbersSum += intNumber - 1;
                }
        }

        System.out.print(count + numbersSum);
    }
}

public class Main {
    public static void main(String[] args) {
        var boardSize = 8;
        var isCorrect = true;
        var scanner = new Scanner(System.in);
        var coordinates = scanner.nextLine()
                .replaceAll("\\(", "")
                .replaceAll("\\)", "")
                .split(", ");
        var figuresCount = coordinates.length;
        var x = new int[figuresCount / 2];
        var y = new int[figuresCount / 2];

        for (var i = 0; i < figuresCount; i++) {
            if (i % 2 == 0) {
                x[i / 2] = Integer.parseInt(coordinates[i]);
            }
            else {
                y[i / 2] = Integer.parseInt(coordinates[i]);
            }
        }
        isCorrect = checkCorrectness(x, y);

        if (isCorrect) {
            System.out.print("True");
        }
        else {
            System.out.print("False");
        }
    }

    public static Boolean checkCorrectness(int[] x, int[] y) {
        for (var i = 0; i < x.length - 1; i++) {
            for (var j = i + 1; j < x.length; j++) {
                if (x[i] == x[j] || y[i] == y[j] || Math.abs(x[i] - x[j]) == Math.abs(y[i] - y[j])) {
                    return false;
                }
            }
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var parts = scanner.nextLine().split(",");
        var string = parts[0];
        var letter = parts[1];
        var letterCount = 0;
        for (var i = 0; i < string.length(); i++) {
            if (string.charAt(i) == letter.charAt(0)) {
                letterCount++;
            }
            else {
                break;
            }
        }
        System.out.print(letterCount);
    }
}

public class Main {
    public static void main(String[] args) {
        var chars = new StringBuilder();

        for (int c = 32; c < 127; c++) {
            chars.append((char)c);
        }
        System.out.print(chars.toString());
    }
}

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var input = scanner.nextLine().toLowerCase();
        var vowels = "аеёиоуэюыя";
        var letters = "йцкнгшщзхъфвпрлджчсмтьб";

        System.out.print(getLettersCount(input, vowels) + " " + getLettersCount(input, letters));
    }

    public static String getLettersCount(String string, String letters) {
        var counter = 0;

        for (var i = 0; i < string.length(); i++) {
            if (letters.indexOf(string.charAt(i)) != -1)
            counter++;
        }
        return Integer.toString(counter);
    }
}

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print(getString(scanner.nextLine()));
    }

    public static String getString(String phoneNumber) {
        return phoneNumber.replaceAll("[^0-9+]", "");
    }
}

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var parts = scanner.nextLine().split("\\.");

        for (int i = parts.length - 1; i >= 0; i--)
        {
            System.out.println(parts[i]);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var number = 0;

        try {
            number = Integer.parseInt(scanner.nextLine());
        }
        catch (Exception e) {
            System.out.print("Неверный ввод");
            return;
        }

        if (number < 0) {
            System.out.print("Неверный ввод");
            return;
        }

        System.out.print(String.join(", ",
                Integer.toBinaryString(number),
                Integer.toOctalString(number),
                Integer.toHexString(number)));
    }
}
*/