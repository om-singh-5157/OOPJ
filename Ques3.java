class ASCII {
    public static void main(String[] args) {
        System.out.println("ASCII value of numbers are:");
        for(int i='0';i<='9';i++){
            System.out.println("ASCII value is:"+i);
        }
        System.out.println();

        char ch[]={'!','@','#','$','%','^','&'};
        System.out.println("ASCII value of special character are:");
        for(int i=0;i<ch.length;i++){
            System.out.println("ASCII value is:"+(int)ch[i]);
        }
    }
}
