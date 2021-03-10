package ru.geekbrains.java.levelone.lessonsix;

public class LessonSixApp {
    public static void main(String[] args) {
        Animal animals[] = {
                new Cat("Barsik"),
                new Dog("Bobik"),
                new Dog ("Sharik"),
                new Cat("Tom")
        };
        for (int i = 0; i < animals.length; i++) {
            animals[i].toRun(400);
            animals[i].toSwim( 5);

        }
    }

}
