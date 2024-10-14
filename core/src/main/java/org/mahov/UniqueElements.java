package org.mahov;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueElements {
//Уникальные элементы: Напишите программу, которая принимает массив чисел и выводит все уникальные элементы,
// используя Map для хранения количества вхождений каждого элемента.
    public static Set<Integer> findUniqueElements(int[] numbers) {
        Map<Integer, Integer> numCount = new HashMap<>();

        return ;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 4, 5};
        Set<Integer> result = findUniqueElements(numbers);
        System.out.println(result); // [1, 3, 5]
    }
}
