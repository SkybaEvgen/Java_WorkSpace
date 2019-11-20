// List<String> list = Arrays.asList("ddd", "aa", "bbb", "cc", "abcde");
// 2 -> {"aa", "cc"}
// 3 -> {"bbb", "ddd"}
// 5 -> {"abcde"}

import java.util.*;

public class Task6 {
    public static Map<Integer, List<String >> getMap (List<String> list){
        Map<Integer, List<String>> map = new HashMap<>();
        for (String s : list) {
            int length = s.length();
            if(!map.containsKey(length)) {
                List<String> mlist = new ArrayList<>();
                mlist.add(s);
                map.put(length, mlist);
            }else {
                List<String> strings = map.get(length);
                strings.add(s);
            }

        }

        return map;
    }
}
