package shape;

import util.Input;

import java.util.Scanner;

public class Circle {
    private final double radius;

    public Circle(double radius){
      this.radius = radius;
    }
    public double getArea(){
       double area = Math.PI * (this.radius * this.radius);
       //double area = Math.PI * Math.pow(this.radius, 2)
//        area = pi x (radius ^ 2)
        return Double.parseDouble(String.format("%.2f", area));
    }
    public double getCircumference(){
      double circumf = 2 * Math.PI * this.radius;
//        circumference = 2 x pi x radius
        return Double.parseDouble(String.format("%.2f", circumf));
    }


}

