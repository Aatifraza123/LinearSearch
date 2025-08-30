public class MinInLinear{
    static int Min(int[] arr){
        int min = arr[0];
        int idx = 1;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
                idx = i;

            }
        }
        System.out.print(min + " ");
       return idx;

    }

    static int Max(int[] arr){
        int max = arr[0];
        for (int i = 0; i <  arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {4, 8, -5, 9, -7, 3};
        System.out.println(Min(arr));
        System.out.println(Max(arr));
    }
}
