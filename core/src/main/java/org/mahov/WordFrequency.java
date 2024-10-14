package org.mahov;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordFrequency {

    ///*
    //text.txt содержит:
    //"Hello world! Hello Java."
    //Ожидаемый результат:
    //{hello=2, world=1, java=1}
    //*/

    //Подсчет частоты слов: Напишите программу,
    // которая считывает текст из файла и использует Map для подсчета, сколько раз каждое слово встречается в тексте.

    public static Map<String, Integer> countWords(String filename) throws IOException {
        Map<String, Integer> wordCount = new HashMap<>();
        return wordCount;
    }

    public static void main(String[] args) throws IOException {
        Map<String, Integer> result = countWords("countWords.txt");
        System.out.println(result);
    }
}
