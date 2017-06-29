package syntaxerror.airthlibrary.app;

/**
 * Created by sys5 on 6/28/2017.
 */

public class FuncArithmetic {
    public static String addNumbers(int numberFirst, int secondNumber) {
        int total = 0;
        try {
            total = numberFirst + secondNumber;
        } catch (Exception e) {
        }
        return String.valueOf(total);
    }
}
