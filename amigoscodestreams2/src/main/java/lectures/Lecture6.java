package lectures;


import java.util.Arrays;
import java.util.function.Predicate;

public class Lecture6 {

    public static void main(String[] args) throws Exception {
        findAny();
        findFirst();
    }

    final static Predicate<Integer> numbersLessThan10 = n -> n > 5 && n < 10;

    public static void findAny() throws Exception {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer any = Arrays.stream(numbers)
                .filter(n -> n < 10)
                .findAny()
                .get();

        System.out.println(any);
    }

    public static void findFirst() throws Exception {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer first = Arrays.stream(numbers)
                .filter(n -> n > 5 && n < 10)
                .findFirst()
                .get();
        System.out.println(first);

    }
}

