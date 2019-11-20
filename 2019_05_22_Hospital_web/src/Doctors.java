public class Doctors {
    private Doctor[] doctors;

    private void init(){
        Doctor[] doctors = {
                new Doctor("Doc1",1977,Speciality.DENTIST),
                new Doctor("Doc2",1971,Speciality.OCULIST),
                new Doctor("Doc3",1980,Speciality.TERAPIST),
                new Doctor("Doc4",1972,Speciality.CADIOLOGIST)
        };
        this.doctors = doctors;
    }

    public Doctors() {
        init();
    }

    public void print(){
        for (int i = 0; i < doctors.length; i++) {
            System.out.println(doctors[i]);
        }
    }

    public Doctor getDoctor(Speciality speciality){
        for (int i = 0; i < doctors.length ; i++) {
            if(doctors[i].getSpeciality().equals(speciality)) {
                return doctors[i];
            }
        }
        return null;
    }

}
