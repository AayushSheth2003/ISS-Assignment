import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    // Constructor and other methods

    @Override
    public int compareTo(Person otherPerson) {
        // Compare based on age
        return Integer.compare(this.age, otherPerson.age);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Alice", 25));
        personList.add(new Person("Bob", 30));
        personList.add(new Person("Charlie", 20));

        System.out.println("Before sorting (Comparable):");
        System.out.println(personList);

        Collections.sort(personList);

        System.out.println("\nAfter sorting (Comparable):");
        System.out.println(personList);
    }
}
