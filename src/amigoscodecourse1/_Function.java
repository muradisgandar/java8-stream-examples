package amigoscodecourse1;


import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        // normal java method
        int increment = incrementByOne(1);
        System.out.println(increment);

        // Function takes 1 argument and produces 1 result
        int increment2 = incrementByOneNumber.apply(1);
        System.out.println(increment2);

        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);


        Function<Integer, Integer> addByThenMultiplyBy10 =
                incrementByOneNumber.andThen(multiplyBy10Function);

        System.out.println(addByThenMultiplyBy10.apply(1));

        // normal java method
        System.out.println(incrementByOneAndMultiply(4, 100));

        // BiFunction takes 2 argument and produces 1 result
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4, 100));


    }

    static Function<Integer,Integer> incrementByOneNumber = number -> number + 1;

    static Function<Integer,Integer> multiplyBy10Function = number -> number * 10;

    static int incrementByOne(int number){
        return number + 1;
    }

    static BiFunction<Integer,Integer,Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne,numberToMultiplyBy)
                    -> (numberToIncrementByOne + 1) * numberToMultiplyBy;


    static int incrementByOneAndMultiply(int number, int numToMultiply){
        return (number + 1) * numToMultiply;
    }

}
