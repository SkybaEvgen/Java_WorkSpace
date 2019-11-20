import java.util.Iterator;

public class MyArray{

        private int[] arr;
        private int size;
        private static final int DEFAULT_CAPACITY = 10;

        MyArray() {
            arr = new int[DEFAULT_CAPACITY];
        }

        MyArray(int capacity) {
            arr = new int[capacity];
        }

        public int getSize() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int indexOf(int number) {
            for (int i = 0; i < size; i++) {
                if (arr[i] == number) {
                    return i;
                }
            }
            return -1;
        }

        public int lastIndexOf(int number) {
            for (int i = size - 1; i >= 0; i--) {
                if (arr[i] == number) {
                    return i;
                }
            }
            return -1;
        }

        public int get(int index) {
            if (index < size) {
                return arr[index];
            }
            return -1;
        }

        public int set(int index, int number) {
            int oldValue = -1;
            if (index < size) {
                oldValue = arr[index];
                arr[index] = number;
            }
            return oldValue;
        }

        public boolean add(int number) {
            ensureCapacity();
            arr[size] = number;
            size++;
            return true;
        }

        public boolean addAtPosition(int index, int number) {
            if (index >= size) {
                return false;
            }
            ensureCapacity();
            int[] oldArr = copyArray(size);
            size++;
            arr[index] = number;
            for (int i = index + 1; i < size; i++) {
                arr[i] = oldArr[i - 1];
            }
            return true;
        }

        public int remove(int number) {
            int foundIndex = indexOf(number);
            if (foundIndex == -1) {
                return -1;
            }
            int[] oldArr = copyArray(size);
            int oldValue = arr[foundIndex];
            size--;
            for (int i = foundIndex; i < size; i++) {
                arr[i] = oldArr[i + 1];
            }
            return oldValue;
        }

        private void ensureCapacity() {
            if (size == arr.length) {
                int newSize = arr.length * 2;
                arr = copyArray(newSize);
            }
        }

        private int[] copyArray(int newSize) {
            int[] newArr = new int[newSize];
            for (int i = 0; i < size; i++) {
                newArr[i] = arr[i];
            }
            return newArr;
        }

        public void print() {
            for (int i = 0; i < size; i++) {
                System.out.println(arr[i]);
            }
        }
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        public boolean addAll (int[] arrToAdd){
            int sizeNew = size + arrToAdd.length;
            int[] oldArr = arr;
            arr = new int[sizeNew];
            for (int i = 0; i < size; i++) {
                arr[i] = oldArr [i];
            }
            for (int i = size; i < arr.length; i++) {
                arr[i] = arrToAdd[i-size];
            }
            return true;
        }

        public boolean addAll (int index, int[] arrToAdd){
            if(index > size) return false;
            if(index==size){
                addAll(arr);
                return true;
            }
            else {
                int sizeNew = size + arrToAdd.length;
                int sizeAv = index + arrToAdd.length;
                int[] oldArr = arr;
                arr = new int[sizeNew];
                for (int i = 0; i < index; i++) {
                    arr[i] = oldArr[i];
                }
                for (int i = index; i < sizeAv; i++) {
                    arr[i] = arrToAdd[i-index];
                }
                for (int i = index; i < oldArr.length; i++) {
                    arr[i] = oldArr[i];
                }
            }
            return true;
        }

        public boolean removeRange (int fromIndex, int toIndex){
            if(fromIndex > toIndex || fromIndex > size || toIndex > size) return false;
            else {
                int sizeNew = size - (toIndex - fromIndex);
                int[] old = arr;
                arr = new int[sizeNew];
                for (int i = 0; i < fromIndex; i++) {
                    arr[i] = old[i];
                }
                for (int i = fromIndex; i < arr.length; i++) {
                    arr[i] = old[i + (toIndex - fromIndex)];
                }
                return true;
            }
        }

        public int removeIndex(int index){
            if(index > size) return -1;
            else {
                int sizeNew = size-1;
                int[] old = arr;
                arr = new int[sizeNew];
                for (int i = 0; i < index; i++) {
                    arr[i] = old[i];
                }
                for (int i = index; i < arr.length; i++) {
                    arr[i] = old[i+1];
                }
            }
            return 1;
        }


}
