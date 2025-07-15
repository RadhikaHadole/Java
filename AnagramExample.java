import java.util.Scanner;
import java.util.Arrays;
class AnagramExample
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first string : ");
		String s1 = sc.nextLine();
		System.out.println("Enter a second string : ");
		String s2 = sc.nextLine();

		if(s1.length()==s2.length())
		{
			s1 = s1.toLowerCase().replaceAll(" ","");
			s2 = s2.toLowerCase().replaceAll(" ","");

			char ch1[]= s1.toCharArray();
			char ch2[] = s2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);
			boolean f = Arrays.equals(ch1,ch2);

			if(f)
			{
				System.out.println("Anagram");
			}
			else {
				System.out.println("Not Anagram");
			}
		}
		else {
				System.out.println("Not Anagram");

		}

	}
}