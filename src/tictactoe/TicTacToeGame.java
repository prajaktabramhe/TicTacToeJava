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
        System.out.println("Current Board");

        for (int index = 1; index < board.length; index++)
        {
            System.out.print(board[index] + " | ");
            if(index == 3 || index == 6 || index == 9)
            {
                System.out.println();
            }
        }

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
