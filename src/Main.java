import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println();
        int[] ints = {1, 2, 3, 4, 5};
        int result = 0;
        for (int i = 0; i < ints.length; i++) {
            result += ints[i];
        }
        System.out.println("Сумма трат за месяц составила " + result + " рублей.");
        System.out.println();
        System.out.println("Задание 2");
        System.out.println();
        int[] ints1 = {1, 2, 3, 4, 5};
        if (ints1.length > 0) {
            System.out.println("Максимальное " + ints1[ints1.length - 1]);
            System.out.println("Минимальное " + ints1[0]);
        }else {
            System.out.println("Максимальное и минимальное не существует");
        }
        System.out.println();
        System.out.println("Задание 3");
        System.out.println();
        int[] ints2 = {1, 2, 3, 4, 5};
        int result1 = 0;
        for (int i = 0; i < ints2.length; i++) {
            result1 += ints2[i];
        }
        double average = (double) result1 / ints2.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей%n", average);
        System.out.println();
        System.out.println("Задача 4");
        System.out.println();
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}


