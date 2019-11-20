/*Вернуть количество четных чисел в массиве целых чисел.
 Напомню, что оператор % "mod" вычисляет остаток от деления, e.g. 5 % 2 равно 1.

countEvens([2, 1, 2, 3, 4]) →3
countEvens([2, 2, 0]) →3
countEvens([1, 3, 5]) →0
*/

public class CountEvens {
    public static void main(String[] args) {
        int [] q = {1,3,5};
        System.out.println(countEvens(q));
    }

    public static int countEvens(int[] nums){
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]%2==0) count+=1;
        }
        return count;
    }
}
