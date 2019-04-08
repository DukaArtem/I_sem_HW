import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Prog c1 = new Prog(4,175, "Саня", "Дубровский");
        Prog c2 = new Prog(2,180, "Ваня", "Гаврилюк");
        Prog c3 = new Prog(1,187, "Петро", "Порошенко");
        Prog c4 = new Prog(1,182, "Яна", "Пилипко");
        Prog c5 = new Prog(2,162, "Егор", "Юдин");
        Prog c6 = new Prog(4,181, "Даша", "Шидловская");
        Prog c7 = new Prog(3,169, "Виталик", "Рогалик");
        Prog c8 = new Prog(6,198, "Геннадий", "Горин");
        Prog[] c = {c1, c2, c3,c4, c5, c6, c7, c8};

        System.out.println("1 = Cортировка по фамилии");

        System.out.println("2 = Cортировка по имени");

        System.out.println("3 = Cортировка по опыту");

        System.out.println("4 = Cортировка по росту");

        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        switch (t) {
            case 1:  System.out.println("Cортировка по фамилии:");
                Arrays.sort(c, new ComparatorBySName());
                for (Prog temp : c) {
                    System.out.println(temp + " ");
                }
                    break;

            case 2:   System.out.println("Cортировка по имени:");
                Arrays.sort(c, new ComparatorByName());
                for (Prog temp : c) {
                    System.out.println(temp + " ");
                }
                break;

            case 3:   System.out.println("Cортировка по опыту:");
                Arrays.sort(c, new ComparatorByExp());
                for (Prog temp : c) {
                    System.out.println(temp + " ");
                }break;

            case 4: System.out.println("Cортировка по росту:");
                Arrays.sort(c, new ComparatorByGrowth());
                for (Prog temp : c) {
                    System.out.println(temp + " ");
                }break;

                default:  System.out.println("По фамилии:");
                 Arrays.sort(c, new ComparatorBySName());
                for (Prog temp : c) {
                    System.out.println(temp + " ");
              }

        }









        }

    }

