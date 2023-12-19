import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Animal cat = new Cat("Barsik", LocalDate.of(2007,12,18), new ArrayList<>(),"Cold","Vasiliy",4);
        Animal penguin = new Penguin("Cago",LocalDate.of(2003,11,8), new ArrayList<>(),"Chytridiomycosis","Petr");
        Animal duck = new Duck("Lilit", LocalDate.of(2021,2,9), new ArrayList<>(),"Toxoplasmosis","Mariya");
        Animal eagle = new Eagle("Kesha", LocalDate.of(2001,10,11), new ArrayList<>(),"Distemper","Elena");
        List<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(eagle);
        animals.add(penguin);
        animals.add(duck);
        System.out.println("----CAT----");
        cat.lifeCycle();
        System.out.println("----PENGUIN----");
        penguin.lifeCycle();
        System.out.println("----DUCK----");
        duck.lifeCycle();
        System.out.println("----EAGLE----");
        eagle.lifeCycle();
    }
}