import java.util.Scanner;
public class prob9{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        scanner.close();
        int[] freq=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        int expectedFreq=0;
        for(int f:freq){
            if(f>0){
                expectedFreq=f;
                break;
            }
        }
        boolean isBalanced=true;
        for(int f:freq){
            if(f>0 && f!=expectedFreq){
                isBalanced=false;
                break;
            }
        }
        if(isBalanced){
            System.out.println("Aashriya smiles:Emotional balance found");
        }
        else{
            System.out.println("Aashriya wonders:These thoughts were scattered");
        }

    }
}
