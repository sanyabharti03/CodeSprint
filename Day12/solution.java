import java.util.*;
public class prob12{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        if(n<1 || n>100){
            System.out.println("Error: Input between 1 and 100 are allowed");
            return;
        }
        ArrayList<String> result=new ArrayList<>();
        for(int i=0;i<n;i++){
            String name=sc.next();
            char first=name.charAt(0);
            if((first=='a'||first=='e'||first=='i'||first=='o'||first=='u') && !result.contains(name)){
                result.add(name);
            }
        }
        System.out.print(result.size()+" ");
        for(String name:result){
            System.out.print(name+" ");
        }
        sc.close();
    }
}
