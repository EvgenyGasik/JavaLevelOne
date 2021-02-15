package ru.geekbrains.java.levelone.lessonthree;

import java.util.Random;
import java.util.Scanner;

public class LessonThree {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Угадайте число от 0 до 9. У вас 3 попытки. Введите число: ");

            Random random = new Random();
            int compNumber = random.nextInt(10);
            //System.out.println(compNumber);
            int count = 3;
            while (count != 0) {
                int humanNumber = scanner.nextInt();

                if (compNumber == humanNumber) {
                    System.out.println("Победа");
                    break;
                }
                if (compNumber > humanNumber) {
                    count--;
                    System.out.println("Загаданное число больше. Осталось попыток - " + count);
                }
                if (compNumber < humanNumber) {
                    count--;
                    System.out.println("Загаданно число меньше. Осталось попыток - " + count);
                }
            }
            System.out.println("Хотите попробовать еще раз? 1 - да, 2 - нет");

        }while (scanner.nextInt() == 1);
    }

}
