package pharmacy;

import java.util.*;


public class Pharmacy implements Iterator<Component>, Comparable<Pharmacy>{
    private int index;
    private final List<Component> components;

    public Pharmacy()  {
        this.index = 0;
        this.components = new ArrayList<>();

    }



    public void addComponents(Component ... components){
        if(components.length == 0) System.out.println("Вы ничего не добавили!");
        else Collections.addAll(this.components, components);
    }

    @Override
    public boolean hasNext() {
        return index < components.size();

    }

    @Override
    public Component next() {
        return components.get(index++);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pharmacy that = (Pharmacy) o;
        return index == that.index && Objects.equals(components, that.components);
    }



    @Override
    public int hashCode() {
        return Objects.hash(index, components);}

    @Override
    public String toString() {
        return "Pharmacy{" +
                "index=" + index +
                ", components=" + components +
                '}';
    }


    @Override
    public int compareTo(Pharmacy o) {
        return Integer.compare(this.components.size(), o.components.size());
    }
}


