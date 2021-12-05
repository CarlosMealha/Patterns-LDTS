public class StringInverter implements StringTransformer {
    @Override
    public void execute(StringDrink drink) {
        StringBuilder str = new StringBuilder();
        str.append(drink.getText());
        str.reverse();
        drink.setText(String.valueOf(str));
    }
}