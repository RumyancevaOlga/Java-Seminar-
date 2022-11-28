// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.io.FileWriter;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

public class Task {
    public static void main (String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите количеcтво элементов массива: ");
        String N_String = iScanner.nextLine();
        int N = 0;
        // проверка ввода
        while (N == 0) {
            try {
                N = Integer.parseInt(N_String);
            } catch (Exception ex) {
                System.out.println("Ошибка ввода. Введите количеcтво элементов массива: ");
                N_String = iScanner.nextLine();
            }
        }

        int[] my_array = getArray(N);
        printArray(my_array);
        System.out.println();
        my_array = sortArray(my_array);
        printArray(my_array);
    }
    // генерация массива
    public static int[] getArray (int N) {
        int[] my_array = new int[N];
        Random r = new Random();
        for (int i = 0; i < my_array.length; i++) {
            my_array[i] = r.nextInt(1, 99);
        }
        return my_array;
    }
    // вывод массива в терминал
    public static void printArray (int[] my_array) {
        for (int i = 0; i < my_array.length; i++) {
            System.out.printf("%d ", my_array[i]);
        }
    }
    // сортировка пузырьком
    public static int[] sortArray (int[] my_array) {
        for (int i = 0; i < my_array.length; i++) {
            for (int j = 0; j < my_array.length - 1; j++) {
                if (my_array[j] > my_array[j + 1])
                {
                    int temp = my_array[j];
                    my_array[j] = my_array[j + 1];
                    my_array[j + 1] = temp;
                }
                logger(my_array);
            }
        }
        return my_array;
    }
    // логгер
    public static void logger (int[] my_array) {
        StringBuilder arr = new StringBuilder();
        for (int i = 0; i < my_array.length; i++) {
            arr.append(my_array[i]);
            arr.append(" ");
        }
        try {
            FileWriter log = new FileWriter("log.txt", true);
            log.write(LocalDateTime.now() + " " + arr + "\n");
            log.flush();
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}
