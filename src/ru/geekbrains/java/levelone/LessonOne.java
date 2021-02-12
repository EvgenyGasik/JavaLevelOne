package ru.geekbrains.java.levelone;

public class LessonOne {

    public static void main(String[] args) {
	// write your code here
        /*
        1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
        2. Создать переменные всех пройденных типов данных и инициализировать их значения.
         */
        int i = 23434;
        byte b = 21;
        short s = 23;

        long l = 2000000L;
        float f = 23.3f;
        double d = -243.34;
        char c = 'D';
        boolean bool = false;


        //System.out.println(method1(12.23f,34,45.11f,56.45f));
        //System.out.println(summ10or20(19,1));
        //positiveOrNot(5);
        System.out.println(isNegtive(-5));
        //printName("Evgeny");
        //whatYear(2021);







    }

    private static void whatYear(int i) {

        if ((!(i % 4 == 0) || ((i % 100 == 0) && !(i % 400 == 0)))){
            System.out.println(i + " Ne Visokosnii");
        } else System.out.println(i + " Visokosnii");
    }



    /*
     Написать метод, которому в качестве параметра передается строка, обозначающая имя.
     Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
     */

    private static void printName(String name ) {
        System.out.println("Привет, " + name);
    }

    /*
    Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное
     */
    private static boolean isNegtive(int i) {
        return ( i < 0);
    }

    /*
    Написать метод, которому в качестве параметра передается целое число,
     метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом.
     */
    private static void positiveOrNot(int i) {
        if(i >= 0) {
            System.out.println("Positive");
        } else System.out.println("Negative");
    }

    /*
     Написать метод, принимающий на вход два целых числа и проверяющий,
      что их сумма лежит в пределах от 10 до 20 (включительно),
     если да – вернуть true, в противном случае – false.
     */

    private static boolean summ10or20(int a, int b) {

        if ((a+b) > 10 && (a + b) <= 20 ){
            return true;
        } else return false;

    }

    /*
    Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,

        где a, b, c, d – аргументы этого метода, имеющие тип float.
     */
    private static float method1(float a,float b,float c, float d) {

        return a * (b + (c / d));

    }

    }
