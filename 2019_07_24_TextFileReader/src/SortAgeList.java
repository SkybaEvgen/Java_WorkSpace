/* Task 3
Есть список сustomers. Записать данные в файл по примеру:
"Ivan","Ivanov","35"
"Piotr","Petrov","28"
"Anna","Karenina","23"*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class SortAgeList {
    public static void main(String[] args) {
        Customer c1 = new Customer("Ivan", "Ivanov", 35);
        Customer c2 = new Customer("Piotr", "Petrov", 28);
        Customer c3 = new Customer("Anna", "Karenina", 23);
        List<Customer> customers = Arrays.asList(c1, c2, c3);

        sortAgeList(customers);
    }
    public static void sortAgeList(List<Customer> customers){
        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("out.csv")));){
            customers.forEach(c -> out.println(createStringFromCustomer(c)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String createStringFromCustomer(Customer customer){
        StringBuffer sb = new StringBuffer();
        return sb.append("\"").append(customer.getFirstName()).append(("\",\""))
                .append(customer.getLastName()).append(("\",\""))
                .append(customer.getAge()).append("\"").toString();
    }
}
