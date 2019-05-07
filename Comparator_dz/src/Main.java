
import java.util.Arrays;
        import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        System.out.println("1 = сортировка по фамилии");
        System.out.println("2 = сортировка по опыту");
        System.out.println("3 = сортировка по росту");
        System.out.println("4 = сортировка по именам");
        System.out.println();
        Scanner scan = new Scanner(System.in);
        int v = scan.nextInt();
        Car c1 = new Car("Grishko", 187, 5, "Andrey");
        Car c2 = new Car("Buba", 169, 4, "Vitaliy");
        Car c3 = new Car("Zelenskiy", 178, 2, "Vladimir");
        Car c4 = new Car("Poroshenko", 175, 1, "Petro");
        Car c5 = new Car("Gorin", 190, 3, "Gennadiy");
        Car[] c = {c1, c2, c3, c4, c5};
        Arrays.sort(c);


        if (v == 1) {
            System.out.println("по фамилии");
            Arrays.sort(c, new ComparatorByName());
            for (Car temp : c) {
                System.out.println(temp + " ");
            }
        }
        if (v == 2) {
            System.out.println("по опыту");
            Arrays.sort(c, new ComparatorBySurname());
            for (Car temp : c) {
                System.out.println(temp + " ");
            }
        }
        if (v == 3) {
            System.out.println("по росту");
            Arrays.sort(c, new ComparatorByPrice());
            for (Car temp : c) {
                System.out.println(temp + " ");
            }
        }
        if (v == 4) {
            System.out.println("по именам");
            Arrays.sort(c, new ComparatorByModel());
            for (Car temp : c) {
                System.out.println(temp + " ");
            }
        }
    }
}