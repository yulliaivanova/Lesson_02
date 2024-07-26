package lesson_07.task_02;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // Задача: Игра в кости. Есть две обычные игральные кости
        // от 0 до 6 на гранях. Программа должна делать следующее
        // 1.Производится бросок костей , т.е. случайным образом ,
        // какое число выпало на каждой кости
        // 2. Выводится в консоль , какие значения выпали на костях
        // 3. При этом если выпал дубль , дополнительно выводится в консоль
        // фраза "Дубль!"
        // 4. Если на костях выпало 3 и 5, игра прекращается и выводится фраза "Конец игры"


        Random random = new Random();
        int dice1;
        int dice2;
        boolean throwOfDice = true;

        while (throwOfDice) {
            dice1 = random.nextInt(1, 7);
            dice2 = random.nextInt(1, 7);
            System.out.println("Вывести значения выпавшего результата");
            System.out.println(dice1 + " и " + dice2);

            if (dice1 == dice2){
                System.out.println("Дубль");
            }
            if ( (dice1 == 3 && dice1 == 5) || (dice2 == 3 && dice2 == 5)){

                System.out.println("Конец игры");
            }

        }
    }
}
