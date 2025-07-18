import java.util.Scanner;

class CommonCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        String common = "";

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (str2.indexOf(ch) != -1 && common.indexOf(ch) == -1) {
                common += ch;
            }
        }

        System.out.println("Common characters: " + common);
    }
}
