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
        Member member1 = new Member("Joe", 10);
        Member member2 = new Member("Jane", 4);
        Member member3 = new Member("John", 0);
        member1.loadMember(5);
        member2.loadMember(8);
        member3.loadMember(4);
        Book book1 = new Book();
        Book book2 = new Book();

        member1.CheckOut(book1);
        member2.CheckOut(book1);
        member1.Renew(book1);
        member3.CheckOut(book1);
        member1.Return(book1);
        member2.CheckOut(book1);
        member3.setState(FriendOfLibraryState);
    }
}
