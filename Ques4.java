public class Ques4 {
    public static void main(String[] args) {
        Number num=new Number();
        num.Addition();
        num.Subtraction();
        num.Multiplication();
        num.Division();
        num.Modulo();
    }
}
class Number{
    int a=2;
    int b=3;
    void Addition(){
        System.out.println("Addition:"+(a+b));
    }
    void Subtraction(){
        System.out.println("Subraction:"+(a-b));
    }
    void Multiplication(){
        System.out.println("Multiplication:"+(a*b));
    }
    void Division(){
        System.out.println("Division:"+(a/b));
    }
    void Modulo(){
        System.out.println("Modulo:"+(a%b));
    }
}

