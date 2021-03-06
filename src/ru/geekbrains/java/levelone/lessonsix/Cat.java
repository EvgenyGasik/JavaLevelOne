package ru.geekbrains.java.levelone.lessonsix;

public class Cat extends Animal {
    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void toRun(int distance) {
        maxRun = 200;
        if (distance >= maxRun){
            System.out.println("Кот   не пробежит " + distance + " метров");
        } else {
            System.out.println("Кот " + name  + " пробежит " + distance + " метров");
        }

    }

    @Override
    public void toSwim(int distance) {
        System.out.println(" Коты не плавают !!!");

    }
}
