/*
public class Main{
    public static void main(String[] args) {
        var phoneBook = new PhoneBook();
        var scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите номер, имя или команду: ");
            var input = scanner.nextLine();

            checkIfName(input, phoneBook);
            checkIfPhone(input, phoneBook);
            checkIfList(input, phoneBook);
            if (input.equals("EXIT"))
                break;
        }
    }

    public static void checkIfName(String input, PhoneBook phoneBook) {
        if (phoneBook.isCorrectName(input)) {
            if (phoneBook.checkContacts(input)) {
                System.out.println("Контакт существует!");
                System.out.println("Введите номер, имя или команду: ");
            } else {
                System.out.println("Такого имени нет в телефонной книге.\n" +
                        "Введите номер телефона для абонента " + "\"" + input + "\": ");
                String phone = new Scanner(System.in).nextLine();
                if (phoneBook.isCorrectPhone(phone)) {
                    phoneBook.addContact(phone, input);
                    System.out.println("Контакт сохранен!");
                }
            }
        }
    }

    public static void checkIfPhone(String input, PhoneBook phoneBook) {
        if (phoneBook.isCorrectPhone(input)) {
            if (phoneBook.getPhoneBook().containsKey(input)) {
                System.out.println(phoneBook.getNameByPhone(input));
            } else {
                System.out.println("Такого номера нет в телефонной книге.\n" +
                        "Введите имя абонента для номера " + "\"" + input + "\": ");
                var name = new Scanner(System.in).nextLine();
                phoneBook.addContact(input, name);
                System.out.println("Контакт сохранен!");
            }
        }
    }

    public static void checkIfList(String input, PhoneBook phoneBook) {
        if (input.equals("LIST")) {
            var list = phoneBook.getAllContacts();

            for(String info: list) {
                System.out.println(info);
            }
        }
    }
}

public class PhoneBook {
    private final Map<String, String> phoneBook = new HashMap<>();

    public void addContact(String phone, String name) {
        if (isCorrect(name, phone)) {
            if (phoneBook.containsKey(phone)) {
                phoneBook.replace(phone, phoneBook.get(phone), name);
            } else {
                phoneBook.put(phone, name);
            }
        }
    }

    public Map<String, String> getPhoneBook() {
        return phoneBook;
    }

    public String getNameByPhone(String phone) {
        if (phoneBook.containsKey(phone)) {
            return phoneBook.get(phone);
        }
        return "";
    }

    public Set<String> getPhonesByName(String name) {
        var phones = new HashSet<String>();

        for (String key : phoneBook.keySet()) {
            if (name.equals(phoneBook.get(key))) {
                phones.add(key);
            }
        }
        return phones;
    }

    public String getNumbersToString(Set<String> numbers) {
        var sj = new StringJoiner(", ");

        for (String number: numbers) {
            sj.add(number);
        }
        return sj.toString();
    }

    public Set<String> getAllContacts() {
        var contactsInfo = new HashSet<String>();

        for (String key: phoneBook.keySet()) {
            var name = phoneBook.get(key);
            var phonesSet = getPhonesByName(name);

            contactsInfo.add(name + " - " + getNumbersToString(phonesSet));
        }

        return contactsInfo;
    }

    public boolean checkContacts(String name) {
        for (String key: phoneBook.keySet()) {
            if (name.equals(phoneBook.get(key))) {
                return true;
            }
        }
        return false;
    }

    public boolean isCorrect(String name, String phone){
        return isCorrectName(name) && isCorrectPhone(phone);
    }

    public boolean isCorrectName(String name) {
        return name.matches("[А-Яа-я]+");
    }

    public boolean isCorrectPhone(String phone) {
        return phone.matches("[0-9]{11}");
    }
}


 */