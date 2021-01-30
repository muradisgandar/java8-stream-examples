package amigoscodecourse1;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        System.out.println("Without predicate");
        System.out.println(isPhoneNumberValid("07000000004"));
        System.out.println(isPhoneNumberValid("0900168000"));

        System.out.println("With predicate");
        // Predicate Represents a predicate (boolean-valued function) of one argument.
        System.out.println(isPhoneNumberValidPredicate.test("07000000004"));
        System.out.println(isPhoneNumberValidPredicate.test("0900168000"));

        // Predicate chaining
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("09034832742874"));

        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("07030000000"));

        System.out.println(isPhoneNumberValidPredicate.or(containsNumber3).test("09034832742874"));

        System.out.println(isPhoneNumberValidPredicate.or(containsNumber3).test("07030000000"));

        // BiPredicate Represents a predicate (boolean-valued function) of two arguments.
        System.out.println(containsNumber3And7.test("07030000000","0735454355"));


    }

    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");

    static BiPredicate<String,String> containsNumber3And7 = (phoneNumber1,phoneNumber2) ->
            phoneNumber1.contains("3") && phoneNumber2.contains("7");


}
