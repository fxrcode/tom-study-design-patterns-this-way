package pattern.state.general.simple;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ConcreteStateB());
        context.handle();
    }

    interface IState {
        void handle();
    }

    static class ConcreteStateA implements IState {

        @Override
        public void handle() {
            System.out.println("StateA do action");
        }

    }

    static class ConcreteStateB implements IState {

        @Override
        public void handle() {
            System.out.println("StateB do action");
        }

    }

    static class Context {
        private static final IState STATE_A = new ConcreteStateA();
        private static final IState STATE_B = new ConcreteStateB();

        private IState currentState = STATE_A;

        public void setState(IState state) {
            this.currentState = state;
        }

        public void handle() {
            this.currentState.handle();
        }
    }







}
