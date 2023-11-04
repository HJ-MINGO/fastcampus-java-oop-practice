package com.fastcampaus.javaoop;

import com.fastcampaus.javaoop.logic.BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // list와 배열은 다른개념
        BubbleSort<String> sort = new BubbleSort<>();

        System.out.println("[Result] " + sort.sort(Arrays.asList(args)));
    }
}
