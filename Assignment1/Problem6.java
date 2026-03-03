import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        input.close();
    }
}
