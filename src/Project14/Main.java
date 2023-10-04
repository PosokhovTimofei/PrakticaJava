package src.Project14;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Создаем ArrayList с элементами "Hi2" и "Hi3".
        ArrayList<String> al = new ArrayList<>();
        al.add("Hi2");
        al.add("Hi3");

        // Создаем и заполняем WaitList с элементами "Hi", "Hi2" и "Hi3".
        WaitList<String> wl = new WaitList<>();
        wl.add("Hi");
        wl.add("Hi2");
        wl.add("Hi3");

        // Выводим текущее состояние WaitList.
        System.out.println("WaitList: " + wl);

        // Удаляем и выводим первый элемент из WaitList.
        System.out.println("Removed from WaitList: " + wl.remove());

        // Выводим текущее состояние WaitList после удаления.
        System.out.println("WaitList after removal: " + wl);

        // Проверяем, пустой ли WaitList.
        System.out.println("Is WaitList empty? " + wl.isEmpty());

        // Проверяем наличие элемента "Hi" в WaitList.
        System.out.println("Does WaitList contain 'Hi'? " + wl.contains("Hi"));

        // Проверяем, содержит ли WaitList все элементы из ArrayList al.
        System.out.println("Does WaitList contain all elements from ArrayList? " + wl.containsAll(al));

        System.out.println();

        // Создаем BoundedWaitList с максимальной вместимостью 3 элемента.
        BoundedWaitList<String> bwl = new BoundedWaitList<>(3);

        // Добавляем элементы в BoundedWaitList.
        bwl.add("foo");
        bwl.add("foo2");
        bwl.add("bar");

        // Выводим текущее состояние BoundedWaitList и его вместимость.
        System.out.println("BoundedWaitList: " + bwl);
        System.out.println("BoundedWaitList capacity: " + bwl.getCapacity());

        try {
            // Попытка добавить элемент, превышающий вместимость.
            bwl.add("bar2");
        } catch (Exception e) {
            // Выводим ошибку.
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();

        // Создаем новый BoundedWaitList с использованием ArrayList al.
        bwl = new BoundedWaitList<>(al);
        System.out.println("BoundedWaitList capacity (using ArrayList): " + bwl.getCapacity());

        try {
            // Попытка добавить элемент, превышающий вместимость.
            bwl.add("bar2");
        } catch (Exception e) {
            // Выводим ошибку.
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();

        // Создаем UnfairWaitList и добавляем несколько элементов.
        UnfairWaitList<Integer> uwl = new UnfairWaitList<>();
        uwl.add(1);
        uwl.add(2);
        uwl.add(23);
        uwl.add(5);
        uwl.add(5);
        uwl.add(6);

        // Выводим текущее состояние UnfairWaitList.
        System.out.println("UnfairWaitList: " + uwl);

        // Удаляем первое вхождение элемента 5 и выводим состояние.
        uwl.remove(5);
        System.out.println("UnfairWaitList after removing 5: " + uwl);

        // Перемещаем элемент 23 в конец списка и выводим состояние.
        uwl.moveToBack(23);
        System.out.println("UnfairWaitList after moving 23 to the back: " + uwl);
    }
}

