public class StringReplacer implements StringTransformer {
    public char a;
    public char b;

    StringReplacer(char a, char b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void execute(StringDrink drink) {
        StringBuilder str = new StringBuilder();
        str.append(drink.getText());
        StringBuilder str2 = new StringBuilder();
        int len = str.length();

        for(int i = 0; i < len; i++) {
            if(str.charAt(i) == a) {
                str2.append(b);
            }
            else {
                str2.append(str.charAt(i));
            }
        }
        drink.setText(String.valueOf(str2));
    }

}
