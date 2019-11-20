package de.validator;

import de.exceptions.InvalidAgeException;
import de.exceptions.InvalidIbanLengthException;
import de.exceptions.InvalidIbanNotDEException;
import de.model.BankAccount;
import de.model.Customer;

import java.util.List;

public class CorrectUserData {

    public static void correctUserData(List<Customer> customers){
        for(Customer customer : customers){
            try {
                correctUserAge(customer);
            } catch (InvalidAgeException e) {
                e.printStackTrace();
            }
            try {
                correctIbanDE(customer.getAccount());
            } catch (InvalidIbanNotDEException e) {
                e.printStackTrace();
            }
            try {
                correctIbanDE(customer.getAccount());
            } catch (InvalidIbanNotDEException e) {
                e.printStackTrace();
            }
        }
    }

    public static void correctUserAge(Customer customer) throws InvalidAgeException {
        if(customer.getAge() < 17){
            throw new InvalidAgeException("age of the customer is less than 17 " + customer.getName() + " " + customer.getAge());
        }
    }

    public static void correctIbanLengh(BankAccount account) throws InvalidIbanLengthException{
        if(account.getIban().length() != 16){
            throw new InvalidIbanLengthException("bank iban should be 16 length " + account.getIban());
        }

    }

    public static void correctIbanDE(BankAccount account) throws InvalidIbanNotDEException{
        if(!account.getIban().substring(0,2).equals("DE")){
            throw new InvalidIbanNotDEException("the first two characters iban not DE " + account.getIban());
        }
    }
}
