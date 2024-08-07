package Homework_15;

public class Main {
    public static void main(String[] args) {

        Week dayOfTheWeek = Week.Saturday;
        String today = "Сегодня";


        switch (dayOfTheWeek){
            case Monday, Tuesday, Wednesday, Thursday, Friday:
                System.out.println( today + " " + dayOfTheWeek.getRussianName());
                break;
            case Saturday, Sunday:
                System.out.println(" Сегодня выходной");


        }

      //  if (dayOfTheWeek.equals(Week.Saturday)|| dayOfTheWeek.equals(Week.Sunday)){
            //System.out.println(" Сегодня выходной");
        }
    }

