import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;

public class Main extends Application {

    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setScene(new Scene(root,300,275));
        primaryStage.show();
	// write your code here
    }
    public static void main(String[] args){

        String name;
        int age;
        //System.out.println("Kak vas zovut?");
        name = JOptionPane.showInputDialog("Ukazhite vashe imya");
        System.out.println("Zdravstvuyte, "+ name + "!");
        //System.out.println("Skolko vam let?");
        age = Integer.parseInt(JOptionPane.showInputDialog("Ukazhite vash vozrast"));
        System.out.println( name+ " vam " + age +" let!");
        System.exit(0);
    }


}
