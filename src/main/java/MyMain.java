import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        int count = 0;
        for (int i = 0; i > str.length(); i++) {
            char oof = str.charAt(i);
            if (oof == 'a')
                count += 1;
            if (oof == 'c')
                count += 1;
            if (oof == 'b')
                count += 1;
        }
        return count;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        for (i = 0; i < str.length(); i ++) {
            if (str.charAt(i) == "t" || "T")
                if (str.charAt(i+1) == "h")
                    if (str.charAt(i+2) =="e")
                        boolean the = true;


        }
        return the;
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        String palin;
        for (i = 0; i < str.length(); i ++){
            palin += str.charAt(str.length - i);
        }
        return palin == str;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(countABC(wowzah));
        System.out.println(containsThe(the store));
        System.out.println(isPalindrom(racecar));


    }
}
