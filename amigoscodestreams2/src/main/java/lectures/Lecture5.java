package lectures;


import beans.Car;
import beans.Person;
import beans.PersonDTO;
import com.google.common.collect.ImmutableList;
import mockdata.MockData;

import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Lecture5 {

    public static void main(String[] args) throws Exception {
        understandingFilter();
        ourFirstMapping();
        averageCarPrice();
        test();
    }

    public static void understandingFilter() throws Exception {
        ImmutableList<Car> cars = MockData.getCars();
        List<Car> carList = cars.stream()
                .filter(car -> car.getPrice() < 10000)
                .collect(Collectors.toList());

        carList.forEach(System.out::println);

    }


    public static void ourFirstMapping() throws Exception {
        // transform from one data type to another
        List<Person> people = MockData.getPeople();
        people.stream()
//                .map(person -> new PersonDTO(person.getId(), person.getFirstName(), person.getAge()))
                .map(PersonDTO::map)   // is defined in PersonDTO
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }

    public static void averageCarPrice() throws Exception {
        // calculate average of car prices
        double average = MockData.getCars()
                .stream()
                .mapToDouble(Car::getPrice)
                .average()
                .orElse(0);

        System.out.println(average);

    }

    public static void test() throws Exception {

    }
}



