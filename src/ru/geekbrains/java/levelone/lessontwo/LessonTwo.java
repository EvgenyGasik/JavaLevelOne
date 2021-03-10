package ru.geekbrains.java.levelone.lessontwo;

import java.util.Arrays;

public class LessonTwo {
    public static void main(String[] args) {
       // invertArray();
       // System.out.println();
       // fillArr();
       // System.out.println();
       // multiplyarr();
       // System.out.println();
       // diagonalArr();
       // System.out.println();
       //maxMinArr();
       // System.out.println();
       // chekBalance();
        displaceArr(1);
        
    }
        /*
        7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
        при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
        Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
         При каком n в какую сторону сдвиг можете выбирать сами.
         */
  private static void displaceArr(int shift) {
        int[] arr = {1,2,3,4};
        for (int i = 0; i < arr.length; i++) {

            }
      }




    /*
    6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
     метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
     Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
     граница показана символами ||, эти символы в массив не входят
     */
        private static void chekBalance() {
        int[] arr = {2, 2, 2, 1, 2, 2, 10, 1};
    }

    /*
    5. Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
     */
    private static void maxMinArr() {
        int[] arr = {2,3,5,2,7,8,12,45};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (min > arr[i]){
                min = arr[i];
            } if (max < arr[i]){
                max = arr[i];
            }

        }
        System.out.println(min + " " + max);
    }

    /*
    4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое) 
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
     */
    private static void diagonalArr() {
        int[][] arr = new int[5][5];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if( i == j || j == arr[i].length -1 - i){
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j]);
            }
            System.out.println();
            
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

               arr[i] = i*3;

            System.out.print(arr[i] + " ");
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
