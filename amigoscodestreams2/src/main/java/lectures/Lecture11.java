package lectures;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.stream.Collectors;

public class Lecture11 {

    public static void main(String[] args) throws Exception {
        joiningStrings();
        joiningStringsWithStream();
    }

    public static void joiningStrings() throws Exception {
        List<String> names = ImmutableList.of("anna", "john", "marcos", "helena", "yasmin");

        String join = "";

        for (String name : names) {
            join += name + ", ";
        }

        System.out.println(join.substring(0, join.length() - 2));

    }

    public static void joiningStringsWithStream() throws Exception {
        List<String> names = ImmutableList.of("anna", "john", "marcos", "helena", "yasmin");
        String collect = names.stream()
                .collect(Collectors.joining(","));

        System.out.println(collect);


    }
}
