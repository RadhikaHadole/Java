import java.util.Scanner;

public class RemoveAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        String result = s.replaceAll("[a-zA-Z]", "");

        System.out.println("String after removing all alphabets: " + result);
    }
}
