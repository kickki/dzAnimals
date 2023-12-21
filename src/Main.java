import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        Animal cat = new Cat("Barsik", LocalDate.of(2007,12,18), new ArrayList<>(),"Cold","Vasiliy",4);
        Animal penguin = new Penguin("Cago",LocalDate.of(2003,11,8), new ArrayList<>(),"Chytridiomycosis","Petr");
        Animal duck = new Duck("Lilit", LocalDate.of(2021,2,9), new ArrayList<>(),"Toxoplasmosis","Mariya");
        Animal eagle = new Eagle("Kesha", LocalDate.of(2001,10,11), new ArrayList<>(),"Distemper","Elena");
        Animal fish = new Fish("Dori", LocalDate.of(2019,2,12), new ArrayList<>(), "Cancer", "Skubi");
       VeterinaryClinic clinic = new VeterinaryClinic();
       clinic.addPatients(cat,fish,penguin,duck);

        System.out.println(clinic.getPatients());
        System.out.println(clinic.getGoable());
        clinic.woundTreatment();
        clinic.diagnose(cat);
        clinic.giveInjection(cat); //не понимаю почему следующая строка пишется сразу же за этой :(
        System.out.println("Your animal's pulse is " + clinic.pulseMeasurement(cat));
    }
}