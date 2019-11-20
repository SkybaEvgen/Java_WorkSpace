/*Дан массив целых чисел. Вернуть сумму двух первых элементов массива. Если
длина массива меньше двух, вернуть сумму всех элементов. Вернуть 0, если длина
массива равна нулю.
sum2([1, 2, 3]) →3
sum2([1, 1]) →2
sum2([1, 1, 1, 1]) →2
*/

public class Sum2 {
    public static void main(String[] args) {
        int[] a = {1,2};
        System.out.println(sum2(a));
    }

    public static int sum2(int[] nums){
        if(nums.length==0) return 0;
        if(nums.length<2) return nums[0]+nums[1];
        else return nums[0]+nums[1];
    }
}
