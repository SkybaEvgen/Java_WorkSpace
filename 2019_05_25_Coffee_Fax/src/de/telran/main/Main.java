package de.telran.main;

import de.telran.model.Copyable;
import de.telran.model.Faxable;
import de.telran.model.HybritCopyFaxMachine;

public class Main {

    public static void main(String[] args) {


        HybritCopyFaxMachine machine = new HybritCopyFaxMachine();

        Copyable copyMachine = machine;

        Faxable faxMachine = machine;

        copyMachine.copy("tetere");

        copyMachine.copy("test");

        faxMachine.fax("test");

    }
}
