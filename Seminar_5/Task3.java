// Взять набор строк, например,Мороз и солнце день чудесный Еще ты дремлешь друг 
// прелестный Пора красавица проснись.
// Написать метод, который отсортирует эти строки по длине с помощью TreeMap. Строки 
// с одинаковой длиной не должны “потеряться”.


package Seminar_5;

import java.util.TreeMap;

public class Task3 {
    public static void main(String[] args) {
        SortMap();
    }
    public static void SortMap () {
        String s = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
        TreeMap <Integer, String> list = new TreeMap<>();
        String[] sMas = s.split(" ");
        for (int i = 0; i < sMas.length; i++) {
            int a = sMas[i].length();
            if (list.containsKey(a)) {
                String b = list.get(a);
                list.put(a, b + " " + sMas[i]);
            } else {
                list.put(a, sMas[i]);
            }
        }
        for (var el : list.entrySet()) {
            System.out.print(el.getKey() + " " + el.getValue() + "\n");
        }
    }
}
