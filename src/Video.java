public class Video {
    String title;
    int daysRented = 2; //how many days you can rent

    public Video(String title){
        this.title = title;
    }

    public int getDaysRented(){
        return daysRented;
    }
}
