package pharmacy;

import java.util.*;

public class PharmacyMain extends Pharmacy {
    public static void main(String[] args) {
        Component pineceline = new Component("Pineceline", "10mg", 100);
        Component salt = new Component("Salt", "5mg", 106);
        Component sugar = new Component("Sugar", "2mg", 67);
        Component water = new Component("Water", "13mg", 0);

        Pharmacy ph1 = new Pharmacy();
        ph1.addComponents(sugar, pineceline, salt);
        Pharmacy ph2 = new Pharmacy();
        ph2.addComponents(sugar,pineceline, salt);
        Pharmacy ph3 = new Pharmacy();
        ph3.addComponents(sugar, water);

        Set<Pharmacy> result = new HashSet<>();
        result.add(ph1);
        result.add(ph2);
        result.add(ph3);
        System.out.println(result.size());
        System.out.println(result);


//        List<Component> list = new ArrayList<>();
//       list.add(salt);
//       list.add(sugar);
//       list.add(pineceline);
//        Collections.sort(list);
//        System.out.println(list);


//        while (iterator.hasNext()) System.out.println(iterator.next());

        }


}
