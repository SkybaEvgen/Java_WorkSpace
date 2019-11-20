/*Вернуть версию входного массива, где каждое нулевое значение заменено
максимальным нечетным значением, справа от нуля. Если нечетных числе
справа от нуля нет, то оставляем ноль.
zeroMax([0, 5, 0, 3]) →[5, 5, 3, 3]
zeroMax([0, 4, 0, 3]) →[3, 4, 3, 3]
zeroMax([0, 1, 0]) → [1, 1, 0]
*/
import java.util.Arrays;

public class ZeroMax {
    public static void main(String[] args) {
        int [] q = {0,4,0,3};
        System.out.println(Arrays.toString(zeroMax(q)));
    }

    public static int[] zeroMax(int[] nums){
        for (int i = 0; i<nums.length-1; i++){
            if(nums[i]==0){
                int max = nums[i];
                for (int j = i+1; j<nums.length; j++){
                    if(nums[j]%2!=0 && nums[j]>max){
                        max = nums[j];
                    }
                }
                nums[i]=max;
            }
        }
        return nums;
    }
}
