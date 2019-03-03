package java8.streams;

public class Person {

    Gender gender;

    String name;

    public Person(Gender gender, String name) {
        this.gender = gender;
        this.name = name;
    }

    public Gender getGender() {
        return this.gender;
    }

    public String getName() {
        return this.name;
    }
}

