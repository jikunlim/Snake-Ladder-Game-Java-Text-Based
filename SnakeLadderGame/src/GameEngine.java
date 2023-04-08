import java.util.Random;
import java.util.Scanner;
public class GameEngine {
    Board showboard = new Board();
    Players player = new Players();
    private int pause1 = 0, pause2 = 0;
    private int dice1 = 0, dice2 = 0;
    private int roundnum=1;
   
    public void SinglePlayer(int p1, int p2) {
        System.out.println("\nPlayer 1 will have the first round");
        while ((p1 < 50) && (p2 < 50)) {//check whether got player reach box 50
            System.out.println("Round " + roundnum);
            if (roundnum % 2 == 1)//Player 1 Movement
            {
                if (pause1 == 0)//check player 1 pause status
                {
                    dice1 = dice(dice1);
                    p1 = player.playercurrentlocation(p1, dice1);
                    p1 = GameMovement(p1);
                    pause1 = GamePause(p1, pause1);
                } else if (pause1 > 0) {
                    dice1 = 0;
                    p1 = player.playercurrentlocation(p1, dice1);
                    p1 = GameMovement(p1);
                    pause1--;
                }
                showboard.board(p1, p2);//Show Current Board
                System.out.println("Player 1 Dice: " + dice1);//player 1 current dice
                System.out.println("Player 1 Current Location: " + p1);//player 1 current location
                System.out.println("Computer Current Location: " + p2);//computer current location
                WinConditionP1(p1);//player reach box 50 the program will end
                roundnum++;//add the round number
            } 
            else if (roundnum % 2 == 0)//Player 2 Movement
            {
                if (pause2 == 0)//check computer pause status
                {
                    dice2 = dice(dice2);
                    p2 = player.playercurrentlocation(p2, dice2);
                    p2 = GameMovement(p2);
                    pause2 = GamePause(p2, pause2);
                } else if (pause2 > 0) {
                    dice2 = 0;
                    p2 = player.playercurrentlocation(p2, dice2);
                    p2 = GameMovement(p2);
                    pause2--;
                }
                showboard.board(p1, p2);//Show Current Board
                System.out.println("Computer Dice: " + dice2);//computer current dice
                System.out.println("Player 1 Current Location: " + p1);//player 1 current location
                System.out.println("Computer Current Location: " + p2);//computer current location
                WinConditionP2(p2);
                roundnum++;//add the round number
            }
        }
                    
    }
    public void Multiplayer(int p1, int p2) {
        System.out.println("\nPlayer 1 will have the first round");
        while ((p1 < 50) && (p2 < 50)) {//check whether got player reach box 50
            System.out.println("Round " + roundnum);
            if (roundnum % 2 == 1)//Player 1 Movement
            {
                if (pause1 == 0)//check player 1 pause status
                {
                    dice1 = dice(dice1);
                    p1 = player.playercurrentlocation(p1, dice1);
                    p1 = GameMovement(p1);
                    pause1 = GamePause(p1, pause1);
                } else if (pause1 > 0) {
                    dice1 = 0;
                    p1 = player.playercurrentlocation(p1, dice1);
                    p1 = GameMovement(p1);
                    pause1--;
                }
                showboard.board(p1, p2);//Show Current Board
                System.out.println("Player 1 Dice: " + dice1);//player 1 current dice
                System.out.println("Player 1 Current Location: " + p1);//player 1 current location
                System.out.println("Player 2 Current Location: " + p2);//player 2 current location
                WinConditionP1(p1);
                roundnum++;//add the round number
            } 
            else if (roundnum % 2 == 0)//Player 2 Movement
            {
                if (pause2 == 0)//check player 2 pause status
                {
                    dice2 = dice(dice2);
                    p2 = player.playercurrentlocation(p2, dice2);
                    p2 = GameMovement(p2);
                    pause2 = GamePause(p2, pause2);
                } else if (pause2 > 0) {
                    dice2 = 0;
                    p2 = player.playercurrentlocation(p2, dice2);
                    p2 = GameMovement(p2);
                    pause2--;
                }
                showboard.board(p1, p2);//Show Current Board
                System.out.println("Player 2 Dice: " + dice2);//player 1 current dice
                System.out.println("Player 1 Current Location: " + p1);//player 1 current location
                System.out.println("Player 2 Current Location: " + p2);//player 2 current location
                WinConditionP3(p2);
                roundnum++;//add the round number
            }
        }
    }
    public int GamePause(int playerlocation, int pause) {
        switch (playerlocation) {
            case 23:
                pause = 3;
                break;
            case 41:
                pause = 2;
                break;
            default:
                return pause;
        }
        return pause;
    }
    public int GameMovement(int playerlocation) {
        switch (playerlocation) {
            case 8:
                playerlocation = playerlocation + 19;
                break;
            case 14:
                playerlocation = playerlocation - 4;
                break;
            case 17:
                playerlocation = playerlocation + 8;
                break;
            case 26:
                playerlocation = playerlocation - 5;
                break;
            case 30:
                playerlocation = playerlocation - 5;
                break;
            case 32:
                playerlocation = playerlocation - 19;
                break;
            case 38:
                playerlocation = playerlocation - 4;
                break;
            case 47:
                playerlocation = playerlocation - 11;
                break;
            default:
                return playerlocation;
        }
        return playerlocation;
    }
    public int dice(int dice) {
        Random dicenum = new Random();
        dice = dicenum.nextInt(6) + 1;
        return dice;
    }
    public void WinConditionP1(int p1) {
        Scanner kb = new Scanner(System.in);
        if (p1 == 50) {
            System.out.println("Congratulations! Player 1 is the winner\n");
            roundnum=0;
        }
        else 
        {
            System.out.println("Press Enter to Continue");
            kb.nextLine();
        }
    }
     public void WinConditionP2(int p2) {
        Scanner kb = new Scanner(System.in);
        if (p2 == 50) {
            System.out.println("Congratulations! Computer is the winner\n");
            roundnum=0;
        }
        else {
            System.out.println("Press Enter to Continue");
            kb.nextLine();
        }
    }
      public void WinConditionP3(int p2) {
        Scanner kb = new Scanner(System.in);
        if (p2 == 50) {
            System.out.println("Congratulations! Player 2 is the winner\n");
            
            roundnum=0;
        }
        else {
            System.out.println("Press Enter to Continue");
            kb.nextLine();
        }
    }
}
