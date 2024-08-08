package homework_16;

public class Main {
    public static void main(String[] args) {

        Week dayOfTheWeek = Week.SATURDAY;
        String today = "Сегодня";


        switch (dayOfTheWeek){
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY:
                System.out.println( today + " " + dayOfTheWeek.getRussianName());
                break;
            case SATURDAY, SUNDAY:
                System.out.println(" Сегодня выходной");


        }

      //  if (dayOfTheWeek.equals(Week.Saturday)|| dayOfTheWeek.equals(Week.Sunday)){
            //System.out.println(" Сегодня выходной");
        }
    }

