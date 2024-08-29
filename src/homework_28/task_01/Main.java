package homework_28.task_01;

import java.lang.management.ManagementPermission;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // TODO Задача 1:
        // TODO Создайте коллекцию, которая содержит пары значений Имя студента - Средний балл студента (дробные значения).
        // TODO Наполните коллекцию несколькими парами значений (от 8 до 10).
        // TODO Выведите в консоль средний балл любого из студентов.
        // TODO Измените средний балл этого же студента, а затем выведите новое значение в консоль.
        // TODO Проверьте, содержится ли в коллекции студент с любым именем на Ваш выбор.

        Map<String, Double> students = new HashMap<>();

        students.put("John", 3.5);
        students.put("Samantha", 4.1);
        students.put("Yuliia", 3.9);
        students.put("Alex", 2.8);
        students.put("Chris", 3.5);
        students.put("Anna", 4.3);
        students.put("Nika", 4.2);
        students.put("Martha", 2.7);
        students.put("Johnatan", 3.5);

        System.out.println(" Средний бал Саманта: " + students.get("Samantha"));

        students.put("Samantha", 4.3);
        System.out.println(" Средний бал Саманта: " + students.get("Samantha"));

        System.out.println("Есть ли в группе Ирина? " + students.containsKey("Irina"));


    }
}
