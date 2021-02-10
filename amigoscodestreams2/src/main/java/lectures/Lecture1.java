package lectures;

import beans.Person;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import mockdata.MockData;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


public class Lecture1 {

    public static void main(String[] args) {
        imperativeApproach();
        System.out.println("------------------");
        declarativeApproachUsingStreams();
    }

    public static void imperativeApproach() {
        List<Person> people = null;
        try {
            people = MockData.getPeople();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 1. Find people aged less or equal 18
        // 2. Then change implementation to find first 10 people

        List<Person> youngPeople = Lists.newArrayList();

        final int limit = 10;
        int counter = 0;

        for (Person person : people) {
            if (person.getAge() <= 18) {
                youngPeople.add(person);
                counter++;
                if (counter == limit) {
                    break;
                }
            }
        }

        for (Person young : youngPeople) {
            System.out.println(young);
        }

    }

    public static void declarativeApproachUsingStreams() {
        ImmutableList<Person> people = null;
        try {
            people = MockData.getPeople();
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Person> collect = Objects.requireNonNull(people).stream()
                .filter(p -> p.getAge() <= 18)
                .limit(10)
                .collect(Collectors.toList());

        collect.forEach(System.out::println);

    }
}
