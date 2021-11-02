package shapes;

public class Square extends Rectangle {
    public int side;

    public Square(int side){
        super(side, side);
        this.side = side;
    }

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

    public int getArea(){
        return this.length * this.length;
    }

    public int getPerimeter(){
        return this.length * 4;
    }

}
