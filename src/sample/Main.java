package sample;
import java.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
        JFrame f1= new JFrame();
        f1.setSize(1000,800);
        f1.getContentPane().setLayout(null);
        f1.setVisible(true);
        JButton b1 = new JButton("button1");
        b1.setBounds(4,200,100,60);
        f1.add(b1);

        JFrame f2= new JFrame();
        f2.setSize(1000,800);
        f2.getContentPane().setLayout(null);
        f2.setVisible(true);
        JButton b2 = new JButton("button2");
        b2.setBounds(4,200,100,60);
        f2.add(b2);

        JFrame f3= new JFrame();
        f3.setSize(1000,800);
        f3.getContentPane().setLayout(null);
        f3.setVisible(true);
        JButton b3 = new JButton("button1");
        b3.setBounds(4,200,100,60);
        f3.add(b3);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
            }
        });



    }
}