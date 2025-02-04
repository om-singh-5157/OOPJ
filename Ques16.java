public class Ques16 {
    public static int fib(int n) {
        int first=0,second=1;
        int fib=0;
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        for(int i=2;i<=n;i++){
            fib=first+second;
            first=second;
            second=fib;
        }
        return fib;
    }
    public static int Fib2(int n){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        int Fnm1=Fib2(n-1);
        int Fnm2=Fib2(n-2);
        int fib=Fnm1+Fnm2;
        return fib;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println("Without recursion:"+fib(n));
        System.out.println("With recursion:"+Fib2(n));
    }
}
