import java.util.ArrayList;

public class Board {
    public static String[][] GBoard =new String[5][5]; //A gameboard that is a 2d array of gamepieces and empty squares
	public GamePiece lastPieceMoved; //Last piece moved. Self explanatory.
	public ArrayList<String> player1PieceList; //Hold a list of player 1 pieces. Could be handy.
	public ArrayList<String> player2PieceList; //Hold a list of player 2 pieces. Could be handy again.
	public int turn; //Turn of game. For testing.
	
	public Board(){
		this.lastPieceMoved = null;
		this.player1PieceList = new ArrayList<String>();
		this.player2PieceList = new ArrayList<String>();
		this.turn = 0;
	}

    public static void printBoard(String[] pl1, String[] pl2){
		

        for(int i = 0;i<5;i++){
            GBoard[4][i] = pl1[i];

        }
        for(int i = 0;i<5;i++){
            GBoard[0][i] = pl2[i];

        }
		//Print the board
        for(int i = 4; i>=0; i--){
            for(int j = 0; j<5; j++){
                if(null != GBoard[i][j]) {
                    System.out.print(GBoard[i][j] + " ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}
