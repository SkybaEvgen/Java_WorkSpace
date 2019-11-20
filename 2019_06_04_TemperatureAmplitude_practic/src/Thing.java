import java.util.Arrays;

public class Thing {

    long size;

    public Thing(long size){
        this.size = size;
    }

    @Override
    public int compareTo(Thing o){
        if(this.size > o.size){
            return 1;
        }
        if(this.size < o.size){
            return -1;
        }
        return 0;
    }
}
