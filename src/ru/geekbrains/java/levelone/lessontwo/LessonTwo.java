package ru.geekbrains.java.levelone.lessontwo;

public class LessonTwo {
    public static void main(String[] args) {
        invertArray();
        System.out.println();
        fillArr();
        System.out.println();
        multiplyarr();
        System.out.println();
        diagonalArr();
        System.out.println();
        maxMinArr();
        System.out.println();
    }
        /*
        5. Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
         */
    private static void maxMinArr() {
    }

    /*
    4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое) 
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
     */
    private static void diagonalArr() {
        int[][] arr = new int[5][5];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[j].length; j++) {
                
                
            }
            
        }
    }

    /*
    3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    private static void multiplyarr() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 6){
                arr[i] *= 2;
            }
            System.out.print(arr[i]);
        }
    }

    /*
    2. Задать пустой целочисленный массив размером 8.
     С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
     */
    private static void fillArr() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {


        }
    }
        /*
        1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
         */
    private static void invertArray() {
        int[] arr = {1,1,0,0,1,0,1,1,0,0};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i]);
        }
    }
}
