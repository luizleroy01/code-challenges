
import java.util.ArrayList;

public class PalindomeNumber {
    public static void main(String[] args) {
        boolean result = isPalindrome(121);

        System.out.println( result ? "eh Palindomo" : "Não eh palindromo");
    }

    public static boolean isPalindrome(int x){
        if(x < 0) return false;
        if(x < 10) return true;

        int div = x/10;
        int mod = x % 10;

        ArrayList<String> v = new ArrayList<>();
        v.add(""+mod);

        while(div > 9){
            x = div;
            div = x/10;
            mod = x % 10;
            v.add(""+mod);
        }

        v.add(""+div);

        var reverseList = v.reversed();

       return v.equals(reverseList);

    }
}
