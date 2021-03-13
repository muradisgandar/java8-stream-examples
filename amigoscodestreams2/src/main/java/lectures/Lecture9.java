package lectures;


import java.util.Arrays;

public class Lecture9 {

    public static void main(String[] args) throws Exception {
        reduce();
    }

    public static void reduce() throws Exception {
        Integer[] integers = {1, 2, 3, 4, 99, 100, 121, 1302, 199};
        Integer sum = Arrays.stream(integers).reduce(0, (a,b) -> a + b);


    }


}

