import java.util.List;

public class Doctor extends VeterinaryClinic {
    protected String name;
    protected String specialization;
    protected int age;
    protected double workExperience;

    public Doctor(String name, String specialization, int age, double workExperience) {
        this.name = name;
        this.specialization = specialization;
        this.age = age;
        this.workExperience = workExperience;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getAge() {
        return age;
    }


    public double getWorkExperience() {
        return workExperience;


    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                ", age=" + age +
                ", workExperience=" + workExperience +
                '}';
    }
}
