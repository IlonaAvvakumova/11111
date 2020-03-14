import java.util.Scanner;
public class Task6n87 {

}
class Game {
    public static void main(String[] args) {
        int team1 = 0;
        int team2 = 0;
        Scanner console = new Scanner(System.in);
        System.out.println("Введите команду №1:  ");
         String name1 = console.nextLine();
        System.out.println("Введите команду №2:  ");
        String name2 = console.nextLine();
int command;
int score;
      do {  System.out.println("Введите команду, чтобы забить (1 или 2 или 0, чтобы закончить игру): ");
        command = console.nextInt();
        if (command !=0){ System.out.println("Введите счет (1 или 2 или 3");
         score = console.nextInt();
          if (score > 3)
              System.out.println("Введите число от 1 до 3");
          if (command == 1) {
              team1 += score;
              System.out.println("Команда " + name1 + " счет " + team1);
              System.out.println("Команда " + name2 + " счет " + team2);}
           if (command == 2){
              team2 += score;
          System.out.println("Команда " + name1 + " счет " + team1);
          System.out.println("Команда " + name2 + " счет " + team2);}}
          else if (command == 0) {
          System.out.println("Итоговый: команда " + name1 + " счет " + team1 + " команда " + name2 + " счет " + team2); }}

        while (command != 0);


    }
    }






