package ua.ithillel.java;

import java.sql.Array;
import java.util.Arrays;

public class ArrayFruit {
    public static void main(String[] args) {

        String[] fruits = new String[6];
        String[] food;

        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "strawberry";
        fruits[3] = "chery";
        fruits[4] = "pineapple";
        fruits[5] = "raspberry";

        food = Arrays.copyOf(fruits, fruits.length);

        for (int i = 0; i < food.length; i++) {
            System.out.println(food[i]);
        }
    }
}
