public class йййй {
    public static void main(String[] args) {
        String bracket = "(a+b))-((b*c)";

            char[] array = bracket.toCharArray();
            if (array.length % 2 != 0) System.out.println("da");
            int d = 0;
            for (int i = 0; i < array.length; i++) {
                d += array[i] == '(' ? 1 : -1;
                if (d < 0) System.out.println("no");
            }

        /*String [] kusok = split(" ");

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
    }
}
