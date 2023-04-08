import java.util.InputMismatchException;
import java.util.Scanner;
public class TestSegiLadder {
    public static void main(String[] args) {
        try (Scanner kb = new Scanner(System.in)) {
            int userInput, p1 = 0, p2 = 0;
            String userselection="Y";
            String Option1 = "Single-Player";
            String Option2 = "Multiplayer";
            GameEngine gameEngine = new GameEngine();
            Board board = new Board();    
            try {
                 System.out.println("Welcome to Segi Ladder Game.");
                 System.out.println("Do you want to play a Game? Please enter Y or N: ");
                 userselection=kb.nextLine();
                if(userselection.equals("Y") || userselection.equals("y"))
                {
                do{
                board.board(p1, p2);
                System.out.println("\nPlease select below option by insert represented number to start the game:");
                System.out.println("Option 1: " + Option1);
                System.out.println("Option 2: " + Option2);
                System.out.println("Option 3: Exit Game");
                userInput = kb.nextInt();
                kb.nextLine();    
                switch (userInput) {
                    case 1:
                        System.out.println("The Option you Choose is " + Option1);
                        gameEngine.SinglePlayer(p1, p2);
                        break;
                    case 2:
                        System.out.println("The Option you Choose is " + Option2);
                        gameEngine.Multiplayer(p1, p2);
                        break;
                    case 3:
                        System.out.println("The Option you Choose is Exit Game");
                        System.out.println("Good Bye, Have A Nice Day!");
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
                }
                while((userInput==1)||(userInput==2));
                }
                else
                {
                    System.out.println("Invalid Input");
                }
      }
                catch (InputMismatchException e) {
                System.out.println("Program Error due to Input Mismatch");
            }
        }
    }
    }

