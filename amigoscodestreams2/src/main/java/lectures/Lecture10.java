package lectures;


import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lecture10 {

    public static void main(String[] args) throws Exception {
        setUp();
        System.out.println("--------------------------------------------------");
        withFlatMap();
        System.out.println("--------------------------------------------------");
        withoutFlatMap();
    }

    private static final List<ArrayList<String>> arrayListOfNames = Lists.newArrayList(
            Lists.newArrayList("Mariam", "Alex", "Ismail"),
            Lists.newArrayList("John", "Alesha", "Andre"),
            Lists.newArrayList("Susy", "Ali")
    );

    public static void setUp() {
        System.out.println(arrayListOfNames);
    }

    public static void withoutFlatMap() throws Exception {
//    [Mariam, Alex, Ismail, John, Alesha, Andre, Susy, Ali]

        List<String> names = Lists.newArrayList();
        for(List<String> listOfNames : arrayListOfNames){
            for(String name : listOfNames){
                names.add(name);
            }
        }

        System.out.println(names);

    }

    public static void withFlatMap() throws Exception {
//   [Mariam, Alex, Ismail, John, Alesha, Andre, Susy, Ali]

        List<String> collect = arrayListOfNames.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(collect);

    }

}

