// К калькулятору из предыдущего дз добавить логирование.

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

public class Task {
    public static void main(String[] args) throws IOException {
        Logger logger  = Logger.getLogger(Task.class.getName());
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Привет, это калькулятор.\nКакую операцию будем выполнять?\nВведи символ/ы (+, -, /, //, %, *, **)\n");
        String operation = iScanner.nextLine().strip();
        FileHandler fh = new FileHandler("log.xml", true);
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info(operation);

        while (!(operation.equals("+") || operation.equals("-") || operation.equals("/") || operation.equals("//") || operation.equals("%") || operation.equals("*") || operation.equals("**"))) {
            System.out.println("Некорректный ввод, попробуйте снова\nВведи символ/ы (+, -, /, //, %, *, **)\n");
            operation = iScanner.nextLine();
            logger.info(operation);
        }

        System.out.println("Введите первое число: ");
        float first_number = iScanner.nextFloat();
        logger.info(Float.toString(first_number));
        System.out.println("Введите второе число: ");
        float second_number = iScanner.nextFloat();
        logger.info(Float.toString(second_number));
        float result = 0;

        if (operation.equals("+")) {
            result = first_number + second_number;
            System.out.printf(("%.2f %s %.2f = %.2f"), first_number, operation, second_number, result);
            System.out.println();
        }
        else if (operation.equals("-")) {
            result = first_number - second_number;
            System.out.printf(("%.2f %s %.2f = %.2f"), first_number, operation, second_number, result);
            System.out.println();
        }
        else if (operation.equals("/")) {
            result = first_number / second_number;
            System.out.printf(("%.2f %s %.2f = %.2f"), first_number, operation, second_number, result);
            System.out.println();
        }
        else if (operation.equals("//")) {
            int a, b;
            a = (int)first_number;
            b = (int)second_number;
            result = a / b;
            System.out.printf(("%.2f %s %.2f = %.0f"), first_number, operation, second_number, result);
            System.out.println();
        }
        else if (operation.equals("%")) {
            int a, b;
            a = (int)first_number;
            b = (int)second_number;
            result = a % b;
            System.out.printf(("%.2f %s %.2f = %.0f"), first_number, operation, second_number, result);
            System.out.println();
        }
        else if (operation.equals("*")) {
            result = first_number * second_number;
            System.out.printf(("%.2f %s %.2f = %.2f"), first_number, operation, second_number, result);
            System.out.println();
        }
        else if (operation.equals("**")) {
            double a, b;
            a = (double)first_number;
            b = (double)second_number;
            result = (float)Math.pow(a, b);
            System.out.printf(("%.2f %s %.2f = %.2f"), first_number, operation, second_number, result);
            System.out.println();
        }
        logger.info(Float.toString(first_number) + " " + operation + " " + Float.toString(second_number) + " " + "=" + " " + result);
    }

}