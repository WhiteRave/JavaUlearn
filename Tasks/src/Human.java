import java.util.ArrayList;
import java.util.StringJoiner;
/*
public class School {
    private ArrayList<Human> school;

    public String getPeoplesInSchool() {
        var sj = new StringJoiner("\n");
        sj.add("В школе: ");

        if (school != null) {
            for (Human human: school) {
                if (human.isInSchool()) {
                    sj.add(human.toString());
                }
            }
        }
        return sj.toString() + "\n";
    }

    public void add(Human human){
        if (school == null) {
            school = new ArrayList<Human>();
        }
        school.add(human);
    }
}

public abstract class Human {
    protected String name;
    protected String surname;
    protected Boolean isInSchool;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Boolean isInSchool() {
        return isInSchool;
    }

    public void goInSchool() {
        isInSchool = true;
    }

    public void outFromSchool() {
        isInSchool = false;
    }
}

public class Pupil extends Human {
    private final int admissionYear;

    public Pupil(String name, String surname, int admissionYear) {
        if (name == null || surname == null || admissionYear < 0) {
            throw new IllegalArgumentException("Неверный формат ввода");
        }

        this.name = name;
        this.surname = surname;
        this.admissionYear = admissionYear;
        isInSchool = false;
    }

    public int getYear() {
        return admissionYear;
    }

    public String toString() {
        return name + " " + surname + " " + admissionYear;
    }
}

public class Teacher extends Human {
    private final int experience;
    private final String subject;

    public Teacher(String name, String surname, String subject, int experience) {
        if (name == null || surname == null || subject == null || experience < 0) {
            throw new IllegalArgumentException();
        }

        this.name = name;
        this.surname = surname;
        this.experience = experience;
        this.subject = subject;
        isInSchool = false;
    }

    public int getExperience() {
        return experience;
    }

    public String getSubject() {
        return subject;
    }

    public String toString() {
        return name + " " + surname + " " + subject + " " + experience;
    }
}
 */