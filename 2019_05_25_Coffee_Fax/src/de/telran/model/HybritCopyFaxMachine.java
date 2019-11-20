package de.telran.model;

public class HybritCopyFaxMachine implements Copyable, Faxable {
    @Override
    public void copy (String paper) {
        System.out.println("Copy paper " + paper);
    }

    @Override
    public void fax (String message) {
        System.out.println("Faxing messege " + message);
    }
}
