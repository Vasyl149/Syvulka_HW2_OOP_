import Console.ReadConsole;
import MainFunctionality.SimpleCalculator;

public class Main {
    public static void main(String[] args) {

        ReadConsole readConsole = new ReadConsole();

        SimpleCalculator simpleCalculator = new SimpleCalculator(
                readConsole.getInt(),
                readConsole.getOperator(),
                readConsole.getInt()
                );

        System.out.println("Result: " +simpleCalculator.calculate());


    }
}
