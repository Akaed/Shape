package laba3;

public class Shape {

    protected String color;
    protected boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void Shape(){
      this.color = "";
      this.filled = false;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shape(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled(){
        if (filled == true) return true;
        else return false;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public double abstract getArea();
    public  double abstract getPerimeter;
    public String abstract toString();
}
