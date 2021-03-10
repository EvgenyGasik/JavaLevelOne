package ru.geekbrains.java.levelone.lessonseven;

public class Cat {
    private String name;
    private int appetit = 15;
    private boolean full;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isFull() {
        return full;
    }

    public void toEat(Plate plate) {
        if (plate.decreaseFood(appetit)) {
            System.out.println(name + " Poel");
            full = true;
        } else {
            System.out.println(name + " Ne poel");
        }

    }
}
