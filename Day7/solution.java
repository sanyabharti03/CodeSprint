import java.util.Scanner;

public class prob7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if(n%2==0){
            System.out.println("Enter odd number");
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    System.out.print((i + 1) + " ");
                else if (i + j == n - 1)
                    System.out.print((n - i) + " ");
                else
                    System.out.print("- ");
            }
            System.out.println();
        }
    }
}
