import java.time.LocalDate;
import java.util.List;

public class Duck extends Animal implements Swimmable,Goable,Flyable{
    public Duck(String name, LocalDate birthDate, List<String> vaccinations, String disease, String owner) {
        super(name, birthDate, vaccinations, disease, owner);

    }

    @Override
    public double fly() {
        System.out.printf("%s is flying", type);
        return 2.89;
    }

    @Override
    public double run() {
        System.out.printf("%s is running", type);
        return 5.6;
    }

    @Override
    public double swim() {
        System.out.printf("%s is swimming", type);
        return 14.5;

    }
}
