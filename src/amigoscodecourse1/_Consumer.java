package amigoscodecourse1;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        Customer murad = new Customer("Murad", "094925255");

        // normal java function
        greetCustomer(murad);

        // Consumer Funional Interface
        greetingCustomerConsumer.accept(murad);

        // normal java function
        greetCustomerBi(murad,true);

        // BiConsumer Funional Interface
        greetingCustomerBiConsumer.accept(murad,false);
    }

    // Represents an operation that accepts two input arguments and returns no result.
    static BiConsumer<Customer, Boolean> greetingCustomerBiConsumer = (customer, showPhone) ->
            System.out.println("Hello " + customer.customerName + " phone number "
                    + (showPhone ? customer.customerPhoneNumber : "***********"));

    // Represents an operation that accepts a single input argument and returns no result.
    static Consumer<Customer> greetingCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName + " phone number " + customer.customerPhoneNumber);

    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName + " phone number " + customer.customerPhoneNumber);
    }

    static void greetCustomerBi(Customer customer, Boolean showPhone){
        System.out.println("Hello " + customer.customerName + " phone number " + (showPhone ? customer.customerPhoneNumber : "***********"));
    }


    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
