// Written by Sean Peng 2024/5/30 TW
// For the self learning project of the second semester in 11th grade

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


public class SudokuSolver {
    
    private static final int GRID_SIZE = 9;

    public static void main(String[] args) throws InterruptedException {

        //Input the numbers

        int divisor1 = 10;
        int divisor2 = 100;
        int divisor3 = 1000;
        int divisor4 = 10000;
        int divisor5 = 100000;
        int divisor6 = 1000000;
        int divisor7 = 10000000;
        int divisor8 = 100000000;
        int[][] GameBoard = new int[9][9];

        for(int x = 0; x <= 8; x++){
           
           
            Scanner scan = new Scanner(System.in);
            System.out.println("ENTER THE ROW");

        

            int n = scan.nextInt();

            int dividend = n;



            int FirstSquare = dividend / divisor8;

            int Secondroot = dividend / divisor7;
            int SecondSquare = Secondroot % divisor1;

            int Thirdroot = dividend % divisor7;
            int ThirdSquare = Thirdroot / divisor6;

            int Fourthroot = dividend % divisor6;
            int FourthSquare = Fourthroot / divisor5;

            int Fifthroot = dividend % divisor5;
            int FifthSquare = Fifthroot / divisor4;

            int Sixthroot = dividend % divisor4;
            int SixthSquare = Sixthroot / divisor3;

            int Seventhroot = dividend % divisor3;
            int SeventhSquare = Seventhroot / divisor2;

            int Eighthroot = dividend % divisor2;
            int EighthSquare = Eighthroot / divisor1;

            int NinethSquare = dividend % divisor1;

            int[] MyArray = new int[9];
            MyArray[0] = FirstSquare;
            MyArray[1] = SecondSquare;
            MyArray[2] = ThirdSquare;
            MyArray[3] = FourthSquare;
            MyArray[4] = FifthSquare;
            MyArray[5] = SixthSquare;
            MyArray[6] = SeventhSquare;
            MyArray[7] = EighthSquare;
            MyArray[8] = NinethSquare;

           
            
            GameBoard[x][0] = MyArray[0];
            GameBoard[x][1] = MyArray[1];
            GameBoard[x][2] = MyArray[2];
            GameBoard[x][3] = MyArray[3];
            GameBoard[x][4] = MyArray[4];
            GameBoard[x][5] = MyArray[5];
            GameBoard[x][6] = MyArray[6];
            GameBoard[x][7] = MyArray[7];
            GameBoard[x][8] = MyArray[8];

            System.out.println("Row " + (x+1) + " Completed");
        }
        
        // Printing the original board

        System.out.println("           ");
        printboard(GameBoard);
        System.out.println("           ");

        // Printing the solved board

        if (solveBoard(GameBoard)) {
            Thread.sleep(2000);
            System.out.println("Solved successfully!");
        }
        else {
            System.out.println("Unsolvable board");
        }

        printboard(GameBoard);

        // Using robot to improve the efficiency of inputting the solution in to the puzzles

        try { 
            Robot robot = new Robot();

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    
                    Thread.sleep(100);

                    if ((GameBoard[i][j])== 0){
                        robot.keyPress(KeyEvent.VK_0);
                        robot.keyRelease(KeyEvent.VK_0);
                    }
                    else if ((GameBoard[i][j])== 1){
                        robot.keyPress(KeyEvent.VK_1);
                            robot.keyRelease(KeyEvent.VK_1);
                    }
                    else if ((GameBoard[i][j])== 2){
                            robot.keyPress(KeyEvent.VK_2);
                            robot.keyRelease(KeyEvent.VK_2);
                    }
                    else if ((GameBoard[i][j])== 3){
                            robot.keyPress(KeyEvent.VK_3);
                            robot.keyRelease(KeyEvent.VK_3);
                    }
                    else  if ((GameBoard[i][j])== 4){
                        robot.keyPress(KeyEvent.VK_4);
                        robot.keyRelease(KeyEvent.VK_4);
                    }
                    else if ((GameBoard[i][j])== 5){
                        robot.keyPress(KeyEvent.VK_5);
                        robot.keyRelease(KeyEvent.VK_5);
                    }
                    else if ((GameBoard[i][j])== 6){
                        robot.keyPress(KeyEvent.VK_6);
                        robot.keyRelease(KeyEvent.VK_6);
                    }
                    else if ((GameBoard[i][j])== 7){
                        robot.keyPress(KeyEvent.VK_7);
                        robot.keyRelease(KeyEvent.VK_7);
                    }
                    else if ((GameBoard[i][j])== 8){
                        robot.keyPress(KeyEvent.VK_8);
                        robot.keyRelease(KeyEvent.VK_8);
                    }
                    else {
                    robot.keyPress(KeyEvent.VK_9);
                    robot.keyRelease(KeyEvent.VK_9);
                    }
    
                    robot.keyPress(KeyEvent.VK_RIGHT);
                    robot.keyRelease(KeyEvent.VK_RIGHT);
                }
                
                Thread.sleep(100);
                robot.keyPress(KeyEvent.VK_DOWN);
                robot.keyRelease(KeyEvent.VK_DOWN);
                robot.keyPress(KeyEvent.VK_LEFT);
                robot.keyRelease(KeyEvent.VK_LEFT);
                robot.keyPress(KeyEvent.VK_LEFT);
                robot.keyRelease(KeyEvent.VK_LEFT);
                robot.keyPress(KeyEvent.VK_LEFT);
                robot.keyRelease(KeyEvent.VK_LEFT);
                robot.keyPress(KeyEvent.VK_LEFT);
                robot.keyRelease(KeyEvent.VK_LEFT);
                robot.keyPress(KeyEvent.VK_LEFT);
                robot.keyRelease(KeyEvent.VK_LEFT);
                robot.keyPress(KeyEvent.VK_LEFT);
                robot.keyRelease(KeyEvent.VK_LEFT);
                robot.keyPress(KeyEvent.VK_LEFT);
                robot.keyRelease(KeyEvent.VK_LEFT);
                robot.keyPress(KeyEvent.VK_LEFT);
                robot.keyRelease(KeyEvent.VK_LEFT);
                Thread.sleep(100);
            }
    
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.println("More?");
            scanner.nextLine();
            scanner.close();
        } 
        catch (AWTException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        
    }
    


    // Placing the lines between each boxes

    private static void printboard(int[][] GameBoard) {
        for (int row = 0; row < GRID_SIZE; row++) {
            if (row % 3 == 0 && row != 0){
                System.out.println("-----------");
            }
            for (int column = 0; column < GRID_SIZE; column++) {
                if (column % 3 == 0 && column != 0 ){ 
                    System.out.print("|");
                }
                System.out.print(GameBoard[row][column]);
            }
            System.out.println();
        }
    }

    // Checking the rows

    private static boolean isNumberInRow(int[][] GameBoard, int number, int row) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (GameBoard[row][i] == number) {
                return true;
            }
        }
        return false;
    }
    
    // Checking the columns

    private static boolean isNumberInColumn(int[][] GameBoard, int number, int column) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (GameBoard[i][column] == number) {
                return true;
            }
        }
        return false;
    }

    // Checking the boxes

    private static boolean isNumberInBox(int[][] GameBoard, int number, int row, int column) {
        int LocalBoxRow = row - row % 3;
        int LocalBoxColumn = column - column % 3;

        for (int i = LocalBoxRow; i < LocalBoxRow + 3; i++) {
            for (int j = LocalBoxColumn; j < LocalBoxColumn+3; j++) {
                if (GameBoard[i][j] == number) {
                    return true;
                }
            }
        }
        return false;
    }

    // Final check

    private static boolean isValidPlaceement(int[][] GameBoard, int number, int row, int column){
        return !isNumberInRow(GameBoard, number, row) &&
            !isNumberInColumn(GameBoard, number, column) &&
            !isNumberInBox(GameBoard, number, row, column);
    }

    private static boolean solveBoard(int[][] GameBoard) {
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int column = 0; column < GRID_SIZE; column++){
                if (GameBoard[row][column] == 0){
                    for (int NumberToTry = 1; NumberToTry <= GRID_SIZE; NumberToTry++) {
                        if (isValidPlaceement(GameBoard, NumberToTry, row, column)) {
                            GameBoard[row][column] = NumberToTry;

                            if (solveBoard(GameBoard)) {
                                return true;
                            }
                            else {
                                GameBoard[row][column] = 0;
                            } 
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }


    
}

