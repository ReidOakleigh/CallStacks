
/**************************************************************
* Name        : CallStacks
* Author      : Rumbi Chinhamhora
* Created     : 02/05/2021
* Course      : CIS 152 Data Structures
* Version     : 1.0
* OS          : Windows 10
* Copyright   : This is my own original work based on
*               specifications issued by our instructor
* Description : The program demonstrate the Call Stack, which shows 
* 				that it is a stack frames -one after the other.
* 				The top method execute last and the last execute first.
*               Input:  
*               Output: 
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or 
* unmodified. I have not given other fellow student(s) access to
* my program.         
***************************************************************/


public class callStackChinhamhora {
    public static void main( String[] args ) {
        System.out.println("In main method");
        method1();
        System.out.println("Exiting main");
    }

    private static void method1() {
        System.out.println("In method1");
        method2();
        System.out.println("Exiting method1");
    }

    private static void method2() {
        System.out.println("In method2");
        method3();
        System.out.println("Exiting method2");
    }

    private static void method3() {
        System.out.println("In method3");
        method4();
        System.out.println("Exiting method3");
    }

    private static void method4() {
        System.out.println("In method4");
        System.out.println("Exiting method4");
    }
}
