import java.time.LocalDate;
import java.util.List;

public class Penguin extends Animal implements Goable,Swimmable{

    public Penguin(String name, LocalDate birthDate, List<String> vaccinations, String disease, String owner) {
        super(name, birthDate, vaccinations, disease, owner);

    }


    @Override
    public double run() {
        System.out.printf("%s is running", type);
        return 8.9;
    }

    @Override
    public double swim() {
        System.out.printf("%s is swimming", type);
        return 20.0;
    }
}
