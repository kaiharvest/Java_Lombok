package indradwiprabowo.lombok;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class PersonTest {

    @Test
    void createViaConstructor() {
        var hobbies = new ArrayList<String>();
        hobbies.add("Games");
        hobbies.add("Read");
        hobbies.add("Traveling");

        var person = new Person("id", "indra", 20, hobbies);
    }

    @Test
    void createViaSetter() {
        var hobbies = new ArrayList<String>();
        hobbies.add("Games");
        hobbies.add("Read");
        hobbies.add("Traveling");

        var person = new Person();
        person.setId("id");
        person.setName("joko");
        person.setAge(30);
        person.setHobbies(hobbies);
    }

    @Test
    void createViaBuilder() {
        var person = Person.builder()
                .id("id")
                .name("danu")
                .age(17)
                .hobby("Coding")
                .hobby("Sleep")
                .build();

        System.out.println(person);
    }
}
