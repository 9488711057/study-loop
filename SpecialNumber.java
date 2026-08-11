package Loop;
import java.util.*;
public class SpecialNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int lower = sc.nextInt();
        int higher = sc.nextInt();
        for(int i=lower;i<=higher;i++){
            int dig1 = i%10;
            int dig2 = i/10;
            int sum = dig1+dig2;
            int product = dig1*dig2;
            int res = sum+product;
            if(res==i){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
