package ru.geekbrains.java.levelone.lessonsix;

public class Dog extends Animal {
    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void toRun(int distance) {
        maxRun = 500;
        if (distance >= maxRun) {
            System.out.println("Собака не пробежит " + distance + " метров");
        } else {
            System.out.println("Собака " + name + " пробежит " + distance + " метров");

        }
    }

    @Override
    public void toSwim(int distance) {
        maxSwim = 500;
        if (distance >= maxSwim) {
            System.out.println("Собака не пробежит " + distance + " метров");
        } else {
            System.out.println("Собака " + name + " пробежит " + distance + " метров");

        }

    }
}
