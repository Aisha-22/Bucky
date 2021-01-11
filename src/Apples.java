//A class is a blue print for creating code, its used as a template for objects, also describes object behavior, and defines object properties including a valid range of value, such as Properties and methods
/*
        Creating an Object:
        Class provides the blueprints for objects. So basically, an object is created from a class. In Java, the new keyword is used to create new objects.
        Example - Declaration Instantiation Instantiation
         */
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
//        basiccalculator.equalsTo();

//Math Operators
        MathOperators operate = new MathOperators();
//        operate.calc();

//If Statements
        IfStatement statement = new IfStatement();
//        statement.check();

        //My playground
        playground playground1 = new playground();
//        playground1.runArray();

        //Logical Operators
        LogicalOperators logicaloperators = new LogicalOperators();
//        logicaloperators.testOperators();

        //Array element counter (Random number)
        RandomDice dice = new RandomDice();
        dice.rollDice();
    }
}
