package Homework_15;

public class Main {
    public static void main(String[] args) {

        Week dayOfTheWeek = Week.Thursday;
        String today = "Сегодня";


        switch (dayOfTheWeek){
            case Monday :
                System.out.println( today + dayOfTheWeek.getRussianName());
                break;
            case Tuesday:
                System.out.println( today + dayOfTheWeek.getRussianName());
                break;
            case Wednesday:
                System.out.println( today + " " + dayOfTheWeek.getRussianName());
                break;
            case Thursday:
                System.out.println(today + " " + dayOfTheWeek.getRussianName());
                break;
            case Friday:
                System.out.println(today + " " + dayOfTheWeek);

        }

        if (dayOfTheWeek.equals(Week.Saturday)|| dayOfTheWeek.equals(Week.Sunday)){
            System.out.println(" Сегодня выходной");
        }
    }
}
