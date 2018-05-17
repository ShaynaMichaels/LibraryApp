import java.util.ArrayList;

import java.sql.*;

public class AvailableBooks implements Subject{

    private ArrayList Observers;
    private ArrayList books;

    public AvailableBooks(){
        Observers = new ArrayList();
    }

    public void loadCustomer(int id) {
        try {

            Connection conn = DriverManager.getConnection("jdbc:sqlite:Library");
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT Book, membID From Book_Status, Books where Books.Book_ID = Book_Status.Book_ID and membID = NULL");

            if (rs.next()) { // there was a result
                books.add(rs.getString("Book"));
            }
        }
        catch (SQLException a) {
            System.out.println(a);
        }
    }

    public void registerObserver(Observer o){
        Observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = Observers.indexOf(o);
        if (i >= 0) {
            Observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (int i=0; i<Observers.size(); i++){
            Observer observer = (Observer)Observers.get(i);
            observer.update(books);
        }
    }

}
