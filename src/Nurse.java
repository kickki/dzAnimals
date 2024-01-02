import java.util.List;

public class Nurse extends VeterinaryClinic {
    protected String name;
    protected int age;
    protected double workExperience;

    public Nurse(String name, int age, double workExperience) {
        this.name = name;
        this.age = age;
        this.workExperience = workExperience;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWorkExperience() {
        return workExperience;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", workExperience=" + workExperience +
                '}';
    }
}
