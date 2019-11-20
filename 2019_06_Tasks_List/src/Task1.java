/*Есть два класса: Address с полями улица и номер дома
 и Person с полями имя иAddress. Нужно написать
 функцию:List<Address> getAddresses(List<Person> persons)
 то есть по списку persons возвращать список их адресов.
 */

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static class Address{
        private String street;
        private int number;

        public Address(String street, int number) {
            this.street = street;
            this.number = number;
        }

        @Override
        public String toString() {
            return "street " + street +", number " + number;
        }
    }

    public static class Person{
        private String name;
        private Address address;

        public Person(String name, Address address) {
            this.name = name;
            this.address = address;
        }

        public String getName() {
            return name;
        }
        public Address getAddress() {
            return address;
        }

        @Override
        public String toString() {
            return "name " + name + ", address " + address;
        }
    }

    public static List<Address> getAddresses(List<Person> persons){
        List<Address> addresses = new ArrayList<>();
        for (Person person : persons){
            addresses.add(person.getAddress());
        }
        return addresses;
    }
}
