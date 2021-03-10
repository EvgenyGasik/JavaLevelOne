package ru.geekbrains.java.levelone.lessonsix;

public abstract class Animal {
    String name;
    int maxRun = 0;
    int maxSwim = 0;


    public abstract void toRun(int distance);
    public abstract void toSwim(int distance);



}
