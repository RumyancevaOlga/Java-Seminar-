// **Текст задачи:**
//  Настроить проект, вывести в консоль “Hello world!”.

// Вывести в консоль системные дату и время.

import java.time.LocalDateTime;

public class program {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        LocalDateTime nowTime = LocalDateTime.now();
        System.out.println(nowTime);
    }
}
