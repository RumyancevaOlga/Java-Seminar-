// Пусть дан произвольный список целых чисел, удалить из него четные числа

package Home_Work_3;

import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    public static void main (String[] args) {
        Random rnd = new Random();
        int N = rnd.nextInt(4, 20);
        ArrayList <Integer> intList = IntList(N);
        System.out.println(intList);
        intList = RemoveList(intList);
        System.out.println(intList);
    }
    // метод создания списка
    public static ArrayList <Integer> IntList (int N) {
        ArrayList <Integer> intList = new ArrayList <Integer> ();
        Random rnd = new Random();
        int i = 0;
        while (i < N) {
            intList.add(rnd.nextInt(100));
            i = i + 1;
        }
        return intList;
    }
    // метод удаления из списка четных чисел
    public static ArrayList <Integer> RemoveList (ArrayList <Integer> intList) {
        for (int i = 0; i < intList.size(); i++) {
            if(intList.get(i) % 2 == 0) {
                intList.remove(i);
                i--;
            }
        }
        return intList;
    }
}
