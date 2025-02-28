package com.example.project.Selection_Sort;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class SelectionSort {

    // PART A. implementing selection sort
    public static int[] selectionSort(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            int current = elements[i];
            int currentMin = current;
            int currentMinPos = i;
            int temp = current;
            for (int j = i; j < elements.length; j++) {
                if (elements[j] < currentMin) {
                    currentMin = elements[j];
                    currentMinPos = j;
                }
            }
            elements[i] = currentMin;
            elements[currentMinPos] = temp;
        }
        return elements;
    }


    // PART B. sorting a 1000-word list
    public static ArrayList<String> selectionSortWordList(ArrayList<String> words) {
        for (int i = 0; i < words.size(); i++) {
            String current = words.get(i);
            String currentMin = current;
            int currentMinPos = i;
            String temp = current;
            for (int j = i; j < words.size(); j++) {
                if (words.get(j).compareTo(currentMin) < 0) {
                    currentMin = words.get(j);
                    currentMinPos = j;
                }
            }
            words.set(i, currentMin);
            words.set(currentMinPos, temp);
        }
        return words;
    }

    //call this method to load 1000 words into list. Use it to test Part B
    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }
}
