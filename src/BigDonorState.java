public class BigDonorState implements MemberState {
    Member member;
    public BigDonorState(Member member) {
        this.member = member;
    }

    @Override
    public void timesToRenew() {
        System.out.print("you can renew as many times as you want");
    }

    @Override
    public void referenceBooks() {
        System.out.print("you can take out reference books");
    }
}
