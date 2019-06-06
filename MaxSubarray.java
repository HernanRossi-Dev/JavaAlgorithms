import java.util.*;

class MaxSubarray {
    public static int CalMax(int[] arr) {
        int result = Integer.MIN_VALUE;
        int len = arr.length;
        int[][] memory = new int[len][len];
        memory[0][0] = arr[0];
        for (int row = 1; row < len; row++) {
           for (int col = 0; col <= row; col++) {
                int track = memory[row - 1][col] + arr[row];
                memory[row][col] = track;
           } 
        }
        for (int row = 0; row < len; row++) {
            for (int col = 0; col <= row; col++) {
                int entry = memory[row][col];
                if (entry > result) {
                    result = entry;
                }
            } 
         }

        return result;
    }

    public static void main(String[] args) {
        int[] testOne = new int[]{-2, 5, -1, 7, -3};
        int[] testTwo = new int[]{3, -1, -1, 4, 3, -1};
        int[] testThree = new int[]{1, -2, 0, 3};

        System.out.println(CalMax(testOne));
        System.out.println(CalMax(testTwo));
        System.out.println(CalMax(testThree));
    }
}