package pattern.state.gper;

public class GPERtest {
    public static void main(String[] args) {
        AppContext context = new AppContext();
        context.favorite();
        context.comment("Comment: Good article, 360 likes");
    }
}
