package com.example.demo;

import java.util.Arrays;

public class Copy {
    static void main() {
        int origin = 50;
        int copied = origin;

        origin = 300;
        System.out.println("DeepCopy");
        System.out.println(origin);
        System.out.println(copied);

        int[] array_origin = {1, 2, 3};
        int[] array_copied = array_origin;

        for (int i = 0; i < 3; i++) {
            array_origin[i] = i + 4;
        }
        System.out.println("This is Shallow Copy");
        System.out.println(Arrays.toString(array_origin));
        System.out.println(Arrays.toString(array_copied));

        int[] array_origin2 = {1, 2, 3};
        int[] array_copied2 = new int [array_origin2.length];
        for (int i = 0; i < array_origin2.length; i++) {
            array_copied2[i] = array_origin2[i];
        }
        System.out.println("생성 잘됐나 확인");
        System.out.println(Arrays.toString(array_origin2));
        System.out.println(Arrays.toString(array_copied2));

        for (int i = 0; i < 3; i++) {
            array_origin2[i] = i + 4;
        }
        System.out.println("This is Deep Copy");
        System.out.println(Arrays.toString(array_origin2));
        System.out.println(Arrays.toString(array_copied2));


    }
}
