package Home_work_1;

import java.time.LocalTime;
import java.util.Scanner;

public class HJ_3 {
    public static void main(String[] args) {
        // 3. В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
        // "Доброе утро, <Имя>!", если время от 05:00 до 11:59
        // "Добрый день, <Имя>!", если время от 12:00 до 17:59;
        // "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
        // "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

         try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите своё имя: ");
            String name = scanner.nextLine();

            int hours_num = LocalTime.now().getHour();;
            
            if (hours_num >= 5 && hours_num < 12)System.out.println("Доброе утро, " + name + "!");
            if (hours_num >= 12 && hours_num < 18)System.out.println("Добрый день, " + name + "!");
            if (hours_num >= 18 && hours_num < 23)System.out.println("Добрый вечер, " + name + "!");
            if (hours_num >= 23 && hours_num < 5)System.out.println("Доброй ночи, " + name + "!");
        }catch (Exception e) {
            e.printStackTrace();
        }

        

    }
}
