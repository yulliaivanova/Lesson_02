package homework_36.task_01;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        // TODO Задача 1:
        // TODO В корне проекта вручную создайте два файла: hw_source.txt и hw_target.txt
        // TODO В файл hw_source.txt поместите фразу - This is my homework!
        // TODO Скопируйте содержимое файла hw_source.txt в файл hw_target.txt
        // TODO Используйте обычные потоки ввода/вывода (FileInputStream, FileOutputStream)

        File hw_source = new File("hw_source.txt");
        File hw_target = new File("hw_target.txt");

        try(InputStream in = new FileInputStream(hw_source);
        OutputStream out = new FileOutputStream(hw_target)) {

            int currentByte = in.read();
            while (currentByte != -1){

                out.write(currentByte);

                currentByte = in.read();

            }

        } catch (Exception e) {
            System.out.println("Ошибка! "+ e.getMessage());

        }


    }
}







