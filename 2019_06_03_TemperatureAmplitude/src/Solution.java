import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        int[] T1 = {-3, -14, -5, 7, 8, 42, 8, 3};
        int[] T2 = {2, -3, 3, 1, 10, 8, 2, 5, 13, -5, 3, -18};

        System.out.println(solution(T1));
        System.out.println(solution(T2));
    }

    public static String solution(int[] T) {
        ArrayList <Integer> winter = new ArrayList();
        ArrayList <Integer> spring = new ArrayList();
        ArrayList <Integer> summer = new ArrayList();
        ArrayList <Integer> autumn = new ArrayList();

        for (int i = 0; i < T.length/4; i++) {
            winter.add(T[i]);
        }
        for (int i = T.length/4; i < T.length/2 ; i++) {
            spring.add(T[i]);
        }
        for (int i = T.length/2; i < ((T.length/4)+(T.length/2)); i++) {
            summer.add(T[i]);
        }
        for (int i = ((T.length/4)+(T.length/2)); i < T.length; i++) {
            autumn.add(T[i]);
        }

        int winterMax = Collections.max(winter);
        int winterMin = Collections.min(winter);

        int springMax = Collections.max(spring);
        int springMin = Collections.min(spring);

        int summerMax = Collections.max(summer);
        int summerMin = Collections.min(summer);

        int autumnMax = Collections.max(autumn);
        int autumnMin = Collections.min(autumn);

        int winterTempFluctuation = winterMax - winterMin;
        int springTempFluctuation = springMax - springMin;
        int summerTempFluctuation = summerMax - summerMin;
        int autumnTempFluctuation = autumnMax - autumnMin;

        if (winterTempFluctuation > springTempFluctuation && winterTempFluctuation > summerTempFluctuation && winterTempFluctuation > autumnTempFluctuation) {
            System.out.print("max fluctuation is " + winterTempFluctuation + " ");
            return "WINTER";
        }
        else if(springTempFluctuation > winterTempFluctuation && springTempFluctuation > summerTempFluctuation && springTempFluctuation > autumnTempFluctuation) {
            System.out.print("max fluctuation is " + springTempFluctuation + " ");
            return "SPRING";
        }
        else if(summerTempFluctuation > winterTempFluctuation && summerTempFluctuation > springTempFluctuation && summerTempFluctuation > autumnTempFluctuation){
            System.out.print("max fluctuation is " + summerTempFluctuation + " ");
            return "SUMMER";
        }
        else if(autumnTempFluctuation > winterTempFluctuation && autumnTempFluctuation > springTempFluctuation && autumnTempFluctuation > summerTempFluctuation){
            System.out.print("max fluctuation is " + autumnTempFluctuation + " ");
            return "AUTUMN";
        }
        return null;
    }
}
