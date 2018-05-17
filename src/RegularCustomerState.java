public class RegularCustomerState implements MemberState {
    Member member;
    public RegularCustomerState(Member member) {
        this.member = member;
    }

    public void timesToRenew() {
        System.out.print("you can only renew once");
    }

    @Override
    public void referenceBooks() {
        System.out.print("you cannot take out reference books");
    }
}
