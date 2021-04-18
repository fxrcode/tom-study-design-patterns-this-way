package pattern.state.gper;

public class UnloginState extends UserState {

    @Override
    public void favorite() {
        this.swtich2login();
        this.context.getState().favorite();
    }

    @Override
    public void comment(String comment) {
        this.swtich2login();
        this.context.getState().comment(comment);
    }

    private void swtich2login() {
        System.out.println("Redirect to login page");
        this.context.setState(this.context.STATE_LOGIN);
    }
}
