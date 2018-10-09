
package week4.task2;

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
    public static void main(String [] ab)
    {
        Rectangle a = new Rectangle(1.0,1.0);
        Rectangle b = new Rectangle(2.3,3.4,"red",true);
        System.out.println("Die tich va chu vi lan luot cua hinh a la : "+ a.getArea()+" "+ a.getPerimeter());
        System.out.println("Hinh chu nhat  b co mau :"+ b.toString());
        System.out.println("Die tich va chu vi lan luot cua hinh b la : "+ b.getArea()+" "+ b.getPerimeter());

    }
}

