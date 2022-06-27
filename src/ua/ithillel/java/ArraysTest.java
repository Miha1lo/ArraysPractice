package ua.ithillel.java;

public class ArraysTest {
    public static void main(String[] args) {

        int[][] score;
        score = new int[][]{
                {10, 11, 12, 13},
                {20, 21, 22, 23},
                {30, 31, 32, 33}
        };
        int[] result = new int[score.length];
        int sum;

        for (int i = 0; i < 3; i++) {
            sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += score[i][j];
            }
            result[i] = sum;
            System.out.println(result[i]);
        }
    }
}
