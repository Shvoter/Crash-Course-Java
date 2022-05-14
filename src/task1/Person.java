package task1;

import java.time.Year;

public class Person {
    private String name;
    private int birthYear;

    public Person() {
        name = "unknown";
        birthYear = Year.now().getValue();
    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int age() {
        return Year.now().getValue() - birthYear;
    }

    public  void input(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public void output() {
        System.out.printf("Person {\nname: %s,\nyear of birth: %d,\n}\n", name, birthYear);
    }

    public void changeName(String name) {
        this.name = name;
    }
}
