import java.util.Locale;
import java.util.Scanner;

public class BasicCalculator {

    public void equalsTo(){
        //Created a variable from a Scanner so we can us it
        Scanner calc = new Scanner(System.in).useLocale(Locale.US); //Parameters locale − A string specifying the locale to use Return Value This method returns this scanner
        //Three variables that are numbers
        double fnum, snum, answer;
        //Whatever I typed in the keyboard to be stored in the first number
        System.out.println("Enter first num: ");
        fnum = calc.nextDouble();

        //Whatever I typed in the keyboard to be stored in the second number
        System.out.println("Enter second num: ");
        snum = calc.nextDouble(); //whatever the input is, is stored in snum

        //whatever the input is, it gets added into that
        answer = fnum + snum;
        System.out.println(answer);
    }
}
