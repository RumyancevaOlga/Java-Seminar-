// Расставить на шахматной доске 8 ферзей так, чтобы они не били друг друга

package Home_Work_5;

import java.util.ArrayList;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        // создаем шахматное поле
        int[][] desk = new int [8][8];
      
        // ставим рандомно первого ферзя
        // при расстановке первого рандомом есть шанс, что поле заполнится до установки последнего
        // поэтому методом тыка нашли беспроигрышный вариант, и установили начальную позицию
        // при желании можно тыкать рандом и найти еще позиции, для выполнения условия задачи
        // или перебрать вручную
        // при это программа не падает, а устанавливает значение последнего ферзя на позицию 7 7 даже если она будет бита другим ферзем или там уже стоит ферзь
        int letter = 3;
        int num = 2;
        // while(desk[letter][num] != 0) {
        //     letter = new Random().nextInt(0, 8);
        //     num = new Random().nextInt(0, 8);
        // }
        desk[letter][num] = 1;
        // запоминаем место первого ферзя
        System.out.printf("%d %d", letter, num);
        System.out.println();
        ArrayList <String> queens = new ArrayList<>();
        String que = Integer.toString(letter) + " " + Integer.toString(num);
        queens.add(que);
        // заполняем массив единицами
        desk = Desk(desk, letter, num);
        PrintArray(desk);
        // ставим второго ферзя
        String[] str = Max(desk);
        letter = Integer.parseInt(str[1]);
        num = Integer.parseInt(str[2]);
        // запоминаем место второго ферзя
        System.out.printf("%d %d", letter, num);
        System.out.println();
        que = Integer.toString(letter) + " " + Integer.toString(num);
        queens.add(que);
        // заполняем массив единицами
        desk = Desk(desk, letter, num);
        PrintArray(desk);
        // ставим третьего ферзя
        str = Max(desk);
        letter = Integer.parseInt(str[1]);
        num = Integer.parseInt(str[2]);
        // запоминаем место третьего ферзя
        System.out.printf("%d %d", letter, num);
        System.out.println();
        que = Integer.toString(letter) + " " + Integer.toString(num);
        queens.add(que);
        // заполняем массив единицами
        desk = Desk(desk, letter, num);
        PrintArray(desk);
        // ставим четвертого ферзя
        str = Max(desk);
        letter = Integer.parseInt(str[1]);
        num = Integer.parseInt(str[2]);
        // запоминаем место четвертого ферзя
        System.out.printf("%d %d", letter, num);
        System.out.println();
        que = Integer.toString(letter) + " " + Integer.toString(num);
        queens.add(que);
        // заполняем массив единицами
        desk = Desk(desk, letter, num);
        PrintArray(desk);
        // ставим пятого ферзя
        str = Max(desk);
        letter = Integer.parseInt(str[1]);
        num = Integer.parseInt(str[2]);
        // запоминаем место пятого ферзя
        System.out.printf("%d %d", letter, num);
        System.out.println();
        que = Integer.toString(letter) + " " + Integer.toString(num);
        queens.add(que);
        // заполняем массив единицами
        desk = Desk(desk, letter, num);
        PrintArray(desk);
        // ставим шестого ферзя
        str = Max(desk);
        letter = Integer.parseInt(str[1]);
        num = Integer.parseInt(str[2]);
        // запоминаем место шестого ферзя
        System.out.printf("%d %d", letter, num);
        System.out.println();
        que = Integer.toString(letter) + " " + Integer.toString(num);
        queens.add(que);
        // заполняем массив единицами
        desk = Desk(desk, letter, num);
        PrintArray(desk);
        // ставим седьмого ферзя
        str = Max(desk);
        letter = Integer.parseInt(str[1]);
        num = Integer.parseInt(str[2]);
        // запоминаем место седьмого ферзя
        System.out.printf("%d %d", letter, num);
        System.out.println();
        que = Integer.toString(letter) + " " + Integer.toString(num);
        queens.add(que);
        // заполняем массив единицами
        desk = Desk(desk, letter, num);
        PrintArray(desk);
        // ставим восьмого ферзя
        str = Max(desk);
        letter = Integer.parseInt(str[1]);
        num = Integer.parseInt(str[2]);
        // запоминаем место восьмого ферзя
        System.out.printf("%d %d", letter, num);
        System.out.println();
        que = Integer.toString(letter) + " " + Integer.toString(num);
        queens.add(que);
        // заполняем массив единицами
        desk = Desk(desk, letter, num);
        PrintArray(desk);
        // выводим позиции ферзей
        System.out.println(queens);
    }
    // создаем метод заполнения массива единицами, по постановке ферзя
    public static int[][] Desk (int[][]desk, int letter, int num) {
        for (int i = 0; i < desk[0].length; i++) {
            desk[i][num] = 1;
        }
        for (int i = 0; i < desk[1].length; i++) {
            desk[letter][i] = 1;
        }
        int letter1 = letter;
        int num1 = num;
        while (letter1 > 0 && num1 > 0) {
            letter1--;
            num1--;
        }
        int i = letter1;
        int j = num1;
        while (i < letter || j < num) {
            desk[i][j] = 1;
            i++;
            j++;
        }
    
        letter1 = letter;
        num1 = num;
        while (letter1 < 7 && num1 < 7) {
            letter1++;
            num1++;
        }
        i = letter1;
        j = num1;
        while (i > letter || j > num) {
            desk[i][j] = 1;
            i--;
            j--;
        }

        letter1 = letter;
        num1 = num;
        while (letter1 < 7 && num1 > 0) {
            letter1++;
            num1--;
        }
        i = letter1;
        j = num1;
        while (i > letter || j < num) {
            desk[i][j] = 1;
            i--;
            j++;
        }
        
        letter1 = letter;
        num1 = num;
        while (letter1 < 7 && num1 < 7) {
            letter1++;
            num1++;
        }
        i = letter1;
        j = num1;
        while (i > letter || j > num) {
            desk[i][j] = 1;
            i--;
            j--;
        }

        letter1 = letter;
        num1 = num;
        while (letter1 > 0 && num1 < 7) {
            letter1--;
            num1++;
        }
        i = letter1;
        j = num1;
        while (i < letter || j > num) {
            desk[i][j] = 1;
            i++;
            j--;
        }

        return desk;
    }
    //метод печати двумерного массива
    public static void PrintArray (int[][] array) {
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array[1].length; j++) {
                System.out.printf("%d ", array[i][j]);
            }
            System.out.println();
        }
    }

    //метод подсчета нулей
    public static int Null (int[][] array) {
        int count = 0;
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array[1].length; j++) {
                if (array[i][j] == 0) {
                    count++;
                }
            }
        }
        return count;
    }
    //метод нахождения индексов для максимального количества нулей
    public static String[] Max (int[][] desk) {
        int[][] desk1 = new int [8][8];
        int letter = 0;
        int num = 0;
        ArrayList <String> nullOne = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < desk[0].length; i++) {
            for (int j = 0; j < desk[1].length; j++) {
                desk1[i][j] = desk[i][j];
            }
        }
        for (int i = 0; i < desk1[0].length; i++) {
            for (int j = 0; j < desk1[1].length; j++) {
                if(desk1[i][j] == 0) {
                    letter = i;
                    num = j;
                    desk1 = Desk(desk1, letter, num);
                    count = Null(desk1);
                    desk1 = new int [8][8];
                    for (int i1 = 0; i1 < desk[0].length; i1++) {
                        for (int j1 = 0; j1 < desk[1].length; j1++) {
                            desk1[i1][j1] = desk[i1][j1];
                        }
                    }
                }
                nullOne.add(count + " " + i + " " + j);
                count = 0;
            }
        }
        String[] str = nullOne.get(0).split(" ");
        int max = Integer.parseInt(str[0]);
        letter = Integer.parseInt(str[1]);
        num = Integer.parseInt(str[2]);
        for (int i = 0; i < nullOne.size(); i++) {
            str = nullOne.get(i).split(" ");
            int b = Integer.parseInt(str[0]);
            if (max < b) {
                max = b;
                letter = Integer.parseInt(str[1]);
                num = Integer.parseInt(str[2]);
            }
        }
        if (max > 0) {
            str[0] = Integer.toString(max);
            str[1] = Integer.toString(letter);
            str[2] = Integer.toString(num);
        } else {
            for (int i = 0; i < desk1[0].length; i++) {
                for (int j = 0; j < desk1[1].length; j++) {
                    if(desk1[i][j] == 0) {
                        str[0] = Integer.toString(max);
                        str[1] = Integer.toString(i);
                        str[2] = Integer.toString(j);
                    }
                }
            }
        }

        System.out.println(nullOne);

        return str;
    }
}
