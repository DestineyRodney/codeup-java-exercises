package shapes;


public class ShapesTest {
    public static void main(String[] args){


// INITIAL CODE BLOCK
//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println("box1.getArea() = " + box1.getArea());
//        System.out.println("box1.getPerimeter() = " + box1.getPerimeter());
//
//        Rectangle box2 = new Square(5);
//        System.out.println("box2.getArea() = " + box2.getArea());
//        System.out.println("box2.getPerimeter() = " + box2.getPerimeter());

        Measurable myShape;

        myShape = new Square(2);
        System.out.println("Square Area = " + myShape.getArea());
        System.out.println("Square Perimeter = " + myShape.getPerimeter());

        myShape = new Rectangle(2, 4);
        System.out.println("Rectangle Area = " + myShape.getArea());
        System.out.println("Rectangle Perimeter = " + myShape.getPerimeter());



//        Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?
//        All methods must be implemented or it won't compile

//        What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
//        Won't compile because getLength and getWidth belong to Quad class not Measurable
    }
}
