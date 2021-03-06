package lectures;


import beans.Car;
import mockdata.MockData;

import java.math.BigDecimal;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class Lecture7 {


    public static void main(String[] args) throws Exception {
        count();
        min();
        max();
        average();
        sum();
        statistics();
    }

    public static void count() throws Exception {
        long count = MockData.getPeople()
                .stream().filter(person -> person.getGender().equalsIgnoreCase("female"))
                .count();

        System.out.println(count);

    }

    public static void min() throws Exception {
        double min = MockData.getCars()
                .stream()
                .filter(car -> car.getColor().equalsIgnoreCase("yellow"))
                .mapToDouble(Car::getPrice)
                .min()
                .orElse(0);

        System.out.println(min);

    }

    public static void max() throws Exception {
        double max = MockData.getCars()
                .stream()
                .filter(car -> car.getColor().equalsIgnoreCase("yellow"))
                .mapToDouble(Car::getPrice)
                .max()
                .orElse(0);

        System.out.println(max);

    }


    public static void average() throws Exception {
        List<Car> cars = MockData.getCars();
        double averageValue = cars.stream()
                .mapToDouble(Car::getPrice)
                .average()
                .orElse(0);

        System.out.println(averageValue);

    }

    public static void sum() throws Exception {
        List<Car> cars = MockData.getCars();
        double sum = cars.stream()
                .mapToDouble(Car::getPrice)
                .sum();
        BigDecimal bigDecimalSum = BigDecimal.valueOf(sum);
        System.out.println(bigDecimalSum);


    }

    public static void statistics() throws Exception {
        List<Car> cars = MockData.getCars();
        DoubleSummaryStatistics doubleSummaryStatistics = cars.stream()
                .mapToDouble(Car::getPrice)
                .summaryStatistics();

        System.out.println(doubleSummaryStatistics.getMax());
        System.out.println(doubleSummaryStatistics.getMin());
        System.out.println(doubleSummaryStatistics.getAverage());
        System.out.println(doubleSummaryStatistics.getCount());
        System.out.println(doubleSummaryStatistics.getSum());


    }

}