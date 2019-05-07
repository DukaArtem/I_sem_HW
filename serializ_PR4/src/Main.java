import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date d = new Date();
        System.out.println("Дата первая ");
        System.out.println(d);
        System.out.println();

        Dates dat = new Dates();
        System.out.println("Дата вторая ");
        dat.printOut3();
        System.out.println();

        System.out.println("Дата пятая ");
        dat.printOut5();
    }
}
