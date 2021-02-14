package lectures;


import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class Lecture4 {

    public static void main(String[] args) throws Exception {
        distinct();
        distinctWithSet();
    }

    public static void distinct() throws Exception {
        final List<Integer> numbers = ImmutableList.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9);

        List<Integer> distinctList = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(distinctList);



    }

    public static void distinctWithSet() throws Exception {
        final List<Integer> numbers = ImmutableList.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9);

        Set<Integer> distinctSet = numbers.stream()
                .collect(Collectors.toSet());

        System.out.println(distinctSet);
    }
}
