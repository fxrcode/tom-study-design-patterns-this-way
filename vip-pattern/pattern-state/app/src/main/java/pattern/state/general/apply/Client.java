package pattern.state.general.apply;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ConcreteStateA());
        System.out.println(context.getState());
        context.handle();
        System.out.println(context.getState());
    }

    static abstract class State {
        protected Context context;

        public void setContext(Context context) {
            this.context = context;
        }

        public abstract void handle();
    }

    static class ConcreteStateA extends State {

        @Override
        public void handle() {
            System.out.println("StateA do action");
            this.context.setState(Context.STATE_B);
            this.context.getState().handle();
        }

    }
    static class ConcreteStateB extends State {

        @Override
        public void handle() {
            System.out.println("StateB do action");
        }

    }

    static class Context {
        public static final State STATE_A = new ConcreteStateA();
        public static final State STATE_B = new ConcreteStateB();
        private State currentState = STATE_A;
        {
            STATE_A.setContext(this);
            STATE_B.setContext(this);
        }

        public void setState(State state) {
            this.currentState = state;
            this.currentState.setContext(this);
        }

        public State getState() {

            return this.currentState;
        }

        public void handle() {
            this.currentState.handle();
        }
    }

}
