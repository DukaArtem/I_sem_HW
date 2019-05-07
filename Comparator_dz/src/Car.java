import java.util.Comparator;

public class Car implements Comparable {
    int exp;
    int size;
    String surname;
    String name;

    Car(String surname, int size, int exp, String name) {
        this.exp = exp;
        this.size = size;
        this.surname = surname;
        this.name = name;
    }

    public String toString() {
        return this.surname + " " + this.size + " " + this.exp + " " + this.name;
    }

    public int compareTo(Object o) {
        return this.surname.compareTo(((Car) o).surname);
    }
}
class ComparatorByPrice implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        return ((Car)o1).size - ((Car)o2).size;
    }
}
class ComparatorBySurname implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        return ((Car)o1).exp - ((Car)o2).exp;
    }
}
class ComparatorByName implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        return ((Car)o1).name.compareTo(((Car)o2).name);
    }
}
class ComparatorByModel implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        return ((Car)o1).surname.compareTo(((Car)o2).surname);
    }
}
