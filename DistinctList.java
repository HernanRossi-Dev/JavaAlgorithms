import java.util.*;
import java.io.*;

class DistinctList {
    public static int DistinctL(int[] arr) {
        int result = 0;
        HashMap<Integer, Integer> dupMap = new HashMap<Integer, Integer>();
        for (int item : arr) {
            if (dupMap.containsKey(item)) {
                result++;
            } else {
                dupMap.put((Integer)item, 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] testOne = new int[]{1,2,2,2,3};
        int[] testTwo = new int[]{0,-2,-2,5,5,5};
        int[] testThree = new int[]{100,2,101,4};
        System.out.println(DistinctL(testOne));
        System.out.println(DistinctL(testTwo));
        System.out.println(DistinctL(testThree));
    }
}