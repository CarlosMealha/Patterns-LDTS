
public class StringCaseChanger implements StringTransformer {
    @Override
    public void execute(StringDrink drink) {
        StringBuilder str = new StringBuilder();
        str.append(drink.getText());
        int len = str.length();

        for(int i = 0; i < len; i++) {
            if(Character.isLowerCase(str.charAt(i))) {
                str.setCharAt(i,Character.toUpperCase(str.charAt(i)));
                //System.out.println("--" + str.append(Character.toUpperCase(str.charAt(i))));
            }
            else {
                 str.setCharAt(i,Character.toLowerCase(str.charAt(i)));
                //System.out.println(str.append(Character.toLowerCase(str.charAt(i))));
            }
        }
        drink.setText(String.valueOf(str));
    }


    public static void main(String[] args) {
        StringDrink drink = new StringDrink("aBcD");
        StringCaseChanger cc = new StringCaseChanger();
        cc.execute(drink);
        System.out.println(drink.getText());
    }

}
