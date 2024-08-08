package homework_04;

public class Main {
    public static void main(String[] args) {
//        Calculator calculator = new Calculator();
//        calculator.number1 = 25;
//        calculator.number2 = 37;

        Calculator calculator = new Calculator(25, 37);

          int result =calculator.getSumOfNumbers();
          int result1 = calculator.getSubtractNumbers();
          int result2 = calculator.getMultiplication();
          double result3 = calculator.getDivideNumbers();
//
        System.out.println("Выводим цифры");
        System.out.println(calculator.number1);
        System.out.println(calculator.number2);
        System.out.println("Вывести сумму:" + result);
        System.out.println("Вывести разность:" + result1);
        System.out.println("Вывести произведение:" + result2);
        System.out.println("Вывести частное:" + result3);



    }


}
