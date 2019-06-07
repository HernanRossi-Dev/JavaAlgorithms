import java.util.*;

class StockPicker {
    public static int CalcMax(int[] arr) {
        int min = arr[0];
        int max = 0;
        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                max = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
           
            int currProf = max - min;
            profit = currProf > profit ? currProf : profit;
        }
        if (profit == 0) {
            profit = -1;
        }
        return profit;
    }

    public static void main(String[] arg) {
        int[] testOne = {44, 30, 24, 32, 35, 30, 40, 38, 15};
        int[] testTwo = {10,12,4,5,9};
        int[] testThree = {14,20,4,12,5,11};
        int[] testFour = {10, 9, 8};
        System.out.println(CalcMax(testOne));
        System.out.println(CalcMax(testTwo));
        System.out.println(CalcMax(testThree));
        System.out.println(CalcMax(testFour));
    }
}