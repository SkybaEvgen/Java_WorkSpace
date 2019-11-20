package de.validator;

import de.exceptions.InvalidAgeException;
import de.exceptions.InvalidIbanLengthException;
import de.exceptions.InvalidIbanNotDEException;
import de.model.BankAccount;
import de.model.Customer;
import org.junit.Test;

public class BankAccountValidatorTest {

    @Test(expected = InvalidAgeException.class)
    public void correctUserAgeInvalidTest() throws Exception{
        BankAccount account = new BankAccount("DE89370400440532");
        Customer customer = new Customer("Nikolay", 15, account);
        CorrectUserData.correctUserAge(customer);
    }

    @Test
    public void correctUserAgeValidTest() throws Exception{
        BankAccount account = new BankAccount("DE89370400440532");
        Customer customer = new Customer("Nikolay", 19, account);
        CorrectUserData.correctUserAge(customer);
    }

    @Test(expected = InvalidIbanLengthException.class)
    public void correctIbanLenghInvalidTest() throws Exception{
        BankAccount account = new BankAccount("DE893370400440");
        CorrectUserData.correctIbanLengh(account);
    }

    @Test
    public void correctIbanLenghValidTest() throws Exception{
        BankAccount account = new BankAccount("DE89337040045224");
        CorrectUserData.correctIbanLengh(account);
    }

    @Test(expected = InvalidIbanNotDEException.class)
    public void correctIbanDEInvalidTest() throws Exception{
        BankAccount account = new BankAccount("UA89337040044046");
        CorrectUserData.correctIbanDE(account);
    }

    @Test
    public void correctIbanDEValidTest() throws Exception{
        BankAccount account = new BankAccount("DE89337040044046");
        CorrectUserData.correctIbanDE(account);
    }

}
