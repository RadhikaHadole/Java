import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.print("Enter the character to be replaced: ");
        char oldChar = sc.next().charAt(0);

        System.out.print("Enter the new character: ");
        char newChar = sc.next().charAt(0);

        String result = "";
        for (int i = 0; i <= s.length()-1; i++) {
            char ch = s.charAt(i);
            if (ch == oldChar) {
                result = result + newChar;
            } else {
                result = result +  ch;
            }
        }

        System.out.println("String after replacement: " + result);
    }
}
