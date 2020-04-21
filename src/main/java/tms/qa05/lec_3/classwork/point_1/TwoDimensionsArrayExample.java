package tms.qa05.lec_3.classwork.point_1;

import java.util.Arrays;

public class TwoDimensionsArrayExample {
    public static void main(String[] args) {
        int[][] twoDimensionsArray = new int[5][4];

        for (int i = 0; i < twoDimensionsArray.length; i++) {
            for (int j = 0; j < twoDimensionsArray[i].length; j++) {
                twoDimensionsArray[i][j] = i + j;
            }
        }

        for (int i = 0; i < twoDimensionsArray.length; i++) {
            System.out.println(Arrays.toString(twoDimensionsArray[i]));
        }

        int[][] initTwoDimensionsArray = {{1, 2, 3}, {4, 5, 6}, {54, 65, 76}};

        for (int i = 0; i < initTwoDimensionsArray.length; i++) {
            System.out.println(Arrays.toString(initTwoDimensionsArray[i]));
        }

        int[][][] threeDimensionsArray = new int[5][4][];

        for (int i = 0; i < threeDimensionsArray.length; i++) {
            for (int j = 0; j < threeDimensionsArray[i].length; j++) {
                for (int k = 0; k < threeDimensionsArray[i][j].length; k++) {

                }
            }
        }
    }
}
