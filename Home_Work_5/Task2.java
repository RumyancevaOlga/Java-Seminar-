// Пусть дан список сотрудников (Иванов Иван). Написать программу, которая найдет и выведет повторяющие имена и количество их повторений.
// Отсортировать по убыванию популярности.

package Home_Work_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
        String[] str = {"Иванов Иван", "Сидоров Иван", "Белов Николай", "Чернов Николай", "Романов Николай", "Петров Петр"};
        ArrayList <String> staff = new ArrayList<>(Arrays.asList(str));
        TreeMap <Integer, String> names = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < staff.size(); i++) {
            String[] FIO = staff.get(i).split(" ");
            String name = FIO[1];
            int count = 0;
            for (int j = 0; j < staff.size(); j++) {
                String[] FIO1 = staff.get(j).split(" ");
                String name1 = FIO1[1];
                if (name.equals(name1)) {
                    count ++;
                }
            }
            if (!names.containsValue(name)) {
                names.put(count, name);
            }
        }
        for (var el : names.entrySet()) {
            System.out.print(el.getKey() + " " + el.getValue() + "\n");
        }
    }  
}
