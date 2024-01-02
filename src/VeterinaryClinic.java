import javax.print.Doc;
import java.time.LocalDate;
import java.util.*;

public class VeterinaryClinic implements HelpFromDoctor,HelpFromNurse {
    private List<Animal> patients = new ArrayList<>();
    public void addPatient(Animal animal) {
        patients.add(animal);
    }

    public void addPatients(Animal... animals) {
        Collections.addAll(patients, animals);
    }

    public List<Goable> getGoable() {
        List<Goable> result = new ArrayList<>(patients.size());
        for (Animal animal : patients) {
            if (animal instanceof Goable) {
                result.add((Goable) animal);
            }
        }
        return result;
    }

    public List<Animal> getPatients() {
        return patients;
    }

    @Override
    public void giveInjection(Animal animal) {
        System.out.printf("Giving an injection to the %s.%n", animal.type);
    }

    @Override
    public void woundTreatment() {
        System.out.println("The wound has been successfully treated!!");
    }

    @Override
    public int pulseMeasurement(Animal animal) {
        int max = 30;
        int min = 210;
        Random r = new Random();
        int randomNum = r.nextInt(50, 200);
        return randomNum;
    }

    @Override
    public void diagnose(Animal animal) {
        System.out.printf("Conducting %s's examination. ", animal.name);
        System.out.println("Diagnosis is done, take this sheet.");


    }
}




