package shapes;


public class Square extends Quadrilateral {
    public Square(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
                double perimeter = 4 * length;
//        double perimeter = super.length * 4;
        //Math.pow(side, 2);
        return Double.parseDouble(String.format("%.2f", perimeter));
    }

    @Override
    public double getArea() {
     double area = getLength() * getLength();
     return Double.parseDouble(String.format("%.2f", area));
    }

    @Override
    public double getLength() {
        return super.getLength();
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    //    protected double side;
//    public Square(double side) {
//        super(side, side);
//        this.side = side;
//    }

//    public double getArea(){
////        double side = this.width;
////        double area = super.length * super.length;
//        double area = side * side;
//        //double area = getLength() * getLength();
//        return Double.parseDouble(String.format("%.2f", area));
//    }
//    public double getPerimeter(){
//        double perimeter = 4 * side;
////        double perimeter = super.length * 4;
//        //Math.pow(side, 2);
//        return Double.parseDouble(String.format("%.2f", perimeter));
//    }
}
