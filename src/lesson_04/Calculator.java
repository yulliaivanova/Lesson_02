package lesson_04;

public class Calculator {


    int number1;
    int number2;

    public Calculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;

    }

    public int getSumOfNumbers() {
        int result = number1 + number2;
        return result;
    }

    public int getSubtractNumbers() {
        int result1= number1 - number2;
        return result1;
    }
    public int getMultiplication () {
        int result2 = number1 * number2;
        return result2;
    }
    public  double getDivideNumbers () {
        double result3 = number2 / number1;
        return  result3;
    }


}
