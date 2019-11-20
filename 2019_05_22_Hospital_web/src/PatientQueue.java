public class PatientQueue {
    private int capacity = 20;
    private Patient[] patients = new Patient[capacity];
    private int size = -1;
    private int index=0;

    public void add(Patient patient){
        if (size<patients.length-1) {
            size++;
            patients[size] = patient;
        } else {
            System.out.println("hospital is full");

        }
    }

    public Patient get(){
        if(index<=size){
            return patients[index++];
        } else {
            return null;
        }
    }

    public void print(){
        if (size<0) {
            System.out.println("Size of the Queue is 0");
            return;
        }
        int temp=0;
        for (int i = index; i<=size; i++){
            System.out.println(patients[i]);
            temp++;
        }
        System.out.println("Size of the Queue is " + temp);

    }
}
