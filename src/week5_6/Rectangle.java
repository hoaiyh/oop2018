package week5_6;

public class Rectangle extends Shape {
    private double width;
    private double length;
    public void setWidth(double width){
        this.width = width;
    }
    public double getWidth(){
        return width;
    }
    public void setLength(double length)
    {
        this.length = length;
    }
    public double getLength()
    {
        return length;
    }
    public Rectangle(){}
    public Rectangle(double width,double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width,double length,String color,boolean filled){
        this.width = width;
        this.length = length;
        setColor(color);
        setFilled(filled);
    }
    public double getArea(){
        double a;
        a= getWidth() * getLength();
        return a;
    }
    public double getPerimeter(){


        return  2*(getWidth() + getLength());
    }

    public String toString() {
        return super.toString();
    }

}
