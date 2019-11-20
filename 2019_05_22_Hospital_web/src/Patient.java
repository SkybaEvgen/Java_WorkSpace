public class Patient extends Person {
    private Speciality speciality;

    public Patient(String name, int yearOfBirth, Speciality speciality) {
        super(name, yearOfBirth);
        this.speciality = speciality;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Patient " + super.toString() + "go to " + speciality;
    }
}
