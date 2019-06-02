import java.util.*;
import java.io.*;

class SecondGreatLow {
    public static String SecondGreatLow(int[] arr) {
        int lowest = Integer.MAX_VALUE;
        int secondLowest = Integer.MAX_VALUE;
        int greatest = Integer.MIN_VALUE;
        int secondGreatest = Integer.MIN_VALUE;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int curr = arr[i];
            
            if (curr < lowest ) {
              secondLowest = lowest;
              lowest = curr;
            } else if ( curr > lowest && curr < secondLowest) {
              secondLowest = curr;
            }
            if (curr > greatest) {
              secondGreatest = greatest;
              greatest = curr;
            } else if (curr < greatest && curr > secondGreatest) {
              secondGreatest = curr;
            }
        }
        if (secondLowest == Integer.MAX_VALUE) {
          secondLowest = lowest;
        }
        if (secondGreatest == Integer.MIN_VALUE) {
          secondGreatest = greatest;
        }
        return secondLowest + " " + secondGreatest;
    }

    public static void main(String[] args) {
        int[] testOne = new int[]{1, 42, 42, 180};
        int[] testTwo = new int[]{4, 90};
        int[] testThree = new int[]{7, 7, 12, 98, 106};
        int[] testFour = new int[]{-4, -5, 10, 2};
        int[] testFive = new int[]{80, 80};
        int[] testSix = new int[]{90, 23};
        int[] testSeven = new int[]{2,2,2,5,5,5,6};
        int[] testEight = new int[]{7, 7, 90, 100000};
        ArrayList<int[]> items = new ArrayList<int[]>();
        items.add(testOne);
        items.add(testTwo);
        items.add(testThree);
        items.add(testFour);
        items.add(testFive);
        items.add(testSix);
        items.add(testSeven);
        items.add(testEight);
        for ( int[] current : items ) {
          System.out.println("Current: " + Arrays.toString(current));
          System.out.println(SecondGreatLow(current));
        }
    }
}

