package shapes;

public class Square extends Rectangle{
    protected double side;
    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public double getArea(){
//        double side = this.width;
//        double area = super.length * super.length;
        double area = side * side;
        //double area = getLength() * getLength();
        return Double.parseDouble(String.format("%.2f", area));
    }
    public double getPerimeter(){
        double perimeter = 4 * side;
//        double perimeter = super.length * 4;
        //Math.pow(side, 2);
        return Double.parseDouble(String.format("%.2f", perimeter));
    }
}
