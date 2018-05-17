//this allows movies to have the same methods as books
public class VideoAdapter extends Book {
    Video video;

    public VideoAdapter(Video video){
        this.video = video;

    }

    @Override
    public int getDaysBorrowed(){
        return video.getDaysRented();
    }
}
