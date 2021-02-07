package amigoscodecourse1.finalsection;

import java.util.function.BiFunction;

public class Lambdas {

    public static void main(String[] args) {

        BiFunction<String,Integer,String> upperCaseName = (name,age) -> {
            if(name.isBlank()){
                throw new IllegalArgumentException("");
            };
            return name.toUpperCase();
        };

        String alex = upperCaseName.apply("Alex", 20);
        System.out.println(alex);
    }
}
