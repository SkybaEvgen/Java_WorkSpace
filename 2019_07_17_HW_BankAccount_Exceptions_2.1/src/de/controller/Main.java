package de.controller;

import de.model.BankAccount;
import de.model.Customer;
import de.validator.CorrectUserData;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("DE89370400440532");
        BankAccount b2 = new BankAccount("DE3012954560110");
        BankAccount b3 = new BankAccount("IT00455159922047");
        BankAccount b4 = new BankAccount("DE44056704399521");
        BankAccount b5 = new BankAccount("UA050570216754533");

        Customer c1 = new Customer("Nikolay", 29, b1);
        Customer c2 = new Customer("Michael", 16, b2);
        Customer c3 = new Customer("Yuri", 36, b3);
        Customer c4 = new Customer("Vasiliy", 15, b4);
        Customer c5 = new Customer("Tanya", 32, b5);

        List<Customer> customers = Arrays.asList(c1, c2, c3, c4, c5);

        CorrectUserData.correctUserData(customers);
    }
}
