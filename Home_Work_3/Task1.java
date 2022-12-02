// Реализовать алгоритм сортировки слиянием (НЕОБЯЗАТЕЛЬНОЕ)

package Home_Work_3;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main (String[] args) {
        Random rnd = new Random();
        int N = rnd.nextInt(4, 20);
        int[] intArray = GetArray(N);
        System.out.println("Начальный массив: ");
        PrintArray(intArray);
        System.out.println();
        System.out.println("Отсортированный массив: ");
        int[] sortArray = SortArray(intArray);
        PrintArray(sortArray);

    }
// метод создания массива
    public static int[] GetArray (int N) {
        Random rnd = new Random();
        int[] intArray = new int [N];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = rnd.nextInt(20);
        }
        return intArray;
    }
// метод печати массива
    public static void PrintArray (int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.printf("%d ", intArray[i]);
        }
    }

    public static int[] SortArray (int[] intArray) {
        // массив для сортировки
        int[] buffer1 = Arrays.copyOf(intArray, intArray.length);
        // буфер
        int[] buffer2 = new int[intArray.length];
        int[] sortArray = SortInner(buffer1, buffer2, 0, intArray.length);
        return sortArray;
    }

    public static int[] SortInner(int[] buffer1, int[] buffer2, int start, int end) {
        // условие выхода из рекурсии
        if (start >= end - 1) {
            return buffer1;
        }
        // делим массив на 2 части, каждую часть сортируем отдельно
        int middle = start + (end - start) / 2;
        // запускаем рекурсию
        int[] firstSorted = SortInner(buffer1, buffer2, start, middle);
        int[] secondSorted = SortInner(buffer1, buffer2, middle, end);
   
        // Слияние
        int firstIndex = start;
        int secondIndex = middle;
        int destIndex = start;
        int[] result = new int [1];
        if (firstSorted == buffer1) {
            result = buffer2;
        }
        else {
            result = buffer1;
        }
        // int[] result = firstSorted == buffer1 ? buffer2 : buffer1;
        // короткая запись
        while (firstIndex < middle && secondIndex < end) {
            if (firstSorted[firstIndex] < secondSorted[secondIndex]) {
                result[destIndex++] = firstSorted[firstIndex++];
            }
            else {
                result[destIndex++] = secondSorted[secondIndex++];
            }
            // result[destIndex++] = firstSorted[firstIndex] < secondSorted[secondIndex] ? firstSorted[firstIndex++] : secondSorted[secondIndex++];
            // короткая запись
        }
        while (firstIndex < middle) {
            result[destIndex++] = firstSorted[firstIndex++];
        }
        while (secondIndex < end) {
            result[destIndex++] = secondSorted[secondIndex++];
        }
        return result;
    }
}
