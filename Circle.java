package laba3;

public class Circle extends Shape {
    private double radius;


    public Circle (double radius , String color,boolean filled){
        this.radius = radius;
        super(color, filled);

    }

    public Circle (double radius){
        this.radius = radius;

    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public Circle (){
        this.radius = 0.1;
    }

    @Override
    public double getArea() {
         double c = radius*radius*Math.PI;
        return c;
    }

    @Override
    public double getPerimeter() {
        double c = 2*Math.PI*radius;
        return c;
    }
}
