package lesson1;
import java.util.ArrayList;
public class minmax {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Нахождение минимального, максимального и среднего арифметического
        int min = numbers.get(0);
        int max = numbers.get(0);
        double sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int n = numbers.get(i);
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
            sum += n;
        }
        double average = sum / numbers.size();

        // Вывод результатов на экран
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее арифметическое: " + average);
    }
}


