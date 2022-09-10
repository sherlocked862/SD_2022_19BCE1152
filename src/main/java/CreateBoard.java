public class CreateBoard {
    public static Board getBoard(){
        Board gameBoard = new Board();
		for(int i = 0;i < 5;i++){
			for(int j = 0; j < 5; j++){
				gameBoard.GBoard[i][j] = null;
			}
		}
        return gameBoard;
    }
}
