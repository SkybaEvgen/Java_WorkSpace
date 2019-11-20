import java.util.Arrays;

public class _1_Tasks {
    public static void main(String[] args) {
        boolean weekday = true;
        boolean vacation = true;
        //System.out.println(sleepIn(true, false));             // метод sleepIn
        //System.out.println(diff21(25));                       // метод diff21
        //System.out.println(endUp("hi"));                      // метод endUp
        //System.out.println(intMax(20,5,80));                  // метод intMax
        int[] a = {1,2,3};
        int[] b = {10,3};
        //System.out.println(commonEnd(a,b));                   // метод commonEnd
        int[] с = {1,1,1,1};
        //System.out.println(sum2(с));                          // метод sum2
        int [] d = {1,3,5};
        //System.out.println(countEvens(d));                    // метод countEvens
        int [] e = {0,4,0,3};
        //System.out.println(Arrays.toString(zeroMax(e)));      // метод zeroMax
        int [] f = {6,2,5,3};
        //System.out.println(Arrays.toString(shiftLeft(f)));    // метод shiftLeft
        String g = "shotl";
        String h = "java";
        //System.out.println(nonStart(g,h));                    // метод nonStart
        String i = "Practice";
        //System.out.println(middleTwo(i));                     // метод middleTwo
    }

    public static boolean sleepIn(boolean weekday, boolean vacation){
        if(weekday != true || vacation == true) return true;
        else return false;
    }

    public static int diff21(int n){
        int c = 21;
        if(n<=c) return c-n;
        else return (n-c)*2;
    }

    public static String endUp(String str){
        if(str.length()<3) return str.toUpperCase();
        else {
            char a1 = str.charAt(str.length()-3);
            char a2 = str.charAt(str.length()-2);
            char a3 = str.charAt(str.length()-1);
            str = str.substring(0,str.length()-3) + Character.toUpperCase(a1) + Character.toUpperCase(a2) + Character.toUpperCase(a3);
        }
        return str;
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

    public static boolean commonEnd(int[] a, int[] b){
        int a1 = a[0], a2 = a[a.length-1];
        int b1 = b[0], b2 = b[b.length-1];
        if(a1==b1 || a2==b2) return true;
        else return false;
    }

    public static int sum2(int[] nums){
        if(nums.length==0) return 0;
        if(nums.length<2) return nums[0]+nums[1];
        else return nums[0]+nums[1];
    }

    public static int countEvens(int[] nums){
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]%2==0) count+=1;
        }
        return count;
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

    public static int[] shiftLeft(int[] nums){
        int[] newn = new int[nums.length];
        newn [nums.length-1] = nums[0];
        for(int i = 0; i<nums.length-1; i++){
            newn[i] = nums[i+1];
        }
        return newn;
    }

    public static String nonStart(String a, String b){
        String c = a.substring(1, a.length()) + b.substring(1,b.length());
        return c;
    }

    public static String  middleTwo(String str){
        String a = str.substring(str.length()/2 - 1);
        String b = str.substring(str.length()/2);
        char a1 = a.charAt(0);
        char b1 = b.charAt(0);
        String c = new StringBuilder().append(a1).append(b1).toString();
        return c;
    }

}