import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal implements Goable{
    private int legsCount;
      Cat(String name, LocalDate birthDate, List<String> vaccinations, String disease, String owner, int legsCount){
        super(name, birthDate, vaccinations, disease, owner);
        this.legsCount = legsCount;
    }

    public int getLegsCount() {
        return legsCount;
    }

    @Override
    public double run() {
        System.out.printf("%s is running", type);
        return 10.0;
    }
}
