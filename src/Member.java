import java.util.ArrayList;
import java.sql.*;

public class Member{
    MemberState regularCustomer;
    MemberState friendOf;
    MemberState bigDonor;
    int numOfDonations;
    MemberState state = regularCustomer;
    String first;
    String last;
    int ID;


    String name;
    ArrayList<Book> [] BooksOut;

    public Member(String name, int numDonations){
        this.name=name;
        regularCustomer = new RegularCustomerState(this);
        friendOf = new FriendOfLibraryState(this);
        bigDonor = new BigDonorState(this);
        numOfDonations = numDonations;

        if (numOfDonations > 7 ){
            state = bigDonor;
        }
        else if (numOfDonations > 2){
            state = friendOf;
        }

    }

    public void loadMember(int id) {
        try {

            Connection conn = DriverManager.getConnection("Library");
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT First_Name, Last_Name, ID, Status From Customers Where ID =" + id);

            if (rs.next()) { // there was a result
                first = rs.getString("First_Name");
                last = rs.getString("Last_Name");
                ID = id;

            }
        }
        catch (SQLException a) {
            System.out.println(a);
        }
    }
    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void CheckOut(Book book) {
     if (book.type == 1){
        state.referenceBooks();
    }

    }

    public void Renew(Book book){
        state.timesToRenew();
    }

    public void Return(Book book){

    }

    public void setState(MemberState state){
        this.state = state;
    }

    public MemberState getState(){
        return state;
    }
}
