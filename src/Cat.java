import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal{
    private int legsCount;
      Cat(String name, LocalDate birthDate, List<String> vaccinations, String disease, String owner, int legsCount){
        super(name, birthDate, vaccinations, disease, owner);
        this.legsCount = legsCount;
    }

    public int getLegsCount() {
        return legsCount;
    }

    @Override
    protected void fly() {
        System.out.println("This animal can't fly");
    }
}
