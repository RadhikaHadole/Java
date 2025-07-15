import java.util.Scanner;
class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A string : ");
        String s = sc.nextLine();
        char[] a = s.toCharArray();

        int start=0 , end=a.length-1;
        char c ;
        

        while(start<end)
        {
            c = a[start];
            a[start] = a[end];
            a[end] = c ;
            start++;
            end--;
        }
        String reversed = new String(a);
        System.out.println("Reversed String: " + reversed);
    }
}