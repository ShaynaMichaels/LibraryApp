import java.util.ArrayList;
public class WaitList implements Subject{

    private ArrayList Observers;
    private ArrayList books;

    public WaitList(){
        Observers = new ArrayList();
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
            observer.update(people);
        }
    }

    public void update(ArrayList people){

    }
}
