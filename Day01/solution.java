import java.util.Scanner;
public class prob1{
    public static boolean icecream(int[] iceCreamPrices,int budget){
        for(int i=0;i<iceCreamPrices.length;i++){
            if(iceCreamPrices[i]==budget)
                return true;
        }
        return false;
    }
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter budget: ");
    int budget=sc.nextInt();
    if(budget<0){
        System.out.println("Invalid Input");
        return;
    }
    System.out.println("How many ice cream prices do you want?");
    int size=sc.nextInt();

    int[] iceCreamPrices=new int[size];
    System.out.println("Enter ice cream Prices");
    for(int i=0;i<size;i++){
        int num=sc.nextInt();
        if(num<0){
            System.out.println("Invalid Input");
            return;
        }
        iceCreamPrices[i]=num;
    }
    System.out.println(icecream(iceCreamPrices,budget));
}
}
