import java.util.Scanner;
class Palindrome
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = sc.nextLine();
		String org = s;

		StringBuilder sb = new StringBuilder(s);
		sb.reverse();

		String s2 = new String(sb);
		System.out.println("Reversed String : "+s2);

		if(org.equals(s2)){
			System.out.println("Palindrome");
		}
		else{
			System.out.println(" Not Palindrome");

		}
	}
}