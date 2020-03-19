
public class Task9n185 {
    String str;
    int k = 0;


    Task9n185(String str) {

        this.str = str;
        for (char ch : str.toCharArray()) {
            if (ch == '(')
                k++;
            if (ch == ')')
                k--;
            if (k < 0)

                break;
        }
        if (k != 0) {
            System.out.println("Нет");


        } else {
            System.out.println("Да");
        }

    }


    public static void main(String[] args) {
        Task9n185 str = new Task9n185("(a+b)-()b*c)");
/*String str1 = "(a+b)-()b*c)";
        int index1 = str1.indexOf("(");
        int index2 = str1.indexOf(")");
        int i;

        for (i = 0; i < str1.length(); i++){
            char scobka = str1.charAt(index1);
        char scobka1 = str1.charAt(index2);
        if (index2 )
        System.out.println(index2);}*/

    }
}

 /* for (int i = 0; i < str.length(); i++) {
        Character value = new Character(str.charAt(i));

        if(value.equals(new Character(')')))
            System.out.print(i+" ");}*/