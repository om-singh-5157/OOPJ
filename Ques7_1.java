
import java.util.Scanner;

class Ques7_1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n;
        System.out.print("Enter the no.:");
        n=input.nextInt();
        for(int i=0; i<=n; i++){
            System.out.print('*');
            if(i%2!=0){
                for(int j=1;j<i;j++){
                    System.out.print("*");
                }
            }System.out.println();
        }
    }
}
