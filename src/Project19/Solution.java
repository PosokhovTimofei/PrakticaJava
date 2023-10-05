package src.Project19;

import java.io.File;
import java.util.*;

public class Solution<T, V, K> {
    private T[] array;

    public Solution(T[] array) {
        this.array = array;
    }

    public T getElementAtIndex(int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Index is out of bounds.");
        }
        return array[index];
    }

    public static <E> List<E> arrayToList(E[] array) {
        if (array == null) {
            return new ArrayList<>(); // Возвращаем пустой список, если массив равен null
        }
        return Arrays.asList(array);
    }

    public static void main(String[] args) {
        Integer[] intArray = {5, 9, 2, 4, 0};
        List<Integer> intList = arrayToList(intArray);

        System.out.println("List from Integer array: " + intList);

        String[] stringArray = {"nail", "screw", "hammer"};
        List<String> stringList = arrayToList(stringArray);

        System.out.println("List from String array: " + stringList);

        File[] filesInDirectory = new File("/PrakticaJava/src").listFiles();
        List<File> fileList = arrayToList(filesInDirectory);

        System.out.println("List of files in directory: " + fileList);

        Solution<Integer, String, Double> solution = new Solution<>(new Integer[]{5, 9, 7, 4, 0});
        System.out.println("Element at index 2: " + solution.getElementAtIndex(2));
    }
}
