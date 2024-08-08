package homework_16;

public enum Week {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четвер"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    private String russianName;
    Week(String russianName){
        this.russianName = russianName;

    }

    public String getRussianName() {
        return russianName;
    }


}
