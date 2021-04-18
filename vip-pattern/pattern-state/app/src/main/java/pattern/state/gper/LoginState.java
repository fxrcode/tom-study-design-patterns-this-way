package pattern.state.gper;

public class LoginState extends UserState {

    @Override
    public void favorite() {
        System.out.println("you favorited it successfully~~~");

    }

    @Override
    public void comment(String comment) {
        System.out.println("Comment added: " + comment);
    }
    
}
