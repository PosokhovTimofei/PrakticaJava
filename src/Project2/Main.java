package src.Project2;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Задание 1: Вывести на экран сумму чисел массива с помощью циклов for, while, do while.
        int[] numbers = {1, 2, 3, 4, 5};
        int sumFor = 0;
        int sumWhile = 0;
        int sumDoWhile = 0;

        // Используем цикл for
        for (int i = 0; i < numbers.length; i++) {
            sumFor += numbers[i];
        }

        // Используем цикл while
        int j = 0;
        while (j < numbers.length) {
            sumWhile += numbers[j];
            j++;
        }

        // Используем цикл do while
        int k = 0;
        do {
            sumDoWhile += numbers[k];
            k++;
        } while (k < numbers.length);

        System.out.println("Сумма чисел (for): " + sumFor);
        System.out.println("Сумма чисел (while): " + sumWhile);
        System.out.println("Сумма чисел (do while): " + sumDoWhile);

        // Задание 2: Вывести на экран аргументы командной строки в цикле for.
        System.out.println("Аргументы командной строки:");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
        }

        // Задание 3: Вывести на экран первые 10 чисел гармонического ряда.
        System.out.println("Первые 10 чисел гармонического ряда:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(1.0 / i + " ");
        }
        System.out.println();

        // Задание 4: Сгенерировать массив целых чисел случайным образом, вывести его на экран, отсортировать его и снова вывести на экран.
        int[] randomArray = generateRandomArray(10);
        System.out.println("Исходный массив: " + Arrays.toString(randomArray));
        Arrays.sort(randomArray);
        System.out.println("Отсортированный массив: " + Arrays.toString(randomArray));

        // Задание 5: Создать метод для вычисления факториала числа с помощью цикла и проверить его работу.
        int n = 5; // Здесь можно указать любое число для вычисления факториала
        long factorial = calculateFactorial(n);
        System.out.println("Факториал числа " + n + " равен " + factorial);
    }

    // Метод для генерации случайного массива целых чисел
    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // Генерируем случайные числа от 0 до 99
        }
        return array;
    }

    // Метод для вычисления факториала числа с помощью цикла
    private static long calculateFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
