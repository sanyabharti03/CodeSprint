import java.util.Scanner;

public class prob13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String log = sc.nextLine();
        int n = log.length();
        int count = 0;
        for(int i = 0; i < n; i++){
            if(log.charAt(i) == '1'){
                if(i == 0 || log.charAt(i - 1) == '0'){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
