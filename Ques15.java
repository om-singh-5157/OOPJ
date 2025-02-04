import java.util.Scanner;

public class Ques15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        System.out.println("Enter 1 for binary:");
        System.out.println("Enter 2 for HEXA:");
        int choice=sc.nextInt();
        int bin_no=0;
        int pow=0;
        if(choice==1){
            while (n>0) {
                int rem=n%2;
                bin_no+=(rem*(int)Math.pow(10, pow));
                pow++;
                n/=2;
            }
            System.out.println("The binary representation is:"+bin_no);
        }
        else if(choice==2){
            StringBuilder hex = new StringBuilder();
            while ((n>0)) {
                int remainder = n % 16;
                if (remainder < 10) {
                    hex.insert(0, (char) ('0' + remainder));
                } else {
                    hex.insert(0, (char) ('A' + (remainder - 10)));
                }
                n /= 16; 
            }
            System.out.println("The Hexadecimal representation is:"+hex);
        }
    }
}
