import java.util.List;

public class CorrectUserData {

    public static void correctUserData(List<Customer> list) throws InvalidAgeException,
            InvalidIbanLengthException, InvalidIbanNotDEException{
        correctUserAge(list);
        correctIbanLength(list);
        correctIbanDE(list);
    }

    public static void correctUserAge(List<Customer> list) throws InvalidAgeException {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAge() < 17) {
                throw new InvalidAgeException(list.get(i).getName()+ " - " + "age of the customer is less than 17 ");
            }
        }
    }

    public static void correctIbanLength(List<Customer> list) throws InvalidIbanLengthException{
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getAccount().getIban().length() != 16){
                throw new InvalidIbanLengthException(list.get(i).getName() + " - " + "bank iban should be 16 length");
            }
        }
    }

    public static void correctIbanDE(List<Customer> list) throws InvalidIbanNotDEException{
        for (int i = 0; i < list.size(); i++) {
            String iban = list.get(i).getAccount().getIban().substring(0,2);
            if(iban.equals("DE")){
            }else {
                throw new InvalidIbanNotDEException(list.get(i).getName() + " - " + iban + "the first two characters iban not DE");
            }
        }
    }
}
