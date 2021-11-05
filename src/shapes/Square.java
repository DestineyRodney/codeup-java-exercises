package shapes;

public class Square extends Quadrilateral {

    public Square(double side){
        super(side, side);
    }
    @Override
    public double getPerimeter() {
        return this.length * 4;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public void setLength(double side) {
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
    }

//    CODE FROM INITIAL SQUARE EXERCISE

    //    public int side;

//    public Square(int side){
//        super(side, side);
//        this.side = side;
//    }

//    public void setLength(int length){
//        this.length = length;
//        this.width = length;
//    }
//
//    public int getArea(){
//        return side * side;
//    }

//    public int getPerimeter(){
//        return ((2 * side) + (2 * side));
//    }

//    public int getArea(){
//        return this.length * this.length;
//    }
//
//    public int getPerimeter(){
//        return this.length * 4;
//    }

}
