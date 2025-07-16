import java.util.Scanner;
class SumDigit{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		int org = n;
		int Sum =0;

		while(n!=0){
			int d= n %10;
			Sum = Sum + d;
			n = n /10;
		}

		System.out.println("Sum Of Digit : "+Sum);


	}
}