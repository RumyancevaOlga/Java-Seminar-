// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)



package Home_Work_1;

import java.util.Scanner;

public class Task1 {
   public static void main(String[] args) {

    Scanner iScanner = new Scanner(System.in);
    System.out.println("Input number: ");
    int number = iScanner.nextInt();

    int sum = 0;
    int factorial = 1;

    for(int i = 1; i <= number; i++) {
        sum = sum + i;
        factorial = factorial * i;
    }

    System.out.printf(("Треугольное число равно: %d\n"), sum);
    System.out.printf(("Факториал равен: %d"), factorial);
   } 
}
