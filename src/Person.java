public class Person {
    private final String name;
    private final String secondName;
    private final int age;

    public Person(String name, String secondName, int age) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + secondName + " - Age: " + age;
    }
}