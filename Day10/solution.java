import java.util.Scanner;
public class prob10{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<1 || n>50){
            System.out.println("Enter a valid input");
            return;
        }
        int[][] hall=new int[n][n];
        int totalseated=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i+j)%2==0){
                    hall[i][j]=1;
                    totalseated++;
                }
                else{
                    hall[i][j]=0;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(hall[i][j]);
                if(j!=n-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("Total students seated: "+totalseated);
    }
}
