package homework_19.task_01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создайте список названий фруктов и заполните его несколькими значениями (5-10 значений).
        // Создайте второй список названий фруктов и при помощи цикла заполните его только теми названиями фруктов,
        // длина которых нечётная.
        // Выведите оба списка в консоль, проконтролируйте результат.

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Peach");
        fruits.add("Orange");
        fruits.add("Pear");
        fruits.add("Lemon");
        fruits.add("Plum");
        fruits.add("Banana");

        System.out.println("Первый список фруктов: " );
        System.out.println(fruits);


        List<String> result = new ArrayList<>();
        for (int i = 0; i < fruits.size(); i++){
        if ( i % 2 == 1) {
            System.out.println("Длина нечетная ");
        }
            System.out.println(fruits);
        }

    }
}
