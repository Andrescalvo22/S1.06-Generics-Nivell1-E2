public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Andres", "Calvo", 23);
        GenericMethod genericMethod1 = new GenericMethod();
        genericMethod1.printThree(person1, "Hello world! ", 23);
    }
}
