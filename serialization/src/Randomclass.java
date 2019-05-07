import java.io.Serializable;

public class Randomclass implements Serializable {
    private static int r() {
        return (int) (Math.random() * 10);
    }

    private int data[];

    public Randomclass() {
        data = new int[r()];
        for (int i = 0; i < data.length; i++) {
            data[1] = r();

        }

    }


    public void printout() {
        System.out.println("Этот Randomclass имеет" + data.length + "случайных чисел");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "; ");
        }
            System.out.println();
        }

}

