import java.util.*;

public class Demo {
    public static void main(String[] args) {
        String[] array1 = {"(1)мама", "мыла", "раму"};
        String[] array2 = {"(2)я", "очень", "люблю", "java"};
        String[] array3 = {"(3)мир", "труд", "май"};

        List<String[]> arrays = new ArrayList<>();
        arrays.add(array1);
        arrays.add(array2);
        arrays.add(array3);

        arrays.sort((o1, o2) -> o1.length - o2.length);

       for (String [] s : arrays){
           for (String q : s) {
               System.out.print(q + " ");
           }
       }
    }
}
