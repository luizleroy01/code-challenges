public class PalindomeNumber {
    public static void main(String[] args) {
        boolean result = isPalindrome(10);
    }

    public boolean isPalindrome(int x){
        if(x < 0) return false;

        int div = x/10;
        int mod = x % 10;


        return true;
    }
}
