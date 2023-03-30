package lesson1;
import java.util.ArrayList;
import java.util.Arrays;

//Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)
public class main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        // Удаление четных чисел из списка
        numbers.removeIf(n -> n % 2 == 0);

        // Вывод списка на экран
        System.out.println(numbers);
    }
}


