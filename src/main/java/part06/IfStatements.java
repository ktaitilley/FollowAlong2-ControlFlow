package part06;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4128s
//        if statements start at about 68:48 — stop at about 74:54
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 06 — if, else if, else
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called IfStatements.
//    Leave the "package part06;" line and the "public class IfStatements" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class IfStatements {
    public static void main(String[] args) {
        int age = 75;
        //creates a int variable named age and assigns it the value 75.
        if (age == 75) {
            // creates a condition that if age is equal to 75 then do the following.
            System.out.println("OK boomer!");
            //prints the statement.
        } else if (age >= 18) {
            //creates a condition that if age is more than or equal to 18 then do the following.
            System.out.println("You are an adult!");
            //prints the statement.
        } else if (age >= 13) {
            //creates a condition that if age is more than or equal to 13 then do the following.
            System.out.println("You are a teenager!");
            //prints the statement.
        } else {
            // if no conditions are met do the following.
            System.out.println("You are not an adult!");
            //prints the statement.
        }
    }

}
