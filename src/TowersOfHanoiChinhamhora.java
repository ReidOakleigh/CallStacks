import java.util.Scanner;

/**************************************************************
* Name        : TowerOfHanoi
* Author      : Rumbi Chinhamhora 
* Created     : 02/09/2021
* Course      : CIS 152 Data Structures
* Version     : 1.0
* OS          : Windows 10
* Copyright   : This is my own original work based on
*               specifications issued by our instructor
* Description : See Below
*               Input: The Number of Disks 
*               Output: Print the Number of moves it takes to 
move from source to destination
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or 
* unmodified. I have not given other fellow student(s) access to
* my program.         
***************************************************************/

public class TowersOfHanoiChinhamhora {
    /*
    * Recursion - definition: see Recursion. Recursion is the action of a function calling itself.
    */
    static long moves = 0;

    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number of disks: ");
        int disks = in.nextInt();
        moveTower(disks, 'A', 'B', 'C');
        System.out.printf("%d disks requires %,d moves", disks, moves);
        
    }
    /*
    * This recursive method moves one disk at a time from one peg to another being careful to not
    * place a larger disk onto a smaller disk. If first moves the stack of disks from the source(A)
    * peg to the destination(C) peg using the B peg as the spare peg and then moves the stack back
    * from the source(C) to the destination(B) peg using the A peg as the spare peg.
    */
    private static void moveTower(int disk, char src, char dest, char spare) {
        if (disk != 0) {
            moveTower(disk - 1, src, spare, dest); // Move stack of disks to the spare peg
            moves++;    // move disk from src to dest
            moveTower(disk - 1, spare, dest, src); // Move stack of disks back to dest. peg
        }
    }
}
