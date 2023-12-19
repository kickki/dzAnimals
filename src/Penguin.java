import java.time.LocalDate;
import java.util.List;

public class Penguin extends Animal {

    public Penguin(String name, LocalDate birthDate, List<String> vaccinations, String disease, String owner) {
        super(name, birthDate, vaccinations, disease, owner);

    }

    @Override
    protected void fly() {
            System.out.println("This animal can't fly");
    }
}
