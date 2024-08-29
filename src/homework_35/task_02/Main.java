package homework_35.task_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        // *** Задача 2 (необязательная, повышенной сложности, для желающих):

        // Создайте в корне проекта файл cat.txt
        // Поместите в файл следующую информацию - Hello! I am cat! My name is Jasper. I like to eat and my human named Eva.
        // Создайте поток ввода из этого файла.
        // Пропустите 36 байт информации из файла.
        // Следующие 7 байт преобразуйте в символы и выведите в консоль в одну строку.
        // Создайте второй поток ввода из этого же файла.
        // При помощи второго потока пропустите 28 байт, затем в эту же строку выведите 2 следующих символа,
        // пропустите 40 байт, и ещё 2 символа выведите в эту же строку.
        // Какая строка у Вас получилась?
        InputStream in  = null;
        try {
           in = new FileInputStream("cat.txt");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
