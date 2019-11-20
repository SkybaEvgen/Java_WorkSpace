public class Customer {
    private String fname;
    private String lname;

    public Customer(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }
    public String getFname() {
        return fname;
    }
    public String getLname() {
        return lname;
    }
    @Override
    public String toString() {
        return "fname='" + fname + ", lname='" + lname;
    }




}
