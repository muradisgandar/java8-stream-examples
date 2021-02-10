package lectures;


import beans.Car;
import com.google.common.collect.Lists;
import mockdata.MockData;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lecture8 {

  public void simpleGrouping() throws Exception {
    Map<String, List<Car>> grouping = MockData.getCars()
        .stream()
        .collect(Collectors.groupingBy(Car::getMake));

    grouping.forEach((make, cars) -> {
      System.out.println(make);
      cars.forEach(System.out::println);
    });
  }

  public void groupingAndCounting() throws Exception {
    ArrayList<String> names = Lists
        .newArrayList(
            "John",
            "John",
            "Mariam",
            "Alex",
            "Mohammado",
            "Mohammado",
            "Vincent",
            "Alex",
            "Alex"
        );

    Map<String, Long> counting = names.stream()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    counting.forEach((name, count) -> System.out.println(name + " > " + count));
  }

}