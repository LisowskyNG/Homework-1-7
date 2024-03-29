
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }
    public static void task1() {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        int sum = 0;
        int month = 0;
        while (sum < 2459000){
            sum = sum + 15000;
            month++;
            System.out.println("Месяц " +month+ " Сумма накоплений равна " +sum);
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        int i = 1;
        int j = 10;
        while (i < 11) {
            System.out.printf(i + " ");
            i++;
        }
        System.out.println();
        while (j > 0) {
            System.out.printf(j + " ");
            j--;
        }
        System.out.println();
        System.out.println();

    }

    public static void task3() {
        System.out.println("Задача 3");
        // Пишем код для задачи 3
        int population = 12000000;
        for (int i = 1; i < 2; i++) {
            int born = population / 1000 * 17;
            int death = population / 1000 * 8;
            population = population + born - death;
            System.out.println("Год " +i+ " Численность населения " +population);
//            System.out.println(born);
//            System.out.println(death);
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        // Пишем код для задачи 4

    }

    public static void task5 () {
        System.out.println("Задача 5");
        // Пишем код для задачи 5

    }

    public static void task6() {
        System.out.println("Задача 6");
        // Пишем код для задачи 6

    }

    public static void task7() {
        System.out.println("Задача 7");
        // Пишем код для задачи 7

    }
    public static void task8 () {
        System.out.println("Задача 8");
        // Пишем код для задачи 8

    }

}
