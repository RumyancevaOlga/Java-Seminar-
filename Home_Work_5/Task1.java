// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов

package Home_Work_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class Task1 {
    public static void main (String[] args) {
        String[] str = {"Иванов 12345", "Иванов 54321", "Петров 45678", "Сидоров 78456", "Петров 13459"};
        ArrayList <String> subscribers = new ArrayList<>(Arrays.asList(str));
        HashMap <String, ArrayList<Integer>> telephone = new HashMap<>();
        for (int i = 0; i < subscribers.size(); i++) {
            String[] subscriber = subscribers.get(i).split(" ");
            String key = subscriber[0];
            int value = Integer.parseInt(subscriber[1]);
            ArrayList <Integer> number = new ArrayList<>();
            number.add(value);
            if (telephone.containsKey(key)) {
                number.add(value);
                telephone.put(key, number);
            } else {
                telephone.put(key, number);
            }
        }
        System.out.println(telephone);
    }
}
