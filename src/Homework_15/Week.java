package Homework_15;

public enum Week {
    Monday("Понедельник"),
    Tuesday("Вторник"),
    Wednesday("Среда"),
    Thursday("Четвер"),
    Friday("Пятница"),
    Saturday("Суббота"),
    Sunday("Воскресенье");

    public String getRussianName() {
        return russianName;
    }

    private String russianName;
    Week(String russianName){
        this.russianName = russianName;

    }
}
