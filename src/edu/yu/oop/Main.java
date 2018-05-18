package edu.yu.oop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.lang.reflect.Member;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Customer Info");
        primaryStage.setScene(new Scene(root, 500, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
        Member member = new Member();
        member.loadMember(5);
        Book book1 = new Book();
        Book book2 = new Book();

        member.CheckOut(book1);
        member.Renew(book1);
        member.Return(book1);
        
    }
}
