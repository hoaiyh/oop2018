
package week5_6;

public class Circle extends Shape{
    private double radius ;
    final double pi = 3.14;
    //cac  phuong thuc constructor
    public Circle(){}
    public Circle (double radius)
    {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled)
    {
        setColor(color);
        setFilled(filled);
        this.radius = radius;

    }
    //phuong thuc tra ve gia tri radius
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    //phuong thuc tra ve dien tich cua hinh tron
    public double getArea()
    {
        double a = pi*radius*radius;
        return a;
    }
    // phuong thuc tinh chu vi hinh tron
    public double Perimeter()
    {
        double a = 2*pi*radius;
        return a;
    }
    public String toString()
    {
        return getColor();
    }
}
