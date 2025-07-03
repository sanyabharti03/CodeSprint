import java.util.Scanner;
public class prob8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;

        if (n > 10) {
            System.out.println("Abhik’s marathon journey intensifies! Let’s see his progress chart:");
        }

        int maxLength = (n * 4) - 3; // Max width of the last line

        for (int day = 1; day <= n; day++) {
            StringBuilder line = new StringBuilder();

            if (day % 2 == 1) { // Odd: increasing
                for (int i = 1; i <= day; i++) {
                    line.append(i);
                    if (i < day) line.append("   ");
                }
            } else { // Even: decreasing
                for (int i = day; i >= 1; i--) {
                    line.append(i);
                    if (i > 1) line.append("   ");
                }
            }

            int padding = (maxLength - line.length()) / 2;
            System.out.println(" ".repeat(padding) + line);
            total += day;
        }

        System.out.println("Total numbers printed: " + total);
    }
}
