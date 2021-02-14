package lectures;

import beans.Person;
import mockdata.MockData;

import java.util.List;
import java.util.stream.IntStream;

public class Lecture2 {

    public static void main(String[] args) throws Exception {
        range();
        System.out.println("-----------------");
        rangeIteratingLists();
        System.out.println("-----------------");
        intStreamIterate();
        System.out.println("------------------");
    }

    public static void range() throws Exception {

        System.out.println("for i");

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("exclusive");

        IntStream.range(0, 10).forEach(System.out::println);

        System.out.println("inclusive");

        IntStream.rangeClosed(0, 10).forEach(System.out::println);

    }

    public static void rangeIteratingLists() throws Exception {
        List<Person> people = MockData.getPeople();

        IntStream.range(0, people.size())
                .forEach(i -> {
                    Person p = people.get(i);
                    System.out.println(p);
                });

    }

    public static void intStreamIterate() throws Exception {
        IntStream.iterate(0, operand -> operand + 1)
                .filter(number -> number % 2 == 0)
                .limit(20)
                .forEach(System.out::println);

    }
}
