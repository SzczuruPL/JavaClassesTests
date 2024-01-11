
public class Doctor extends Employee{
    private String specialization;

    public Doctor(String name, int age, double salary, String specialization) {
        super(name, age, salary);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return super.toString() + " | Specialization: " + specialization;
    }
}
