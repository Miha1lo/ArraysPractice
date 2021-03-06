package ua.ithillel.java;

public class ArraysTest {
    public static void main(String[] args) {

        int[][] score = new int[3][4];
        int[] result = new int[score.length];
        int sum;

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                score[i][j] = 10 * (i + 1) + j;
                System.out.print(score[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < score.length; i++) {
            sum = 0;
            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
            }
            result[i] = sum;
            System.out.println(result[i]);
        }
    }
}
