import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        char x;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите несколько символов и нажмите Ентер:");
        do{
            x=(char)br.read();
            System.out.println(x);
        }while (x!='x');

    }
}
