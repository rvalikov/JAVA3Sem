package lesson1;
import java.util.ArrayList;
public class Task3 {
    public static void main(String[] args) {
        // Создание списка
        ArrayList<String> list = new ArrayList<>();

        // Добавление элементов в список
        list.add("one");
        list.add("2");
        list.add("three");
        list.add("4");
        list.add("five");

        // Вывод списка до удаления
        System.out.println("Список до удаления: " + list);

        // Удаление целых чисел из списка
        list.removeIf(str -> {
            try {
                Integer.parseInt(str);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        });

        // Вывод списка после удаления
        System.out.println("Список после удаления: " + list);
    }
}
