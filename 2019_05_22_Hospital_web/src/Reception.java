import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Reception {
    private int capcity;
    private int size =0;
    private Appointment[] appointments;
    private  static final Doctors DOCTORS =  new Doctors();

    public Reception(int capcity) {
        this.appointments = new Appointment[capcity];
        this.capcity = capcity;
    }

    private void addAppointment(Patient patient){
        if (size<appointments.length){
            appointments[size]= new Appointment(DOCTORS.getDoctor(patient.getSpeciality()),patient);
            size++;
        }
    }

    public void  handleQueue(PatientQueue patientQueue){
        Patient patient=patientQueue.get();
        while (patient!=null){
            addAppointment(patient);
            //System.out.println(appointment);
            patient = patientQueue.get();
        }
    }

    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(appointments[i]);
        }
    }





}
