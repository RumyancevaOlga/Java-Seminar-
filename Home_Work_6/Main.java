// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.

package Home_Work_6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Set <Notebook> note = new HashSet<>();
        Random rnd = new Random();

        Notebook note1 = new Notebook(brand(rnd.nextInt(0, 6)));
        note1.setButtery(buttery(rnd.nextInt(0, 3)));
        note1.setDiagonal(diagonal(rnd.nextInt(0, 8)));
        note1.setMemoryCapacity(memoryCapasity(rnd.nextInt(0, 5)));
        note1.setOs(os(rnd.nextInt(0, 3)));
        note1.setRum(rum(rnd.nextInt(0, 5)));
        note1.setScreenType(screenType(rnd.nextInt(0, 3)));
        note.add(note1);

        Notebook note2 = new Notebook(brand(rnd.nextInt(0, 6)));
        note2.setButtery(buttery(rnd.nextInt(0, 3)));
        note2.setDiagonal(diagonal(rnd.nextInt(0, 8)));
        note2.setMemoryCapacity(memoryCapasity(rnd.nextInt(0, 5)));
        note2.setOs(os(rnd.nextInt(0, 3)));
        note2.setRum(rum(rnd.nextInt(0, 5)));
        note2.setScreenType(screenType(rnd.nextInt(0, 3)));
        note.add(note2);

        Notebook note3 = new Notebook(brand(rnd.nextInt(0, 6)));
        note3.setButtery(buttery(rnd.nextInt(0, 3)));
        note3.setDiagonal(diagonal(rnd.nextInt(0, 8)));
        note3.setMemoryCapacity(memoryCapasity(rnd.nextInt(0, 5)));
        note3.setOs(os(rnd.nextInt(0, 3)));
        note3.setRum(rum(rnd.nextInt(0, 5)));
        note3.setScreenType(screenType(rnd.nextInt(0, 3)));
        note.add(note3);

        Notebook note4 = new Notebook(brand(rnd.nextInt(0, 6)));
        note4.setButtery(buttery(rnd.nextInt(0, 3)));
        note4.setDiagonal(diagonal(rnd.nextInt(0, 8)));
        note4.setMemoryCapacity(memoryCapasity(rnd.nextInt(0, 5)));
        note4.setOs(os(rnd.nextInt(0, 3)));
        note4.setRum(rum(rnd.nextInt(0, 5)));
        note4.setScreenType(screenType(rnd.nextInt(0, 3)));
        note.add(note4);

        Notebook note5 = new Notebook(brand(rnd.nextInt(0, 6)));
        note5.setButtery(buttery(rnd.nextInt(0, 3)));
        note5.setDiagonal(diagonal(rnd.nextInt(0, 8)));
        note5.setMemoryCapacity(memoryCapasity(rnd.nextInt(0, 5)));
        note5.setOs(os(rnd.nextInt(0, 3)));
        note5.setRum(rum(rnd.nextInt(0, 5)));
        note5.setScreenType(screenType(rnd.nextInt(0, 3)));
        note.add(note5);

        Notebook note6 = new Notebook(brand(rnd.nextInt(0, 6)));
        note6.setButtery(buttery(rnd.nextInt(0, 3)));
        note6.setDiagonal(diagonal(rnd.nextInt(0, 8)));
        note6.setMemoryCapacity(memoryCapasity(rnd.nextInt(0, 5)));
        note6.setOs(os(rnd.nextInt(0, 3)));
        note6.setRum(rum(rnd.nextInt(0, 5)));
        note6.setScreenType(screenType(rnd.nextInt(0, 3)));
        note.add(note6);

        Notebook note7 = new Notebook(brand(rnd.nextInt(0, 6)));
        note7.setButtery(buttery(rnd.nextInt(0, 3)));
        note7.setDiagonal(diagonal(rnd.nextInt(0, 8)));
        note7.setMemoryCapacity(memoryCapasity(rnd.nextInt(0, 5)));
        note7.setOs(os(rnd.nextInt(0, 3)));
        note7.setRum(rum(rnd.nextInt(0, 5)));
        note7.setScreenType(screenType(rnd.nextInt(0, 3)));
        note.add(note7);

        Notebook note8 = new Notebook(brand(rnd.nextInt(0, 6)));
        note8.setButtery(buttery(rnd.nextInt(0, 3)));
        note8.setDiagonal(diagonal(rnd.nextInt(0, 8)));
        note8.setMemoryCapacity(memoryCapasity(rnd.nextInt(0, 5)));
        note8.setOs(os(rnd.nextInt(0, 3)));
        note8.setRum(rum(rnd.nextInt(0, 5)));
        note8.setScreenType(screenType(rnd.nextInt(0, 3)));
        note.add(note8);

        Notebook note9 = new Notebook(brand(rnd.nextInt(0, 6)));
        note9.setButtery(buttery(rnd.nextInt(0, 3)));
        note9.setDiagonal(diagonal(rnd.nextInt(0, 8)));
        note9.setMemoryCapacity(memoryCapasity(rnd.nextInt(0, 5)));
        note9.setOs(os(rnd.nextInt(0, 3)));
        note9.setRum(rum(rnd.nextInt(0, 5)));
        note9.setScreenType(screenType(rnd.nextInt(0, 3)));
        note.add(note9);

        Notebook note10 = new Notebook(brand(rnd.nextInt(0, 6)));
        note10.setButtery(buttery(rnd.nextInt(0, 3)));
        note10.setDiagonal(diagonal(rnd.nextInt(0, 8)));
        note10.setMemoryCapacity(memoryCapasity(rnd.nextInt(0, 5)));
        note10.setOs(os(rnd.nextInt(0, 3)));
        note10.setRum(rum(rnd.nextInt(0, 5)));
        note10.setScreenType(screenType(rnd.nextInt(0, 3)));
        note.add(note10);

        for (Notebook item : note) {
            System.out.println(item);
        }

        filter(note);

    }
    public static float diagonal (int x) {
        float[] diagonal = new float[] {10.1f, 11.6f, 12.5f, 13.3f, 14.1f, 15.6f, 17.3f, 18.4f};
        return diagonal[x];
    }
    public static String screenType (int x) {
        String[] screen = new String[] {"TN", "VA", "IPS"};
        return screen[x];
    }
    public static int rum (int x) {
        int[] rum = new int[] {2, 4, 8, 16, 32};
        return rum[x];
    }
    public static int memoryCapasity (int x) {
        int[] memory = new int[] {128, 256, 512, 1024, 2048};
        return memory[x];
    }
    public static int buttery (int x) {
        int[] buttery = new int[] {2200, 2400, 2600};
        return buttery[x];
    }
    public static String os (int x) {
        String[] os = new String[] {"Linux", "Windows", "MacOs"};
        return os[x];
    }
    public static String brand (int x) {
        String[] brand = new String[] {"Lenovo", "HP", "Aser", "Dell", "Apple", "Asus"};
        return brand[x];
    }
    public static void filter (Set <Notebook> note) {
        System.out.println("Введите критерии фильтрации через пробел:\n" + 
                            "1 - диагональ экрана\n" +
                            "2 - тип матрицы дисплея\n" +
                            "3 - размер ОЗУ\n" +
                            "4 - объем ЖД\n" +
                            "5 - емкость аккумулятора\n" +
                            "6 - операционная система");
        Scanner iScanner = new Scanner(System.in);
        String parametr = iScanner.nextLine();
        String[] filter1 = parametr.split(" ");
        ArrayList <String> morePar = new ArrayList<>();
        for (int i = 0; i < filter1.length; i++) {
            if (Integer.parseInt(filter1[i]) == 1) {
                System.out.println("Введите минимальное значение диагонали экрана в дюймах целым числом (например, 10): ");
                String d = iScanner.nextLine();
                morePar.add(d);
            }
            if (Integer.parseInt(filter1[i]) == 2) {
                System.out.println("Выберите тип матрицы:\n" +
                                        "1 - TN\n" +
                                        "2 - VA\n" +
                                        "3 - IPS");
                String t = iScanner.nextLine();
                morePar.add(t);
            }
            if (Integer.parseInt(filter1[i]) == 3) {
                System.out.println("Введите минимальное значение оперативной памяти в Гб: ");
                String rum = iScanner.nextLine();
                morePar.add(rum);
            }
            if (Integer.parseInt(filter1[i]) == 4) {
                System.out.println("Введите минимальное значение объема ЖД в Гб: ");
                String m = iScanner.nextLine();
                morePar.add(m);
            }
            if (Integer.parseInt(filter1[i]) == 5) {
                System.out.println("Введите минимальное значение емкости аккумулятора в мА/час: ");
                String b = iScanner.nextLine();
                morePar.add(b);
            }
            if (Integer.parseInt(filter1[i]) == 6) {
                System.out.println("Выберите операционную систему:\n" +
                                        "1 - MacOs\n" +
                                        "2 - Linux\n" +
                                        "3 - Windows");
                String os = iScanner.nextLine();
                morePar.add(os);
            }
        } 
        TreeMap <Integer, Integer> par = new TreeMap<>();
        for (int i = 0; i < filter1.length; i++) {
            par.put(Integer.parseInt(filter1[i]), Integer.parseInt(morePar.get(i)));
        }
        System.out.println(par);

        int matrix = 0;
        if(par.get(2) != null) {
            matrix = par.get(2);
        }
        
        int opSys = 0;
        if (par.get(6) != null) {
            opSys = par.get(6);
        }

        float diagonal = 0;
        if (par.get(1) != null) {
            diagonal = (float)par.get(1);
        }

        int r = 0;
        if (par.get(3) != null) {
            r = par.get(3);
        }

        int mem = 0;
        if (par.get(4) != null) {
            mem = par.get(4);
        }

        int b = 0;
        if (par.get(5) != null) {
            b = par.get(5);
        }
        
        Set <Notebook> newNote = new HashSet<>();
        for (Notebook item : note) {
            if (item.getDiagonal() >= diagonal && (item.getScreenType() == matrix || matrix == 0)
            && item.getRum() >= r && item.getMemoryCapacity() >= mem
            && item.getButtery() >= b && (item.getOs() == opSys || opSys == 0)) {
                newNote.add(item); 
            }
        }
        for (Notebook item : newNote) {
            System.out.println(item);
        }
    }
}

