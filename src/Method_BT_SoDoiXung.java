import java.util.Scanner;

public class Method_BT_SoDoiXung {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so can kiem tra: ");
        number = scanner.nextInt();
        System.out.println("So dao nguoc la: " + reverse(number));
        System.out.println(+number + " la so doi xung: " + isPalindrome(number));

    }

    public static String reverse(int number) {
        String s = String.valueOf(number);
        String reverse = new StringBuffer(s).reverse().toString();
        return reverse;
    }

    public static boolean isPalindrome(int number) {
        String s = String.valueOf(number);
        boolean palindrome = s.equals(reverse(number));
        return palindrome;
    }
}
