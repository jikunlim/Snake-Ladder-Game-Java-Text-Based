public class Players {
    private char playerIcon1 = 'X';
    private char playerIcon2 = 'O';
    private int playercurrentlocation = 0;
    public int playercurrentlocation(int playerlocation, int dice) {   //Player Current Location
        int remain=0;
        playercurrentlocation = playerlocation + dice;
        if (playercurrentlocation > 50) {
            remain = playercurrentlocation - 50;
            playercurrentlocation = 50 - remain;
        }
        return playercurrentlocation;
    }
    public char playerIcon1(char player1Icon) {
        player1Icon = playerIcon1;
        return player1Icon;
    }
    public char playerIcon2(char player2Icon) {
        player2Icon = playerIcon2;
        return player2Icon;
    }
}
