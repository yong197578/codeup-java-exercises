package shapes;

public class Rectangle extends Quadrilateral implements Measurable{


    public Rectangle(double length, double width) {
        super(length, width);
    }

    // NO NEED CONSTRUCTOR!!
    @Override
    public double getPerimeter() {
        double perimeter = (2 * length) + (2 * width);
        return Double.parseDouble(String.format("%.2f", perimeter));
    }

    @Override
    public double getArea() {
        double area = length * width;
        return Double.parseDouble(String.format("%.2f", area));
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }
}
    //    protected double length;
//    protected double width;

//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }

//    public double getLength() {
//        return length;
//    }
//
//    public void setLength(double length) {
//        this.length = length;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public void setWidth(double width) {
//        this.width = width;
//    }
//    public double getArea(){
//        double area = length * width;
//        return Double.parseDouble(String.format("%.2f", area));
//    }
//    public double getPerimeter(){
//        double perimeter = (2 * length) + (2 * width);
//        return Double.parseDouble(String.format("%.2f", perimeter));
//    }
