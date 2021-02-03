package amigoscodecourse1.streams;

import java.util.List;

public class _Stream {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John",Gender.Male),
                new Person("Maria",Gender.Female),
                new Person("Aisha",Gender.Female),
                new Person("Alex",Gender.Male),
                new Person("Alice",Gender.Female)
        );

//        people.stream()
//                .map(person -> person.name)
//                .mapToInt(String::length)
//                .forEach(System.out::println);

        boolean b = people.stream()
                .allMatch(person -> Gender.Female.equals(person.gender));

    }

    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }
    }

    enum Gender{
        Male,
        Female
    }
}
