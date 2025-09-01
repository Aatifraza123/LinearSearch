import java.util.*;
public class LinearSearchIn2dArray {
    static int[] SearhIn2dArray(int[][] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]) {
                return new int[]{i, j};
            }
        }
    }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 4, 9, 3, 5 },
                { 3, 8, 5, 9, 3 },
                {12, 45, 89, 34, 6},
                {34, 98, 56, 77, 23}
        };
        int target = 12;
        int[] ans = SearhIn2dArray(arr, target);
        System.out.println(Arrays.toString(ans));
    }
}
