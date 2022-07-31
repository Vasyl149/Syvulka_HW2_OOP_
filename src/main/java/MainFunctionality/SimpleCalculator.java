package MainFunctionality;

public class SimpleCalculator implements Calculator {
    private int number1, number2;
    private char operator;
    private float result;

    public SimpleCalculator(int number1, char operator, int number2) {
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator;

    }

    @Override
    public float calculate() {
        switch (operator) {
            case '+':
                result = (float) number1 + number2;
                break;
            case '-':
                result = (float) number1 - number2;
                break;
            case '*':
                result = (float) number1 * number2;
                break;
            case '/':
                result = (float) number1 / number2;
                break;
            default:
                System.out.println("Incorrect operator input!");
        }
        return result;

    }

}
