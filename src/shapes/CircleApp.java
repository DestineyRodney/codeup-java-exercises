package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args){
        Input input = new Input();

        System.out.println("Enter a radius of a circle: ");
        double userInput = input.getDouble();
        System.out.println("The radius is: " + userInput);

        Circle circle = new Circle(userInput);
        System.out.println("The circumference is: " + circle.getCircumference());
        System.out.println("The area is: " + circle.getArea());
    }
}






