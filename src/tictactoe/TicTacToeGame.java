package tictactoe;

import java.util.Locale;
import java.util.Scanner;

public class TicTacToeGame
{
    public static void main(String[] args)
    {
        char[] board = createBoard();
        char UserLetter = chooseLetter();
        char ComputerLetter;
        if(UserLetter=='X')
        {
            ComputerLetter='O';
        }
        else
        {
            ComputerLetter='X';

        }
        System.out.println("Computer Letter is: " + ComputerLetter+" User Letter is : " + UserLetter);
        showBoard(board);
        move(board,UserLetter);
        showBoard(board);
    }
    public static void move(char[] board,char symbol)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index from 1 to 9 to make the move");
        int index=sc.nextInt();
        if(board[index]==' ')
        {
            board[index]=symbol;
        }
        else
            {
                System.out.println("Index is not free");

        }

    }
    public static char chooseLetter()
    {
        char symbol;
        Scanner UserInput = new Scanner(System.in);
        System.out.print("Enter your symbol");
        symbol = UserInput.next().toUpperCase().charAt(0);
        return symbol;
    }

    public static void showBoard(char[] board)
    {
        System.out.println("\n" + board[1] + "  |  "  + board[2] + "  |  " + board[3]);
        System.out.println("--------------");
        System.out.println(" " + board[4] + "  |  "  + board[5] + "  |  " + board[6]);
        System.out.println("--------------");
        System.out.println(" " + board[7] + "  |  "  +board[8] + "  |  " + board[9]);
        System.out.println("--------------");
    }
    public static char[] createBoard()
    {
        char[] board = new char[10];
        for(int index = 1; index < board.length; index++)
        {
            board[index] = ' ';
        }
        return  board;
    }
}
