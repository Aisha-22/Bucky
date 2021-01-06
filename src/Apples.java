import java.util.Scanner; //getting the 'Scanner and telling Java you going to need it
import java.util.Locale;

public class Apples {
    //Inside that class is a 'Method'
    //Method-Header
    public static void main(String[] args) throws InterruptedException {
        //Method-Body
        System.out.println("Hello Youtube!");

//Variables:
        //Variable in Java is a PlaceHolder, you assign variable name to the 'Value'
        //Double: Has decimal point
        //Declaring a variable
        double tuna;
        //"=" assignment operator - assign a value to tuna
        //Assigning a variable value
        tuna = 5.28;
        System.out.println(tuna);

//Input from a user
        //Scanner: Input that is built into Java (Takes information that a user Types in from their keyboard and Stores it in a variable e.g import
        /*Scanner bucky = new Scanner(System.in);
        System.out.println(bucky.nextLine());
         */

//Basic Calculator
        BasicCalculator basiccalculator = new BasicCalculator();
        basiccalculator.equalsTo();

//Math Operators
        MathOperators operate = new MathOperators();
        operate.calc();

//If Statements
        IfStatement statement = new IfStatement();
        statement.check();
    }
}
