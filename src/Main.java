// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Part 1
        int intOperandA = 22;
        int intOperandB = 19;
        int intSum;
        int intProduct;
        int intDifference;
        int intQuotient;
        int intModulo;

        double doubleOperandA = 3.47;
        double doubleOperandB = 2.56;
        double doubleSum;
        double doubleProduct;
        double doubleDifference;
        double doubleQuotient;

        intSum = intOperandA + intOperandB; // Assignment that uses the arithmetic operator +
        System.out.println("The sum using ints of " + intOperandA + " " + intOperandB + " is " + intSum); // Output statement

        intProduct = intOperandA * intOperandB; // Assignment that uses the arithmetic operator *
        System.out.println("The product using ints of " + intOperandA + " " + intOperandB + " is " + intProduct); // Output statement

        intDifference = intOperandA - intOperandB; // Assignment that uses the arithmetic operator -
        System.out.println("The difference using ints of " + intOperandA + " " + intOperandB + " is " + intDifference); // Output statement

        intQuotient = intOperandA / intOperandB; // Assignment that uses the arithmetic operator /
        System.out.println("The quotient using ints of " + intOperandA + " " + intOperandB + " is " + intQuotient); // Output statement

        intModulo = intOperandA % intOperandB; // Assignment that uses the arithmetic operator %
        System.out.println("The remainder using ints of " + intOperandA + " " + intOperandB + " is " + intModulo); // Output statement

        doubleSum = doubleOperandA + doubleOperandB; // Assignment that uses the arithmetic operator +
        System.out.println("The sum using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleSum); // Output statement

        doubleProduct = doubleOperandA * doubleOperandB; // Assignment that uses the arithmetic operator *
        System.out.println("The product using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleProduct); // Output statement

        doubleDifference = doubleOperandA - doubleOperandB; // Assignment that uses the arithmetic operator -
        System.out.println("The difference using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleDifference); // Output statement

        doubleQuotient = doubleOperandA / doubleOperandB; // Assignment that uses the arithmetic operator /
        System.out.println("The quotient using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleQuotient); //Output statement

        // Part 2
        int numberOfSiblings = 4;
        System.out.println("I have " + numberOfSiblings + " siblings."); // Output statement

        double myShoeSize = 11;
        System.out.println("I wear size " + myShoeSize + " shoes."); // Output statement

        String myFullName = "Benjamin Robert McKee";
        System.out.println("My full name is " + myFullName +  "."); // Output statement

        int dayOfTheWeek = 3;
        System.out.println("It is the " + dayOfTheWeek + "rd day of the week."); // Output statement

        boolean isItThursday = false;
        System.out.println("My coworker asked me earlier if it was Thursday. I told him that that was " + isItThursday + "."); // Output statement
    }
}