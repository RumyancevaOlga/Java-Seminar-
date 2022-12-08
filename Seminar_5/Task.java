// Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов
// Вывести данные по сотрудникам с фамилией Иванов.


package Seminar_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Map <Integer, String> list = new HashMap<>();
        System.setProperty("console.encoding", "UTF-8");
        System.out.println(System.getProperty("console.encoding"));
        Scanner iScanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Введите номер пастпорта и фамилию ");
            String s = iScanner.nextLine();
            String[] sMas = s.split(" ");
            list.put(Integer.parseInt(sMas[0]), sMas[1]);
        }
        for (var el : list.entrySet()) {
            System.out.print(el.getKey() + " " + el.getValue() + "\n");
        }
        System.out.println();
        for (var el : list.entrySet()) {
            if(el.getValue().equals("Иванов")) {
                System.out.print(el.getKey() + " " + el.getValue() + "\n");
            }
        }
        iScanner.close();
    }
}
