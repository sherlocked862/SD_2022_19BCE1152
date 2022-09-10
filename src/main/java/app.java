import java.util.Scanner;

public class app{
    public static void main(String[] args){
        Board gameBoard = CreateBoard.getBoard();
        


        Scanner sc = new Scanner(System.in);
        String[] pl1 = new String[5];
        String[] pl2 = new String[5];
        System.out.println("Enter player 1 pieces");
        for(int i=0;i<5;i++){
            pl1[i] = sc.nextLine();

        }
        System.out.println("Enter player 2 pieces");
        for(int i=0;i<5;i++){
            pl2[i] = sc.nextLine();
            
        }

        Board.printBoard(pl1,pl2);


    }
}