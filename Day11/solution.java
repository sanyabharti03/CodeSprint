import java.util.Scanner;
public class prob11{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String jewels=sc.nextLine();
        String stones=sc.nextLine();
        if(jewels.length()<1 || jewels.length()>50 || stones.length()<1 || stones.length()>50){
            System.out.println("Error:Length of jewels and stones must be between 1 and 50");
            sc.close();
            return;
        }
        int count =0;
        for(int i=0;i<stones.length();i++){
            char stonechar=stones.charAt(i);
            for(int j=0;j<jewels.length();j++){
                if(stonechar==jewels.charAt(j)){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
