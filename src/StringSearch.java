public class StringSearch {

    static boolean String(String str, char target){
        if (str.isEmpty()){
            return false;
        }
        for (int i = 0; i < str.length(); i++){
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "Aatif";
        char target = 'z';
        System.out.println(String(str,target));
    }
}
