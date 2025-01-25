import java.util.Scanner;

class Prime{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x;
        int y;
        int n;
        System.out.print("Enter range of prime no.:");
        n=input.nextInt();
        System.out.print("Enter lower limit:");
        x=input.nextInt();
        System.out.print("Enter upper limit:");
        y=input.nextInt();
        if(x<y && x>0 && y>0 && n>0){
            int count=0;
            for(int i=x;i<=y && count<n;i++){
                int c=0;
                for(int j=1;j<=i;j++){
                    if(i%j==0){
                        ++c;
                    }
                }
                if(c==2){
                    System.out.println(i);
                    ++count;
                }
            }
        }
        else{
            System.out.println("not valid number inserted");
        }

    }
}
