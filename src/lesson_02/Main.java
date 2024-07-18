package lesson_02;

public class Main {
    public static void main(String[] args) {

        Cat firstCat = new Cat();
        firstCat.age = 3;
        firstCat.weight = 2.85;


        System.out.println(" Первый кот");
        System.out.println(firstCat.age);
        System.out.println(firstCat.weight);
        System.out.println(Cat.paws);

        firstCat.mew();

        Cat secondCat = new Cat();
        secondCat.age = 5;
        secondCat.weight = 8.1;

        System.out.println("Второй кот");
        System.out.println(secondCat.age);
        System.out.println(secondCat.weight);
        System.out.println(Cat.paws);

        secondCat.mew();

        Cat thirdCat = new Cat();
        thirdCat.age = 1;
        thirdCat.weight = 0.9;

        System.out.println("Третий кот");
        System.out.println(secondCat.age);
        System.out.println(secondCat.weight);
        System.out.println(Cat.paws);

        thirdCat.mew();


    }
}
