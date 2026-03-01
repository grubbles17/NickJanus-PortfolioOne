package org.example;

import java.util.Scanner;

public class App {
  public String getGreeting() {
    return "Welcome to the upcoming game of Tic-Tac-Toe! Enjoy!";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());

    char[][] board = {{'1', '2', '3'},
                      {'4', '5', '6'},
                      {'7', '8', '9'}};
  while(true){
   printBoard(board);

    Scanner scanner = new Scanner(System.in);
 
    playerChoice(board, scanner);
    playerChoiceTwo(board, scanner);
  }

  }
   
  private static void printBoard(char[][] board) {
    System.out.println(" ");
    System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2] );
    System.out.println("-+-+-");
    System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2] );
    System.out.println("-+-+-");
    System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2] );
    System.out.println(" ");
  }

  private static boolean playerChoice(char[][] board){
    if ((board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') ||
        (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') ||
        (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') ||

        (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') ||
        (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') ||
        (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') ||

        (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') ||
        (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') ) {
      return true;
  }
  return true;
  }

  private static boolean playerChoiceTwo(char[][] board){
    if ((board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') ||
        (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') ||
        (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O') ||

        (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O') ||
        (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O') ||
        (board[0][2] == '0' && board[1][2] == 'O' && board[2][2] == 'O') ||

        (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') ||
        (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') ) {
      return true;
  }
  return true;
  }


  private static void playerChoice(char[][] board, Scanner scan) {
    
    System.out.println("What is your move? ");

    int selectedMove = scan.nextInt();
    if(selectedMove < 0 || selectedMove > 9){
      System.out.println("That is not a valid move! Try again.");
    }
    
    switch(selectedMove) {
      case 1:
          board[0][0] = 'X';
          break;
        case 2: 
          board[0][1] = 'X';
          break;
        case 3: 
          board[0][2] = 'X';
          break;
        case 4: 
          board[1][0] = 'X';
          break;
        case 5: 
          board[1][1] = 'X';
          break;
        case 6: 
          board[1][2] = 'X';
          break;
        case 7: 
          board[2][0] = 'X';
          break;
        case 8: 
          board[2][1] = 'X';
          break;
        case 9: 
          board[2][2] = 'X';
          break;
        default:
            System.out.println("That is not a valid move! Try again.");   
    }
  
    printBoard(board);
  }

  private static void playerChoiceTwo(char[][] board, Scanner scan) {
    System.out.println("What is your move? ");

    int selectedMove = scan.nextInt();
    if(selectedMove < 0 || selectedMove > 9){
      System.out.println("That is not a valid move! Try again.");
    }

    switch(selectedMove) {
      case 1:
          board[0][0] = 'O';
          break;
        case 2: 
          board[0][1] = 'O';
          break;
        case 3: 
          board[0][2] = 'O';
          break;
        case 4: 
          board[1][0] = 'O';
          break;
        case 5: 
          board[1][1] = 'O';
          break;
        case 6: 
          board[1][2] = 'O';
          break;
        case 7: 
          board[2][0] = 'O';
          break;
        case 8: 
          board[2][1] = 'O';
          break;
        case 9: 
          board[2][2] = 'O';
          break;
        default:
            System.out.println("That is not a valid move! Try again.");   
    }

      printBoard(board);  
  }
  
  }
