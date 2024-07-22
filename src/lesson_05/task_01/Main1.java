 package lesson_05.task_01;

public class Main1 {
    public static void main(String[] args) {

        boolean isWeekend = true;
        boolean isRain = false;


        boolean canWalk = canWalk (isWeekend,isRain);


        if (canWalk) {
            System.out.println("Можно сегодня идти гулять? Можно");
        } else {
            System.out.println("Можно сегодня идти гулять? Нельзя");
        }

    }

    public static boolean canWalk(boolean isWeekend, boolean isRain) {
        return  isWeekend && isRain;
    }

}

