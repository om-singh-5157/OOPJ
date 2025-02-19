class Shape {
    void about() {
        System.out.println("This is a general shape.");
    }
}
class Circle extends Shape {
    @Override
    void about() {
        System.out.println("This is a circle, a type of shape.");
    }
}
public class Ques33 {
    public static void main(String[] args) {
        Shape shapeRef = new Circle();
        shapeRef.about();
    }
}