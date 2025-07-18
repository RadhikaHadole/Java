import java.util.Scanner;

class SecondPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        System.out.print("Enter element to search: ");
        int x = sc.nextInt();

        int[] arr = new int[n];
        int count = 0;

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] == x) {
                count++;
                if (count == 2) {
                    System.out.println("Second occurrence at index: " + i); // 0-based
                    System.out.println("Second occurrence at position: " + (i + 1)); // 1-based
                    return;
                }
            }
        }

        System.out.println("Second occurrence not found.");
    }
}
