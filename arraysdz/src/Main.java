import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        System.out.println(al.size());
        al.add(5);
        al.add("Name");
        al.add(new Dog("Poodel"));
        al.add(new Car("Zhiguli"));
        System.out.println(al.size());
        System.out.println(al);//вывод коллекции
        System.out.println(al.contains("Name"));
        System.out.println(al.contains("Egor"));
        al.add(2,10);
        System.out.println(al);
        System.out.println(al.indexOf(10));
        al.remove(3);
        System.out.println(al);
        //int save = al.get(2);
        Car save = (Car)al.get(3);
        ArrayList <String>al1 = new ArrayList();
        ArrayList <Car>al2 = new ArrayList();
        al2.add(new Car("Dodge"));
        al2.add(new Car("BMW"));
        al2.add(new Car("Tesla"));
        al2.add(new Car("Tavria"));
        al2.add(new Car("Jeep"));
        System.out.println(al2);
        al2.remove(2);
        System.out.println(al2);
        Car cavel = al2.get(3);
        System.out.println(al2.get(3));
        Car[] c = new Car[al2.size()];
        al2.toArray(c);
        for(Car temp: c){
            System.out.println(temp + " ");
        }

        ArrayList a2 = new ArrayList();
        System.out.println(al.size());
        a2.add(5);
        a2.add("Name");
        a2.add(new Dog("Poodel"));

        System.out.println(a2.size());
        System.out.println(a2);//вывод коллекции
        System.out.println(a2.contains("Name"));
        System.out.println(a2.contains("Egor"));
        a2.add(2,10);
        System.out.println(a2);
        System.out.println(a2.indexOf(10));
        a2.remove(3);
        System.out.println(a2);
        //int save = a2.get(2);
        Dog safe = (Dog)a2.get(3);
        ArrayList <String>a21 = new ArrayList();
        ArrayList <Dog>a22 = new ArrayList();
        a22.add(new Dog("Terier"));
        a22.add(new Dog("Bulldog"));
        a22.add(new Dog("Ovcharka"));
        a22.add(new Dog("Stuff"));
        a22.add(new Dog("Pitbull"));
        System.out.println(a22);
        a22.remove(2);
        System.out.println(a22);
        Dog cafel = a22.get(3);
        System.out.println(a22.get(3));
        Dog[] d = new Dog[a22.size()];
        a22.toArray(d);
        for(Dog temp: d){
            System.out.println(temp + " ");
        }

    }
}
