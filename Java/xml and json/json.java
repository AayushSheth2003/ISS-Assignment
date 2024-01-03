import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

class Person {
    private String name;
    private int age;
    private String city;

    // Getters and setters (or lombok annotations for simplicity)

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}

public class JsonFileToObjectExample {
    public static void main(String[] args) {
        try {
            // Specify the path to your JSON file
            File jsonFile = new File("example.json");

            // Create an ObjectMapper instance
            ObjectMapper objectMapper = new ObjectMapper();

            // Read JSON file and convert to Java object
            Person person = objectMapper.readValue(jsonFile, Person.class);

            // Print the resulting Java object
            System.out.println("Converted Java Object:");
            System.out.println(person);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
