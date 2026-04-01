import java.util.Scanner;

public class NumberCheck {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr = new int[5];

            for (int i = 0; i < 5; i++) {
                arr[i] = sc.nextInt();
            }

            for (int num : arr) {
                if (num > 0) {
                    System.out.println(num + " is Positive");
                    if (num % 2 == 0)
                        System.out.println("Even");
                    else
                        System.out.println("Odd");
                } else if (num < 0) {
                    System.out.println(num + " is Negative");
                } else {
                    System.out.println("Zero");
                }
            }

            // Compare first and last
            if (arr[0] > arr[4])
                System.out.println("First is greater");
            else if (arr[0] < arr[4])
                System.out.println("Last is greater");
            else
                System.out.println("Equal");
        }
    }

