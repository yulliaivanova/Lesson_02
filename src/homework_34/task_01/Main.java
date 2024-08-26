package homework_34.task_01;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

        //Task 1
        //Получить и вывести на экран:
        //текущую дату
        //текущий год, месяц и день
        //Создать дату, например Ваш день рождения и вывести на экран
        //Создать две даты и проверить на равенство
        //Получить и вывести на экран:
        //текущее время
        //текущее время + 3 часа
        //Создать дату:
        //которая на неделю позже сегодняшней
        //которая была на год раньше сегодняшней используя метод minus
        //которая на год позже сегодняшней
        //tomorrow и yesterday и проверить находятся ли они до или после сегодняшней

        LocalDate currentDate = LocalDate.now();
        System.out.println("Текущая дата: " + currentDate);
        System.out.println("Текущий год: " + currentDate.getYear());
        System.out.println("Текущий месяц: " + currentDate.getMonth());
        System.out.println("Текущий день: " + currentDate.getDayOfWeek());

        LocalDate birthdayDate = LocalDate.of(1988, Month.APRIL, 16);
        System.out.println(birthdayDate);

        LocalDate date1 = LocalDate.of(2022, Month.SEPTEMBER, 17);
        LocalDate date2 = LocalDate.of(2024, Month.AUGUST, 26);

        boolean isAfter = date1.isAfter(date2);
        System.out.println("равны ли даты между собой: " + date1.equals(date2));

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);
        System.out.println(currentTime.plusHours(3));

        LocalDate dateLaterThanToday = LocalDate.now().minusYears(1);
        // System.out.println(dateLaterThanToday);
        LocalDate dateAYearEarlierThanToday = LocalDate.now().minusYears(1);
        //System.out.println(dateAYearEarlierThanToday);
        LocalDate dateOneYearLaterThanToday = LocalDate.now().plusYears(1);

        LocalDate tomorrow = currentDate.plusDays(1);
        LocalDate yesterday = currentDate.minusDays(1);

        boolean isAfter1 = currentDate.isAfter(yesterday);
        System.out.println(isAfter1);
        boolean isAfter2 = currentDate.isBefore(tomorrow);
        System.out.println(isAfter2);


    }


}

