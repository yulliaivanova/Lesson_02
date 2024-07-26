package lesson_06.task_01;

public class Main {
    public static void main(String[] args) {
      int houseNummer = 4;
      String adressee = " Ivanov";

        String text = " Письмо доставлено в  ";
        String text1 = " Письмо не доставлено, неверный адрес ";

        switch (houseNummer){
            case 1 :
                System.out.println(text + " первый дом");
                break;
            case 2:
                System.out.println(text + " второй дом");
                break;
            case 3:
                System.out.println(text + " третий дом");
                break;
            case 4:
                System.out.println(text + " в четвертый дом семье ");

             switch (adressee) {
                 case "Ивановы":
                     System.out.println(text + " Ивановых");
                     break;
                 case "Петровы":
                     System.out.println(text + " Петровых");
                     break;
             }
                 System.out.println( adressee.length() % 2 == 0? " четное колиество символов" : "нечетное количество символов");
                 case 5:
                     System.out.println(text + " в пятый дом");
                     break;
                 default:
                     System.out.println(text1 );
                     break;
             }

        }

    }







