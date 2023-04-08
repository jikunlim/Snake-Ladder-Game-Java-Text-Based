public class Board {
    //LINE 5 TO 14: DECLARE VARIABLE
    private int boardNum = 50;
    private int instructionLocation = 50;
    private int playersLocation = 50;
    private int[] box1 = new int[boardNum];
    private int[] box2 = new int[instructionLocation];
    private int[] box3 = new int[playersLocation];
    private char defaultp1, defaultp2;
    private int border;
    private Players Icon = new Players();
    private int a = 41, b = 40, c = 21, d = 20, e = 1;

    public void row1(int p1, int p2) {
        for (boardNum = a; boardNum < 51; boardNum++) {
            switch (boardNum) {
                case 50:
                    System.out.print("|\t" + "Win\t|");
                    break;
                case 47:
                    System.out.print("|     GO TO    ");
                    break;
                case 41:
                    System.out.print("|     Pause    ");
                    break;
                default:
                    System.out.print("|\t" + box1[boardNum - 1] + "\t");
                    break;
            }
        }
        System.out.print("\n");
        for (instructionLocation = a; instructionLocation < 51; instructionLocation++) {
            switch (instructionLocation) {
                case 50:
                    System.out.print("|\t\t|");
                    break;
                case 47:
                    System.out.print("|     Box 36   ");
                    break;
                case 41:
                    System.out.print("|    2 Turns   ");
                    break;
                default:
                    System.out.print("|\t\t");
                    break;
            }
        }
        System.out.print("\n");
        for (playersLocation = a; playersLocation < 51; playersLocation++) {// TO LOOP THE PLAYER LOCATION
            defaultp1 = ' ';// INITIALIZE PLAYER 1 AND 2 AS BLANK
            defaultp2 = ' ';
            if (p1 == playersLocation) {//IF PLAYER 1 CURRENT LOCATION IS SAME AS THE BOARD NUMBER THEN WILL CALL PLAYER 1 ICON FROM PLAYER CLASS

                defaultp1 = Icon.playerIcon1(defaultp1);
            }
            if (p2 == playersLocation) {//IF PLAYER 2 CURRENT LOCATION IS SAME AS THE BOARD NUMBER THEN WILL CALL PLAYER 2 ICON FROM PLAYER CLASS

                defaultp2 = Icon.playerIcon2(defaultp2);
            }
            System.out.print("|\t" + defaultp1 + defaultp2 + "\t");//PRINT PLAYER VALUE

        }
        System.out.print("|\n");

    }
    public void row2(int p1, int p2) {
        for (boardNum = b; boardNum > 30; boardNum--) {
            switch (boardNum) {
                case 38:
                    System.out.print("|    Reverse   ");
                    break;
                case 31:
                    System.out.print("|\t" + box1[boardNum - 1] + "\t|");
                    break;
                case 32:
                    System.out.print("|     Go To    ");
                    break;
                default:
                    System.out.print("|\t" + box1[boardNum - 1] + "\t");
                    break;
            }
        }
        System.out.print("\n");
        for (instructionLocation = b; instructionLocation > 30; instructionLocation--) {
            switch (instructionLocation) {
                case 38:
                    System.out.print("|    4 Steps   ");
                    break;
                case 31:
                    System.out.print("|\t\t|");
                    break;
                case 32:
                    System.out.print("|     Box 13   ");
                    break;
                default:
                    System.out.print("|\t\t");
                    break;
            }
        }
        System.out.print("\n");
        for (playersLocation = b; playersLocation > 30; playersLocation--) {
            defaultp1 = ' ';
            defaultp2 = ' ';
            if (p1 == playersLocation) {

                defaultp1 = Icon.playerIcon1(defaultp1);
            }
            if (p2 == playersLocation) {

                defaultp2 = Icon.playerIcon2(defaultp2);
            }
            System.out.print("|\t" + defaultp1 + defaultp2 + "\t");
        }
        System.out.print("|\n");
    }
    public void row3(int p1, int p2) {
        for (boardNum = c; boardNum < 31; boardNum++) {
            switch (boardNum) {
                case 30:
                    System.out.print("|    Reverse   |");
                    break;
                case 26:
                    System.out.print("|    Reverse   ");
                    break;
                case 23:
                    System.out.print("|     Pause    ");
                    break;
                default:
                    System.out.print("|\t" + box1[boardNum - 1] + "\t");
                    break;
            }
        }
        System.out.print("\n");
        for (instructionLocation = c; instructionLocation < 31; instructionLocation++) {
            switch (instructionLocation) {
                case 30:
                    System.out.print("|    5 Steps   |");
                    break;
                case 26:
                    System.out.print("|    5 Steps   ");
                    break;
                case 23:
                    System.out.print("|    3 Turns   ");
                    break;
                default:
                    System.out.print("|\t\t");
                    break;
            }
        }
        System.out.print("\n");
        for (playersLocation = c; playersLocation < 31; playersLocation++) {
            defaultp1 = ' ';
            defaultp2 = ' ';
            if (p1 == playersLocation) {

                defaultp1 = Icon.playerIcon1(defaultp1);
            }
            if (p2 == playersLocation) {

                defaultp2 = Icon.playerIcon2(defaultp2);
            }
            System.out.print("|\t" + defaultp1 + defaultp2 + "\t");

        }
        System.out.print("|\n");
    }
    public void row4(int p1, int p2) {
        for (boardNum = d; boardNum > 10; boardNum--) {
            switch (boardNum) {
                case 17:
                    System.out.print("|     Go To    ");
                    break;
                case 14:
                    System.out.print("|    Reverse   ");
                    break;
                case 11:
                    System.out.print("|\t" + box1[boardNum - 1] + "\t|");
                    break;
                default:
                    System.out.print("|\t" + box1[boardNum - 1] + "\t");
                    break;
            }
        }
        System.out.print("\n");
        for (instructionLocation = d; instructionLocation > 10; instructionLocation--) {
            switch (instructionLocation) {
                case 17:
                    System.out.print("|     Box 25   ");
                    break;
                case 14:
                    System.out.print("|    4 Steps   ");
                    break;
                case 11:
                    System.out.print("|\t\t|");
                    break;
                default:
                    System.out.print("|\t\t");
                    break;
            }
        }
        System.out.print("\n");
        for (playersLocation = d; playersLocation > 10; playersLocation--) {
            defaultp1 = ' ';
            defaultp2 = ' ';
            if (p1 == playersLocation) {

                defaultp1 = Icon.playerIcon1(defaultp1);
            }
            if (p2 == playersLocation) {

                defaultp2 = Icon.playerIcon2(defaultp2);
            }
            System.out.print("|\t" + defaultp1 + defaultp2 + "\t");
        }
        System.out.print("|\n");
    }
    public void row5(int p1, int p2) {
        for (boardNum = e; boardNum < 11; boardNum++) {
            switch (boardNum) {
                case 8:
                    System.out.print("|     GO TO    ");
                    break;
                case 10:
                    System.out.print("|\t" + box1[boardNum - 1] + "\t|");
                    break;
                default:
                    System.out.print("|\t" + box1[boardNum - 1] + "\t");
                    break;
            }
        }
        System.out.print("\n");
        for (instructionLocation = e; instructionLocation < 11; instructionLocation++) {
            switch (instructionLocation) {
                case 8:
                    System.out.printf("|     Box 27   ");
                    break;
                case 10:
                    System.out.print("|\t\t|");
                    break;
                default:
                    System.out.print("|\t\t");
                    break;
            }
        }
        System.out.print("\n");
        for (playersLocation = e; playersLocation < 11; playersLocation++) {
            defaultp1 = ' ';
            defaultp2 = ' ';
            if (p1 == playersLocation) {

                defaultp1 = Icon.playerIcon1(defaultp1);
            }
            if (p2 == playersLocation) {

                defaultp2 = Icon.playerIcon2(defaultp2);
            }
            System.out.print("|\t" + defaultp1 + defaultp2 + "\t");

        }
        System.out.print("|\n");
    }
    public void board(int p1, int p2) {// GET THE POSITION OF PLAYER 1 AND 2/COMPUTER
        //LINE 271 TO LINE 279: CREATE THE BLANK BOX FOR LATER TO INSERT VALUE
        for (boardNum = 0; boardNum < 50; boardNum++) {
            box1[boardNum] = boardNum + 1;
        }
        for (instructionLocation = 0; instructionLocation < 50; instructionLocation++) {
            box2[instructionLocation] = instructionLocation + 1;
        }
        for (playersLocation = 0; playersLocation < 50; playersLocation++) {
            box3[playersLocation] = playersLocation + 1;
        }

        //LINE 282 TO LINE 308: TO LOOP 5 ROW WITH EACH ROW HAS ANOTHER 3 ROW, TOTAL OF 15 ROW
        for (int row = 1; row <= 5; row++) {
            for (border = 0; border <= 150; border++)// TO LOOP THE GRID OR THE BOX OUTLINE
            {
                System.out.print("-");
            }
            System.out.print("\n");

            switch (row) {
                case 1:
                    row1(p1, p2);
                    break;
                case 2:
                    row2(p1, p2);
                    break;
                case 3:
                    row3(p1, p2);
                    break;
                case 4:
                    row4(p1, p2);
                    break;
                case 5:
                    row5(p1, p2);
                    break;
                default:
                    break;
            }
        }
        for (border = 0; border <= 150; border++)// FOR THE LAST OULINE CAN'T BE LOOP SO HERE IS THE BOTTOM LINE
        {
            System.out.print("-");
        }
        System.out.print("\n");
    }
}
