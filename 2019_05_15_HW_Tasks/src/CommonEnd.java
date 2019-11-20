/*Даны два массива целых чисел. Вернуть true если у них одинаковый первый или
последний элемент. Оба массива длины 1 или более.
commonEnd([1, 2, 3], [7, 3]) →true
commonEnd([1, 2, 3], [7, 3, 2]) →false
commonEnd([1, 2, 3], [1, 3]) → true
*/

public class CommonEnd {
    public static void main(String[] args) {
        int[] a = {1,2,3,5};
        int[] b = {10,3,5};
        System.out.println(commonEnd(a,b));
    }

    public static boolean commonEnd(int[] a, int[] b){
        int a1 = a[0], a2 = a[a.length-1];
        int b1 = b[0], b2 = b[b.length-1];
        if(a1==b1 || a2==b2) return true;
        else return false;
    }
}
