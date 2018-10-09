package week4.task2;

public class Square extends Rectangle {
    private double side;
    public void setSide(double side){
        this.side = side;
    }
    public double getSide()
    {
        return side;
    }
    public void setWidth(double side)
    {
        setWidth(side);
    }
    public void setLength(double length)
    {
        setLength(side);
    }

    public Square(){}
    public Square(double side){
        this.side = side;
    }
    public Square(double side,String color, Boolean filled){
        this.side = side;
        setColor(color);
        setFilled(filled);
    }
    public String toString()
    {
        return super.toString();
    }
    public static void main(String [] abc )
    {
        Square a = new Square(3.2);
        a.setColor("yellow");
        Square b = new Square(2.0,"white",true);
        System.out.println("Hinh vuong a co do dai canh la : "+ a.getSide());
        System.out.println("Hinh vuong co mau "+ a.toString());


    }

}