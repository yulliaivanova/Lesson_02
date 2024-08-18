package homework_19.task_01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создайте список названий фруктов и заполните его несколькими значениями (5-10 значений).
        // Создайте второй список названий фруктов и при помощи цикла заполните его только теми названиями фруктов,
        // длина которых нечётная.
        // Выведите оба списка в консоль, проконтролируйте результат.

        // 1. Создать новый массив
// 2. Добавить новые элементы
// 3. Создать второй результирующий массив
// 4. для каждого фрукта
// 5. узнать длину
// 6. получить остаток от деления
// 7. если остаток от деления 1
// 8. то добавляем в результирующий массив
// 9. вывести в консоль результат

        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Orange");

        List<String> result = new ArrayList<>();

        for (String fruit : fruits) {
            int fruitSize = fruit.length();
            int devisionResult = fruitSize % 2;
            if (devisionResult == 1) {
                result.add(fruit);

            }
        }
        System.out.println(result);
    }
}




















//
//
//        List<String> fruits = new ArrayList<>();
//        fruits.add("Apple");
//        fruits.add("Pineapple");
//        fruits.add("Peach");
//        fruits.add("Orange");
//        fruits.add("Pear");
//        fruits.add("Lemon");
//        fruits.add("Plum");
//        fruits.add("Banana");
//
//        System.out.println("Первый список фруктов: " );
//        System.out.println(fruits);
// String s = "Banana";
// s.length();
//        System.out.println(s.length());
//
//        List<String> result = new ArrayList<>();
//
//       // for (int i = 0; i < fruits.size(); i++){
//      //   if ( i % 2 == 1) {
//          //  System.out.println("Длина нечетная ");
//       // System.out.println(fruits);
//            // int i =
//        for(String fruit : fruits){
//            System.out.println(fruit.length());
//            if (fruit.length() % 2 == 1) {
//                result.add(fruit);
//
//            }
//
//        }
//        System.out.print(result);
//    }
//}


























// 1. Создать новый массив
// 2. Добавить новые элементы
// 3. Создать второй результирующий массив
// 4. для каждого фрукта
// 5. узнать длину
// 6. получить остаток от деления
// 7. если остаток от деления 1
// 8. то добавляем в результирующий массив
// 9. вывести в консоль результат






//
