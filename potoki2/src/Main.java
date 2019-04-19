import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        String str= "Vash Zakaz";
        String s;
        int count = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Chto Zhelaete: ");
        s = br.readLine();
        while (! s.equalsIgnoreCase("Net")){
            count ++;
            str = str +" "+count + ":" + s.toLowerCase();
            System.out.println(str = " Eshe chto to7");
            s = br.readLine();}
        System.out.println("Spasibo! Vash zakaz prinyat!");
        }
    }

