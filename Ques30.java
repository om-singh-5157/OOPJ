
import java.util.Scanner;

class Multiplier{
    static int multiply(int a, int b) {
        return a * b;
    }
    static int multiply(int a, int b, int c) {
        return a * b * c;
    }
    static int multiply() {
        int result=1;
        while (true) { 
            Scanner input=new Scanner(System.in);
            System.out.print("Enter the number(for stop enter *):");
            String num=input.nextLine();
            if(num.equals("*")){
                break;
            }
            result*=Integer.valueOf(num);
        }
        return result;
    }
}
public class Ques30{
    public static void main(String[] args) {
        System.out.println("Multiply 2 numbers: " + Multiplier.multiply(2, 3));
        System.out.println("Multiply 3 numbers: " + Multiplier.multiply(2, 3, 4));
        System.out.println(Multiplier.multiply());
    }
}
