import java.util.*;

public class MapBankAccount {
    public static Map<String, List<BankAccount>> get_B_A_byCustomer(List<BankAccount> list) {

        Map<String, List<BankAccount>> map = new HashMap<>();
        for (BankAccount b : list) {
            if(!map.containsKey(b)){
                List<BankAccount> mlist = new ArrayList<>();
                mlist.add(b);
                //map.put()

            }

        }
        return map;
    }
}
