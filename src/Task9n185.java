
public class Task9n185 {
    public static void main(String[] args) {
        String str = "(a+b)-(b*c)";

        int length = str.length();
        int last = str.length()-1;
        /*String [] kusok = str.split("\\(", 4);

        System.out.println("Первое слово: " + kusok[0]);
        System.out.println("Второе слово: " + kusok[1]);
        System.out.println("Третье слово: " + kusok[2]);
        System.out.println("Четвертое слово: " + kusok[3]);
        System.out.println("Пятое слово: " + kusok[4]);
        System.out.println("Первое слово: " + kusok[5]);
        System.out.println("Второе слово: " + kusok[6]);
        System.out.println("Третье слово: " + kusok[7]);
        System.out.println("Четвертое слово: " + kusok[8]);
        System.out.println("Пятое слово: " + kusok[9]);*/

        int index1 = str.indexOf("(");
        int index2 = str.indexOf(")");
        int i;
for ( i = 0; i < str.length(); i++){
    char scobka = str.charAt(index1);
    char scobka1 = str.charAt(index2);
    System.out.println(scobka1);
    if ( (scobka == '(') && (scobka1 == ')'))
        System.out.println( "equals " + i );
            }
        /*char one = str.charAt(0);
        char two = str.charAt(4);
        if ( (one == '(') && (two == ')'))
            System.out.println( "equals 0" );
         else
            System.out.println( "not equals 0" );


      /*  long scoba1 = str.chars().filter(ch -> ch == ')').count();
        long scoba2 = str.chars().filter(ch -> ch == '(').count();

    if (scoba1 == scoba2){
        System.out.println("Скобы расставлены верно - Да");
    }
        else if (scoba1 < scoba2){
    System.out.println();
        }
        else if (scoba1 > scoba2){
    System.out.println("Лишняя закрывающая скобка под индексом " + index2);
        }
*/
    }
}
