public class Task9n22 {
    public static void main(String[] args) {
        String str = "TestikSimvola";
        int length = str.length();
        int chet = length%2;
        boolean result = chet == 0;
        System.out.println(result);
        String name = str.substring(0, str.length()-(str.length()/2));
        System.out.println(name);

    }
}
