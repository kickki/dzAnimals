import java.time.LocalDate;
import java.util.List;

public class Fish extends Animal implements Swimmable{
    public Fish(String name, LocalDate birthDate, List<String> vaccinations, String disease, String owner) {
        super(name, birthDate, vaccinations, disease, owner);
    }
    @Override
    public double swim() {
        System.out.printf("%s is swimming", type);
        return 8.9;
    }
}
