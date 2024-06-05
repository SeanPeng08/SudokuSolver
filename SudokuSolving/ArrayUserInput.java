import java.util.Arrays;
import java.util.Scanner;


public class ArrayUserInput {

    public static void main (String[] args) {
        
       

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

            System.out.println("Row  Completed");

        }
        
        //System.out.println(Arrays.deepToString(GameBoard));

    
    }

} 