import java.util.ArrayList;
import java.util.List;

public class Bank {
    public static void main(String[] args) {
        Customer c1 = new Customer("Василий", "Никифоров");
        Customer c2 = new Customer("Николай", "Сидоров");
        Customer c3 = new Customer("Иван", "Никулин");
        Customer c4 = new Customer("Мик", "Кольт");
        Customer c5 = new Customer("Боб", "Миллер");

        BankAccount b1 = new BankAccount("qw12nm", c1);
        BankAccount b2 = new BankAccount("as21it", c2);
        BankAccount b3 = new BankAccount("fg63ug", c3);
        BankAccount b4 = new BankAccount("nf98cb", c1);
        BankAccount b5 = new BankAccount("65cn28", c2);

        List<BankAccount> list = new ArrayList<>();
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        list.add(b5);


    }



}
