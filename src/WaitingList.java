public class WaitingList {
    private static WaitingList ourInstance = new WaitingList();

    public static WaitingList getInstance() {
        return ourInstance;
    }

    private WaitingList() {
    }
}
