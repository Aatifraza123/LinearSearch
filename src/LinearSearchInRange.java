public class LinearSearchInRange {
    static int SearchInRange(int[] arr, int target, int start, int end){
        if (arr.length == 0){
            return -1;
        }
        for (int i = start; i < end; i++){
            int element = arr[i];
            if (target == element){
                return i;

            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 7, 9, 4, 6, -4, 9, -3};
        int target = -3;
        int ans = SearchInRange(arr,target,3,4);
        System.out.println(ans);
    }
}
