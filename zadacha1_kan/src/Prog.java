
import java.util.Comparator;
public class Prog implements Comparable {
    int exp;
    int growth;
    String name;
    String SurName;
    Prog(int exp, int growth, String name, String SurName) {
        this.exp = exp;
        this.growth = growth;
        this.name = name;
        this.SurName = SurName;
    }
    public String toString() {
        return this.exp + " " + this.growth + " " + this.name + " " + this.SurName;
    }
    public int compareTo(Object o) {
        return this.name.compareTo(((Prog) o).name);
    }
}
class ComparatorByGrowth implements Comparator{
    public int compare(Object o1, Object o2) {
        return ((Prog)o1).growth - ((Prog)o2).growth;
    }
}
class ComparatorByExp implements Comparator{
    public int compare(Object o1, Object o2) {
        return ((Prog)o1).exp - ((Prog)o2).exp;
    }
}
class ComparatorBySName implements Comparator{
    public int compare(Object o1, Object o2) {
        return ((Prog)o1).SurName.compareTo(((Prog)o2).SurName);
    }
}
class ComparatorByName implements Comparator{
    public int compare(Object o1, Object o2) {
        return ((Prog)o1).name.compareTo(((Prog)o2).name);
    }
}