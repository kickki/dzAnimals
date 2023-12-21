import java.time.LocalDate;
import java.util.List;

public class Eagle extends Animal implements Flyable{

    public Eagle(String name, LocalDate birthDate, List<String> vaccinations, String disease, String owner) {
        super(name, birthDate, vaccinations, disease, owner);
    }


    @Override
    public double fly() {
        System.out.printf("%s is flying", type);
        return 12.3;

    }
}
