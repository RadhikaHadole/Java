import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class DistinctCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        Set<Character> set = new HashSet<>();

        for (int i = 0; i <= str.length()-1; i++) {
            set.add(str.charAt(i));
        }

        System.out.println("Number of distinct characters: " + set.size());
    }
}
