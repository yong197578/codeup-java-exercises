package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea(){
        double area = length * width;
        return Double.parseDouble(String.format("%.2f", area));
    }
    public double getPerimeter(){
        double perimeter = (2 * length) + (2 * width);
        return Double.parseDouble(String.format("%.2f", perimeter));
    }
}
