import java.util.List;

public class StringTransformerGroup {
    List<StringTransformer> S;
    public StringTransformerGroup(List<StringTransformer> S) {
        this.S = S;
    }

    public void execute(StringDrink drink) {
        for(int i = 0; i < S.size(); i++) {
            S.get(i).execute(drink);
        }
    }
}
