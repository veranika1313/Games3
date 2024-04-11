import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в игру «камень, ножницы, бумага»!");

        while(true){
            System.out.println("Введите свой выбор (камень, бумага, ножницы): ");
            String playerChoice = scanner.next().toLowerCase();

            if(!playerChoice.equals("камень") && !playerChoice.equals("бумага") && !playerChoice.equals("ножницы")){
                System.out.println("Неверный выбор. Пожалуйста, попробуйте еще раз.");
                continue;
            }

            String[] choices = {"камень", "бумага", "ножницы"};
            String computerChoice = choices[(int) (Math.random() * 3)];

            System.out.println("Выбор компьютера: " + computerChoice);

            if(playerChoice.equals(computerChoice)){
                System.out.println("It's a tie!");
            } else if((playerChoice.equals("камень") && computerChoice.equals("ножницы")) ||
                    (playerChoice.equals("ножницы") && computerChoice.equals("бумага")) ||
                    (playerChoice.equals("бумага") && computerChoice.equals("камень"))){
                System.out.println("Ты победил!");
            } else {
                System.out.println("Ты проиграл!");
            }

            System.out.println("Хотите сыграть еще раз? (да нет)");
            String playAgain = scanner.next();

            if(!playAgain.equals("да")){
                break;
            }
        }
        System.out.println("Спасибо за игру!");
    }
}