import java.util.*;
class queen
{
    public static void queen(char board[][],int row)
    {
        //base case
        if(row == board.length){
            printboard(board);
            count++;
            return;
        }
        //column loop
        for(int j =0;j<board.length;j++)
        {
            if (isValid(board,row,j)==true){
            board[row][j]='Q';
            queen(board,row+1);//function call
            board[row][j]='x';//backtacking step
        }
    }
    }
    static int count=0;
    public static void printboard(char board[][])
    {
    System.out.println("--chess board--");
    {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    }
    public static boolean isValid(char[][] board, int row, int col) {
        // Check row on the left side
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper diagonal on left side
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check upper diagonal on right side
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Input n for of n*n board");
    int n = sc.nextInt();
    char board[][]=new char [n][n];
    //initialize
    for(int i=0;i<board.length;i++)
    {
        for(int j=0;j<board.length;j++)
        {
            board[i][j]='x';
        }
    }
    queen(board,0);
    System.out.println("Total ways="+count);
}
}