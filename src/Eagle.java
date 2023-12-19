import java.time.LocalDate;
import java.util.List;

public class Eagle extends Animal{

    public Eagle(String name, LocalDate birthDate, List<String> vaccinations, String disease, String owner) {
        super(name, birthDate, vaccinations, disease, owner);
    }

    @Override
    protected void swim() {
        System.out.println("This animal can't swimming");
    }
}
