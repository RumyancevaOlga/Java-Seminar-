// Задан целочисленный список ArrayList. Найти минимальное, максимальное и 
// среднее из этого списка.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task3 {
    public static void main (String[] args) {
        Random rnd = new Random();
        int N = rnd.nextInt(4, 10);
        ArrayList <Integer> intList = IntList(N);
        System.out.println(intList);
        int[] numbers = Numbers(intList);
        // нахождение среднего арифметического
        float avg = 0;
        for (int i = 0; i < intList.size(); i++) {
            avg += intList.get(i);
        }
        avg = avg / intList.size();
        System.out.printf("Максимальное значение: %d, минимальное значение: %d, среднее значение: %d, среднее арифметическое всех элементов: %.2f", numbers[0], numbers[1], numbers[2], avg);
        
    }
    // метод создания списка
    public static ArrayList <Integer> IntList (int N) {
        ArrayList <Integer> intList = new ArrayList <Integer> ();
        Random rnd = new Random();
        int i = 0;
        while (i < N) {
            intList.add(rnd.nextInt(-50, 50));
            i = i + 1;
        }
        return intList;
    }
    // метод поиска максимального, минимального и среднего значений
    public static int[] Numbers (ArrayList <Integer> intList) {
        int[] numbers = new int [4];
        Collections.sort(intList); // сортировка для нахождения минимального и максимального значений
        numbers[1] = intList.get(0);
        numbers[0] = intList.get(intList.size()-1);
        int middle = (numbers[0] + numbers[1]) / 2; // находим общее среднее значение на отрезке от минимума до максимума
        int[] count = new int [intList.size()];
        for (int i = 0; i < intList.size(); i++) { // высчитываем с помощью счетчика элемент, который ближе всего к среднему значению
            if (intList.get(i) > middle) {
                while (intList.get(i) != middle) {
                    middle++;
                    count[i]++;
                }
            }
            else {
                while (intList.get(i) != middle) {
                    middle--;
                    count[i]++;
                }
            }
            middle = (numbers[0] + numbers[1]) / 2;
        }
        int indexMin = 0;
        for (int i = 1; i < count.length; i++) { // находим индекс этого элемента
            
            if (count[i] < count[indexMin]) {
                indexMin = i;
            }
        }
        numbers[2] = intList.get(indexMin); 
        return numbers;
    }
}
