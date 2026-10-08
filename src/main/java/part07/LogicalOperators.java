package part07;
import java.util.Scanner;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4843s
//        logical operators start at about 80:43 — stop at about 87:47
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 07 — the logical operators: && (and), || (or), ! (not)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called LogicalOperators.
//    Leave the "package part07;" line and the "public class LogicalOperators" line alone.
//    The import line goes BETWEEN them (the guide shows where).
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class LogicalOperators {
    public static void main(String[] args) {
        int temp = 25;
        //creates a int variable named temp and assigns it the value
        if (temp > 30) {
            //creates a if statement with a condition that temp is more than 30
            System.out.println("It is hot outside!");
            //prints the statement
        } else if (temp >= 20 && temp <= 30) {
            //adds 2 conditions only true when both are true
            System.out.println("It is warm outside!");
            //prints the statement
        } else {
            //prints the line if all other conditions are false
            System.out.println("It is cold outside!");
            //prints the statement
        }

        Scanner scanner = new Scanner(System.in);
        //creates a new scanner
        System.out.println("You are playing a game! Press q or Q to quit");
        //prints the statement
        String response = scanner.next();
        //assigns the input to the string variable

        if (!response.equals("q") && !response.equals("Q")) {
            //creates a if statement with 2 conditions only true when both are true
            System.out.println("You quit the game");
            //prints the statement
        } else {
            //prints the line if all other conditions are false
            System.out.println("You are still playing the game *pew pew*");
            //prints the statement
        }
    }

}
