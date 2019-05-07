import java.io.*;
import java.util.*;


public class OutSerialize {

    public static void main(String[] args) {
        try {
            Randomclass rc1 = new Randomclass();
            Randomclass rc2 = new Randomclass();

            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/file1.txt"));
            Date now = new Date(System.currentTimeMillis());

            out.writeObject(now);
            out.writeObject(rc1);
            out.writeObject(rc2);
            out.close();

            System.out.println("Записано: ");
            System.out.println("Объект Date" + now);
            System.out.println("Две группы случайных чисел ");

            rc1.printout();
            rc2.printout();
        } catch (IOException e) {
            System.out.println("Получена ошибка" + e);


        }
    }
}
