import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    private String name;
    private int age;

    // Constructor and other methods

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Alice", 25));
        personList.add(new Person("Bob", 30));
        personList.add(new Person("Charlie", 20));

        // Using Comparator to sort based on age
        Comparator<Person> ageComparator = Comparator.comparingInt(Person::getAge);

        System.out.println("Before sorting (Comparator):");
        System.out.println(personList);

        Collections.sort(personList, ageComparator);

        System.out.println("\nAfter sorting (Comparator):");
        System.out.println(personList);
    }
}
