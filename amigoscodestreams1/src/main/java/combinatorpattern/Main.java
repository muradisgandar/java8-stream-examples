package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+0898321314",
                LocalDate.of(2000,1,1)
        );

//        System.out.println(new CustomerValidatorService().isValid(customer));

        // using combinator pattern

        CustomerRegistrationValidator.ValidatorResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(customer);

        System.out.println(result);

        if(result != ValidatorResult.SUCCESS){
            throw new IllegalArgumentException(result.name());
        }

    }
}
