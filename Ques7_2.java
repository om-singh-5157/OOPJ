import java.util.*;
public class Ques7_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.print("Enter number of rows::");
        n=sc.nextInt();
        for(int i=n;i>=0;i--){
             char ch='A';
             for(int j=0;j<i;j++){
                  System.out.print(ch++);
             }
             System.out.println();
        }
        sc.close();
   }
}
