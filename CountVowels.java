import java.util.Scanner;
class CountVowels{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String : ");
		String s = sc.nextLine();
		s = s.toLowerCase();
		int countVowels=0 ;
		int countConsonants=0;

		for (int i =0;i<=s.length()-1 ;i++ ) {
			if(Character.isLetter(s.charAt(i)))
			{
				if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
				{
					countVowels++;
				}
				else{
					countConsonants++;
				}
			}
		}
		System.out.println("Count of Vowels : "+countVowels);
				System.out.println("Count of Consonants : "+countConsonants);
				System.out.println(s.length());
	}
}