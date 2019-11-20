public class HospitalMain {
    public static void main(String[] args) {

        PatientQueue patientQueue = new PatientQueue();

        Patient p1 = new Patient("Pac01", 1985,Speciality.DENTIST);
        Patient p2 = new Patient("Pac02", 1990,Speciality.OCULIST);
        Patient p3 = new Patient("Pac03", 1970,Speciality.TERAPIST);
        Patient p4 = new Patient("Pac04", 1998,Speciality.CADIOLOGIST);
        Patient p5 = new Patient("Pac05", 1999,Speciality.OCULIST);

        patientQueue.add(p1);
        patientQueue.add(p2);
        patientQueue.add(p3);
        patientQueue.add(p4);
        patientQueue.add(p5);

        Reception reception = new Reception(100);
        reception.handleQueue(patientQueue);
        reception.print();

    }
}
