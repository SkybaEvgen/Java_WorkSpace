public class BankAccount {
    String iban;

    public BankAccount(String iban) {
        this.iban = iban;
    }

    public String getIban() {
        return iban;
    }

    @Override
    public String toString() {
        return "iban " + iban;
    }
}
