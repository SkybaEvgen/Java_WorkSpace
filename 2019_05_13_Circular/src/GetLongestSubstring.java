public class GetLongestSubstring {
    public static void main(String[] args) {
        System.out.println(getLongestSubstring("avcc"));
    }

    public static int getLongestSubstring(String input){
        int count = 1;
        int max = 1;
        for (int i = 0; i< input.length()-1; i++){
            if (input.charAt(i)==input.charAt(i+1)){
                count++;
                if(max<count){
                    max=count;
                }
            }
            else count = 1;
        }
        return max;
    }
}
