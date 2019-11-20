import java.util.Comparator;

public class InnerClassDemo {

    private String someField;

    public InnerClassDemo(String someField) {
        this.someField = someField;
    }

    public static void main(String[] args) {

        StringByLengthComparator sc = new StringByLengthComparator();

        InnerClassDemo m = new InnerClassDemo("ssdsfsfd");
        m.innerMethodDemo();

    }
    public void innerMethodDemo(){
        SomeClass s = new SomeClass("text");
        System.out.println(s.value);
    }

    public static class StringByLengthComparator implements Comparator<String>{
        @Override
        public int compare(String s, String t1) {
            if(s.length()>t1.length()){
                return 1;
            }else if(s.length()<t1.length()){
                return -1;
            }
            return 0;
        }
    }

    private static class SomeClass{
        private String value;

        public SomeClass(String value){
            this.value = value;
        }

        public void printSomeVelue(){
            System.out.println(someField);
        }
    }

    public interface Doable{
        void soSomething();
    }
}
