package pattern.state.gper;

public class AppContext {
    public static final UserState STATE_LOGIN = new LoginState();
    public static final UserState STATE_UNLOGIN = new UnloginState();

    private UserState currentState = STATE_UNLOGIN;
    {
        STATE_LOGIN.setContext(this);
        STATE_UNLOGIN.setContext(this);
    }

    public void setState(UserState state) {
        this.currentState = state;
    }

    public UserState getState() {
        return currentState;
    }

    public void favorite() {
        this.currentState.favorite();
    }
    public void comment(String comment) {
        this.currentState.comment(comment);
    }
}
