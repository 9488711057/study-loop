package Loop;
import java.util.*;
public class Primerange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for(int i=2;i<=num;i++){
            boolean isPrime = true;
            for(int j=2;j<=i-1;j++){
                if(i%j==0){
                    isPrime = false;
                }
            }
            if(isPrime==true){
                System.out.println(i);
            }
        }
        sc.close();
    }
}