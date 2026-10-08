package part06;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4525s
//        switches start at about 75:25 — stop at about 80:18
// Guide: GUIDE.md in this folder, steps 7–11
//
// Part 06 — switch, case, break, default
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Switches.
//    Leave the "package part06;" line and the "public class Switches" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.

public class Switches {
    public static void main(String[] args) {
        String day = "Pizza";
        //creates a string variable an assigns it the value "pizza"
        switch (day) {
            // uses cases to text the value of the variable to the case.
            case "Sunday":
                //creates a case for sunday
                System.out.println("It is Sunday");
                //prints the statement
                break;
                //stops the test
            case "Monday":
                //creates a case for monday
                System.out.println("It is Monday");
                //prints the statement
                break;
                //stops the test
            case "Tuesday":
                //creates a case for tuesday
                System.out.println("It is Tuesday");
                //prints the statement
                break;
                //stops the test
            case "Wednesday":
                //creates a case for wednesday
                System.out.println("It is Wednesday");
                //prints the statement
                break;
                //stops the test
            case "Thursday":
                //creates a case for thursday
                System.out.println("It is Thursday");
                //prints the statement
                break;
                //stops the test
            case "Friday":
                //creates a case for friday
                System.out.println("It is Friday");
                //prints the statement
                break;
                //stops the test
            case "Saturday":
                //creates a case for saturday
                System.out.println("It is Saturday");
                //prints the statement
                break;
                //stops the test
            default:
                // the default case if no other cases pass
                System.out.println(day + " is not a day");
                //prints the statement
        }


    }

}
