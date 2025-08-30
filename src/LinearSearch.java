public class LinearSearch {
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++){
            int element = arr[i];
            if (target == element){
               return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {12, 7, 5, -2, 5, -4};
        int target = 4;
        System.out.println(linearSearch(arr,target));
    }
}
