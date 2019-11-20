import java.util.Calendar;

public class Appointment {      // моделирует связь доктора с пациентом
    private Doctor doctor;
    private Patient patient;
    private String time;

    public Appointment(Doctor doctor, Patient patient) {
        this.doctor = doctor;
        this.patient = patient;
        this.time = Calendar.getInstance().get(Calendar.HOUR)+" : "+Calendar.getInstance().get(Calendar.MINUTE);
    }
    public Doctor getDoctor() {
        return doctor;
    }
    public Patient getPatient() {
        return patient;
    }
    public String getTime() {
        return time;
    }
    @Override
    public String toString() {
        return "Appointment{" + "doctor=" + doctor + ", patient=" + patient + ", time='" + time + '\'' + '}';
    }
}
