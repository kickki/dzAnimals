import java.time.LocalDate;
import java.util.List;


public class Animal  {
    protected String name;
    protected LocalDate birthDate;
    protected List<String> vaccinations;
    protected String disease;
    protected String owner;
    protected String type;


    public Animal(String name, LocalDate birthDate, List<String> vaccinations, String disease, String owner) {
        this.name = name;
        this.birthDate = birthDate;
        this.vaccinations = vaccinations;
        this.disease = disease;
        this.owner = owner;
        this.type = getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public List<String> getVaccinations() {
        return vaccinations;
    }

    public String getDisease() {
        return disease;
    }

    public String getOwner() {
        return owner;
    }


    private void wakeUp(){
        System.out.println("Animal woke up");
    }
    private void eat(){
        System.out.println("Animal is eating");
    }
    private void sleep(){
        System.out.println("Animal is sleeping");
    }
    private void play(){
        System.out.println("Animal is playing");
    }



    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", vaccinations=" + vaccinations +
                ", disease='" + disease + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
