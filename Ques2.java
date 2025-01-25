class Swapping {
    public static void main(String[] args) {
        int a=2,b=3;
        
        // With third variable..
        System.out.println("Before swapping:"+a+","+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping:"+a+","+b);

        // Without third variable..
        System.out.println("Before swapping:"+a+","+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swapping:"+a+","+b);
    }
}
