import java.util.*;
import java.io.*;

class MeanMode {
    public static int MeanModeCalc (int[] arr) {
        int result = 0;
        int mean = 0;
        int mode = 0;
        int sum = 0;
        HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();
        for (int entry: arr) {
            sum = sum + entry;
             Integer castInt = (Integer)entry;
            if (counts.containsKey(castInt)) {
                Integer count = counts.get(castInt) + 1;
                counts.put(castInt, count);
            } else {
                counts.put(castInt, 1);
            }
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            int value = (int)entry.getValue();
            int key = (int)entry.getKey();
            if (value > count) {
                mode = key;
                count = value;
            }
        }
        mean = sum / arr.length;
        if (mean == mode) {
            result = 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] testOne = new int[]{1, 2, 3};
        int[] testTwo = new int[]{4, 4, 4, 6, 2};
        int[] testThree = new int[]{5, 3, 3, 3, 1};
        System.out.println(MeanModeCalc(testOne));
        System.out.println(MeanModeCalc(testTwo));
        System.out.println(MeanModeCalc(testThree));
    }
}