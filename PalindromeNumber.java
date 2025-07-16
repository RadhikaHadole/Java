import java.util.Scanner;
 class PalindromeNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		int org = n;
		int rev =0;

		while(n!=0){
			int d = n%10;
			rev =rev *10 + d;
			n = n /10;
		}

		if(org==rev){
			System.out.println("Number is Palindrome ");

		}
		else {
			System.out.println("Number is not  Palindrome ");

		}
	}
}