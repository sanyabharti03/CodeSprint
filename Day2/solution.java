import java.util.Scanner;
public class problem2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of shots: ");
        int shots=sc.nextInt();
        if(shots<=0 || shots>100){
            System.out.println("Invalid Input");
            return;
        }
        int goodshots=0,missedshots=0;
        int[] archery=new int[shots];
        for(int i=0;i<shots;i++){
            int num=sc.nextInt();
            if(num<0 || num>10){
                System.out.println("Invalid input");
                return;
            }
            archery[i]=num;
            if(archery[i]>=7)
                goodshots++;
            else
                missedshots++;
        }
        System.out.println(goodshots+" "+missedshots);
    }
}
