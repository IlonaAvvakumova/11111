import java.util.Scanner;

/*public class Task6n87_1 {

}*/
class Game1 {


    public static void main(String[] args) {

     play();
       do { System.out.println(score());
       }
        while (command !=0);
        System.out.println(result());


    }
   static int team1 = 0;
   static int team2 = 0;
   static int command;
   static int score;
   static String  name1;
   static String name2;
       static   void play() {

            Scanner console = new Scanner(System.in);
            System.out.println("Введите команду №1:  ");
            name1 = console.nextLine();
            System.out.println("Введите команду №2:  ");
            name2 = console.nextLine();
        }
         static String score() {
            Scanner console = new Scanner(System.in);
            do {
                System.out.println("Введите команду, чтобы забить (1 или 2 или 0, чтобы закончить игру): ");
                command = console.nextInt();
                if (command != 0) {
                    System.out.println("Введите счет (1 или 2 или 3");
                    score = console.nextInt();
                    if (score > 3)
                        return "Введите число от 1 до 3";
                    if (command == 1) {
                        team1 += score;

                         return "Команда "  + name1 +  " счет " + team1 + " Команда " + name2 + " счет " + team2;
                    }
                    if (command == 2) {
                        team2 += score;

                        return "Команда "  + name1 +  " счет " + team1 + " Команда " + name2 + " счет " + team2;
                    }
                } else if (command == 0) { break;

                }
            }

            while (command != 0);
               return "Игра законченна! ";
        }

        static String result() {
          return   "Итоговый: команда " + name1 + " счет " + team1 + " команда " + name2 + " счет " + team2;
        }

}