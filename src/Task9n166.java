public class Task9n166 {
    public static void main(String[] args) {
        String tmp, s = "Мороз и солнце, день чудесный";
        String [] stih = s.split(" ");
        System.out.println("Первое слово: " + stih[0]);
        System.out.println("Второе слово: " + stih[1]);
        System.out.println("Третье слово: " + stih[2]);
        System.out.println("Четвертое слово: " + stih[3]);
        System.out.println("Пятое слово: " + stih[4]);
        tmp = stih[0];
        stih [0] = stih[stih.length-1];
        stih [stih.length-1] = tmp;
        for (String word : stih){
            System.out.println(word + " ");
        }

    }
}
