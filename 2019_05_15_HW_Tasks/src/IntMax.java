/*Даны три целых числа a b c, вернуть наибольшее.
intMax(1, 2, 3) →3
intMax(1, 3, 2) →3
intMax(3, 2, 1) →3
*/


public class IntMax {
    public static void main(String[] args) {

        System.out.println(intMax(20,5,80));
    }

    public static int intMax(int a, int b, int c){
        int[] arr = {a, b, c};
        int max=a;
        for (int i = 1; i<3; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
