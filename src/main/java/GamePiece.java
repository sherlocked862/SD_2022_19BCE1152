import java.util.ArrayList;

public class GamePiece{
	
	public String piece; //String to hold piece value
	public String position; //String to hold position value
	public String player; //String to hold player value
	public String getPiece() {
        return piece;
    }

    public void setPiece(String piece) {
        this.piece = piece;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public ArrayList<String> getMoves() {
        return moves;
    }

    public void setMoves(ArrayList<String> moves) {
        this.moves = moves;
    }

    public int getMovecount() {
        return movecount;
    }

    public void setMovecount(int movecount) {
        this.movecount = movecount;
    }

    public ArrayList<String> moves; //List of possible valid moves
	public int movecount; //Number of moves this piece has taken
	
	public GamePiece(){ // Constructor
		this.piece = "";
		this.position = "";
		this.player = "";
		this.moves = new ArrayList<String>();
		movecount = 0;
	}
}