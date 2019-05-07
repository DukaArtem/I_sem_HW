

import java.io.*;

import java.util.*;

public class InSerialize {
    public static void main(String[] args) {
        try {
            try {
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/file1.txt"));
                Date d1 = (Date) in.readObject();
                Randomclass rc1 = (Randomclass) in.readObject();
                Randomclass rc2 = (Randomclass) in.readObject();

                System.out.println("Прочитано: ");
                System.out.println("Объект Date" + d1);
                System.out.println("Две группы случайных чисел ");

                rc1.printout();
                rc2.printout();
            }catch (ClassNotFoundException e){
                System.out.println("Получена ошибка "+ e);
            }
        }catch (IOException e){
            System.out.println("Получена ошибка "+ e);
        }

    }
}
