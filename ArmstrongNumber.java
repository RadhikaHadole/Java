import java.util.Scanner;
import java.lang.Math;
class ArmstrongNumber{
	 public static void main(String[] args) {
	 	Scanner sc = new Scanner(System.in);
	 	System.out.println("Enter a Number : ");
	 	int n = sc.nextInt();
	 	int count =0;
	 	int temp = n;
	 	int sum = 0;

	 	while(n!=0){
	 		count++;
	 		n = n/10;
	 	}
	 	int temp2 = temp ;
	 	while(temp!=0){
	 		int d = temp%10;
	 		sum = sum +(int)Math.pow(d,count);
	 		temp = temp/10;
	 	}
	 	if(sum ==temp2){
	 		System.out.println("Armstrong ");
	 	}
	 	else {
	 		System.out.println(" Not Armstrong ");

	 	}

	 }
}