public class Task9n107 {
    public static void main(String[] args) {
        String str = "a123456789o";
        StringBuilder sb = new StringBuilder(str);
        int last = str.length()-1;
        boolean bukvao = str.contains("o");
        boolean bukvaa = str.contains("a");
        System.out.println(bukvaa + "" + bukvao);
        sb.replace(0, 1, "o");
        System.out.println(sb.replace(last, (last + 1), "a"));
        //или
        boolean bukvend = str.endsWith("o");
        boolean bukvstart = str.startsWith("a");
        System.out.println(bukvend + "" + bukvstart);

    }
}
