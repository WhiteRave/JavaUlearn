import java.util.ArrayList;
/*
public abstract class Animal {
    //TODO реализуйте абстрактный класс Animal, с параметрами name и age
    //Формат toString(): '<имя>', age= <age>
    protected String name;
    protected int age;


    public abstract String toString();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Lion extends Animal {
    //TODO реализуйте класс-наследник от Animal, с дополнительным параметром bodyLength
    private final double bodyLength;

    public Lion(String name, int age, double bodyLength) {
        this.name = name;
        this.age = age;
        this.bodyLength = bodyLength;
    }

    public double getBodyLength() {
        return bodyLength;
    }

    public String toString() {
        return "'" + getName() + "', age= " + getAge() + ", bodyLength= " + getBodyLength();
    }
}


public class Monkey extends Animal {
    //TODO реализуйте класс-наследник от Animal, с дополнительным параметром color
    private final String color;

    public Monkey(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "'" + getName() + "', age= " + getAge() + ", color= " + getColor();
    }
}

public class Zoo {
    //TODO реализуйте класс Zoo, который будет хранить список животных, а также методы getSize и getReport
    ArrayList<Animal> animals = new ArrayList<>();

    public void add(Animal animal) {
        animals.add(animal);
    }

    public int getSize() {
        return animals.size();
    }

    public String getReport() {
        var report = new StringBuilder();

        for(var i = 0; i < animals.size(); i++) {
                report.append(i + 1)
                        .append(" ")
                        .append(animals.get(i).toString())
                        .append("\n");
        }
        return report.toString();
    }
}

 */