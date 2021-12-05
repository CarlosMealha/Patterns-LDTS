import java.util.List;

public class StringRecipe {
    List<StringTransformer> S;
    public StringRecipe(List<StringTransformer> S) {
        this.S = S;
    }

    public void mix(StringDrink drink) {
        for(int i = 0; i < S.size(); i++) {
            S.get(i).execute(drink);
        }
    }
}
