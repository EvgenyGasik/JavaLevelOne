package ru.geekbrains.java.levelone.lessonseven;

public class CatPlateApp {
    public static void main(String[] args) {
        Plate plate = new Plate(30);
        Cat[] cats = new Cat[]{
                new Cat("Tom"),
                new Cat("BArsik"),
                new Cat("Myrka")
        };
        for (Cat cat : cats) {
            cat.toEat(plate);
            if (cat.isFull()){
                System.out.println(cat.getName() + " Is full");
            }else {
                System.out.println(cat.getName() + " Is not Full");
            }

        }
        plate.addFood(40);

    }
}
