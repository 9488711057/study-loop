package Loop;

public class Whileloop {
    public static void main(String[] args){
        int num = 999;
        int n = 3;
        int count = 0;
        while(num>=n){
            count++;
            num = num/n;
        }
        System.out.println(count);
        
        }
    }

