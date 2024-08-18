package homework_19.task_02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Создайте список чисел и заполните его несколькими значениями (5-10 значений).
        //Создайте целочисленную переменную и при помощи цикла запишите в неё сумму всех элементов списка.
        //Выведите в консоль список и значение переменной, проконтролируйте результат.

        List<Integer> numbers = List.of(5,15,8,5,3,4,7,10,2);
//        List
//        numbers.add(5);
//        numbers.add(15);
//        numbers.add(8);
//        numbers.add(5);
//        numbers.add(3);
//        numbers.add(4);
//        numbers.add(7);
//        numbers.add(10);
//        numbers.add(2);

       //  System.out.println(" ");

           int sum = 0;
        for (int i : numbers){
             sum = sum + i;
        }
        System.out.println();
        System.out.println(sum);
    }
}
