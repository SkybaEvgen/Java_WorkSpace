public class Doctor extends Person {
    private Speciality speciality;

    public Doctor(String name, int yearOfBirth, Speciality speciality) {
        super(name, yearOfBirth);
        this.speciality = speciality;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    @Override
    public String toString() {
        return "Doctor " + this.getName() + " " + speciality;
    }
}