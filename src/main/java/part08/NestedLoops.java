package part08;
import java.util.Scanner;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5836s
//        starts at 1:37:16 — stop at about 1:42:48, at "well ladies and gentlemen"
// Guide: GUIDE.md in this folder, steps 6–10
//
// Part 08 — nested loops (a loop inside another loop)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called NestedLoops.
//    Leave the "package part08;" line and the class line alone. Type everything else.
//    When you type Scanner, IntelliJ will want an import. See the README.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class NestedLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //creates a new scanner
        int rows;
        //creates a int veriable named rows
        int columns;
        //creates a int veriable named  columns
        String symbol = "";
        //creates a string veriable named symbol and assigns it to the value
        System.out.println("Enter number of rows:");
        //prints the statement
        rows = scanner.nextInt();
        // assigns the int inout to rows
        System.out.println("Enter number of columns:");
        //prints the statement
        columns = scanner.nextInt();
        //assigns the int inout to columns
        System.out.println("Enter symbol to use:");
        //prints the statement
        symbol = scanner.next();
        //assigns the string inout to symbol
        for (int i = 1; i <= rows; i++) {
            // creates a for loop starting at 1
            System.out.println();
            //prints the statement
            for (int j = 1; j <= columns; j++) {
                //creates a for loop starting at 1 that loops as long as the condions are met for the loop before it.
                System.out.print(symbol);
                //prints the statement
            }
        }
    }

}
