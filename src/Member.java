import java.util.ArrayList;

public class Member{
    MemberState regularCustomer;
    MemberState friendOf;
    MemberState bigDonor;
    int numOfDonations;
    MemberState state = regularCustomer;


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
