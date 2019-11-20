public class Solution {
    public static void main(String[] args) {
        int[] T1 = {-3, -14, -5, 7, 8, 42, 8, 3};
        int[] T2 = {20, -3, 3, 1, 10, 8, 2, 5, 13, -5, 3, -18};

        System.out.println(solution(T1));
        System.out.println(solution(T2));
    }

    public static String solution(int[] T){
        int seasonLength = T.length/4;
        int count=0;
        int maxt=0;
        for(int i = 0; i < 4; i++){
            int max=-100;
            int min=100;
            for (int j = seasonLength*i; j < seasonLength*(i+1); j++){
                if(max<T[j]) max=T[j];
                if(min>T[j]) min=T[j];
                if(maxt<(max-min)) {
                    maxt = max-min;
                    count=i;
                }
            }
        }
        if(count==0) return "WINTER";
        else if(count==1) return "SPRING";
        else if(count==2) return "SUMMER";
        else if(count==3) return "AUTUMN";
        return null;
    }
}
