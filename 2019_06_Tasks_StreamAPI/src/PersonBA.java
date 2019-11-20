public class PersonBA {
    public static class Person{
        String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static class BankAccount{
        String IBAN;
        Person owner;

        public BankAccount(String IBAN, Person owner) {
            this.IBAN = IBAN;
            this.owner = owner;
        }

        public String getIBAN() {
            return IBAN;
        }

        public Person getOwner() {
            return owner;
        }

        @Override
        public String toString() {
            return "BankAccount{" +
                    "IBAN='" + IBAN + '\'' +
                    ", owner=" + owner +
                    '}';
        }
    }
}
