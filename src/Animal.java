import java.time.LocalDate;
import java.util.List;

// Добавить в класс Animal методы двигаться(toGo), летать(fly), плавать(swim).
// 2) Создать по два класса наследника Animal, умеющих летать,
// плавать, бегать(животное может как уметь что-то одно, так и все сразу).
//3) В main добиться того, чтобы при вызове метода действия,
// которое конкретное животное не умеет, оно этого не делало
// (кошки не летают, рыбы не ходят)

public class Animal {
    protected String name;
    protected LocalDate birthDate;
    protected List<String> vaccinations;
    protected String disease;
    protected String owner;


    public Animal(String name, LocalDate birthDate, List<String> vaccinations, String disease, String owner) {
        this.name = name;
        this.birthDate = birthDate;
        this.vaccinations = vaccinations;
        this.disease = disease;
        this.owner = owner;
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
    protected void toGo(){
        System.out.println("Animal is running");
    }
    protected void fly(){
        System.out.println("Animal is flying");
    }
    protected void swim(){
        System.out.println("Animal is swimming");
    }
    public void lifeCycle(){
        wakeUp();
        play();
        fly();
        eat();
        swim();
        toGo();
        sleep();
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
