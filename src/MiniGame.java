import java.util.Scanner;

public class MiniGame {
    public static void main(String[] args) {
        gameStart();
    }

    public static void gameStart(){
        System.out.println("Welcome to RPS Battle! 👊 🖐 ✌️ ");
        Scanner userInput = new Scanner(System.in);
        System.out.print("Will you test your skills? [Yes/No]: ");
        String userStart = userInput.nextLine();
        if (userStart.equalsIgnoreCase("yes")){
            begin();
        }
    }

    public static void begin(){
        Scanner userInput = new Scanner(System.in);
        System.out.print("What is your name combatant: ");
        String userName = userInput.nextLine();
        System.out.printf("Today is a good day to battle %s!\n", userName);
        System.out.println("Your weapons of choice today are:\n Rock(R)👊 \n Paper(P)🖐 \n Scissors(S)✌️");
        System.out.println("Combatants will choose a weapon each round.\n" +
                "Standard RPS rules will decide winner of the round.\n" +
                "Each combatant will need 3 wins for ultimate victory!");
    }

    public static void battle(){
        boolean noVictor = true;
        String victor;
         while(noVictor){
             Scanner userInput = new Scanner(System.in);

         }
    }
}
