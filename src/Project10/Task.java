package src.Project10;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        int choice;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\nВыберите задание:");
            System.out.println("1 - Вывести члены последовательности с нечетными номерами.");
            System.out.println("2 - Цифры числа слева направо.");
            System.out.println("3 - Цифры числа справа налево.");
            System.out.println("0 - Выйти из программы.");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    chetChlenPos();
                    break;
                case 2:
                    System.out.println("Введите число: ");
                    int x = scanner.nextInt();
                    fromLeftToRight(x);
                    break;
                case 3:
                    System.out.println("Введите число: ");
                    int y = scanner.nextInt();
                    fromRightToLeft(y);
                    break;
                case 0:
                    System.out.println("Программа завершена.");
                    break;
                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
                    break;
            }
        } while (choice != 0);
    }

    // Остальной код вашей программы

    public static void chetChlenPos() {
        // 13. Вывести члены последовательности с нечетными номерами

            int tmp, count = 0;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите числа массива");
            while (true){
                tmp = scanner.nextInt();

                if (tmp == 0) {
                    break;
                }
                if (count % 2 == 0){
                    System.out.print(tmp+" ");
                }

                count ++;
            }
        }


    public static void fromLeftToRight(int x) {
        if (x >= 10){
            fromLeftToRight(x / 10);
        }
        System.out.print(x % 10 + " ");
    }

    public static void fromRightToLeft(int x) {
        if (x > 0) {
            System.out.print(x % 10 + " ");
            fromRightToLeft(x / 10);
        }
    }
}

