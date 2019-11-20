public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};

        int[] arr2 = {55,89,144,233,377};

        //addAll(arr1, 8, arr2);
        //removeRange(0,5, arr1);
        //remove(2, arr1);
    }

    public static int remove(int index, int[] arr){
        if(index > arr.length) return -1;
        else {
            int sizeNew = arr.length-1;
            int[] old = arr;
            arr = new int[sizeNew];
            for (int i = 0; i < index; i++) {
                arr[i] = old[i];
            }
            for (int i = index; i < arr.length; i++) {
                arr[i] = old[i+1];
            }
            for (int q : arr) System.out.println(q);

        }
        return 1;
    }

    public static boolean removeRange (int fromIndex, int toIndex, int[]arr){
        if(fromIndex>toIndex || fromIndex>arr.length || toIndex>arr.length) return false;
        else {
            int sizeNew = arr.length - (toIndex-fromIndex);
            int[] old = arr;

            arr = new int[sizeNew];

            for (int i = 0; i < fromIndex; i++) {
                arr[i] = old[i];
            }

           for (int i = fromIndex; i <arr.length ; i++) {
                arr[i] = old[i+(toIndex-fromIndex)];
           }

            for (int q : arr) System.out.println(q);
        }
        return true;
    }

    public static boolean addAll (int[] ar1, int [] ar2){
        int sizeNew = ar1.length + ar2.length;
        int[] old = ar1;
        ar1 = new int[sizeNew];
        for (int i = 0; i < old.length; i++) {
            ar1[i] = old[i];
            System.out.println(ar1[i]);
        }
        for (int i = old.length; i < ar1.length; i++) {
            ar1[i] = ar2[i-old.length];
            System.out.println(ar1[i]);
        }
        return true;
    }

    public static boolean addAll (int[] ar1, int index, int[] ar2){
        if(index > ar1.length) return false;
        if(index==ar1.length){
            addAll(ar1, ar2);
        }
        else {
            int sizeNew = ar1.length + ar2.length;
            int[] oldArr = ar1;
            ar1 = new int[sizeNew];
            for (int i = 0; i < index; i++) {
                ar1[i] = oldArr[i];
                System.out.println(ar1[i]);
            }
            for (int i = index; i < index+ar2.length; i++) {
                ar1[i] = ar2[i-index];
                System.out.println(ar1[i]);
            }
            for (int i = index; i < oldArr.length; i++) {
                ar1[i] = oldArr[i];
                System.out.println(ar1[i]);
            }
        }
        return true;
    }

}
