/*Вернуть массив, смещенный влево на один индекс.
 То ест для {6, 2, 5, 3} вернуть {2, 5, 3, 6}. Можно вернуть
 измененный данный массив, а можно вернуть новый.
shiftLeft([6, 2, 5, 3]) →[2, 5, 3, 6]
shiftLeft([1, 2]) →[2, 1]
shiftLeft([1]) →[1]
*/
import java.util.Arrays;

public class ShiftLeft {
    public static void main(String[] args) {
        int [] q = {6,2,5,3};
        System.out.println(Arrays.toString(shiftLeft(q)));
    }

    public static int[] shiftLeft(int[] nums){
        int[] newn = new int[nums.length];
        newn [nums.length-1] = nums[0];
        for(int i = 0; i<nums.length-1; i++){
            newn[i] = nums[i+1];
        }
        return newn;
    }
}
