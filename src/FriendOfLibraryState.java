public class FriendOfLibraryState implements MemberState {
    Member member;

    public FriendOfLibraryState(Member member) {
        this.member = member;
    }

    @Override
    public void timesToRenew() {
        System.out.print("you can renew 3 times.");
    }

    @Override
    public void referenceBooks() {
        System.out.print("you cannot take out reference books");
    }
}
