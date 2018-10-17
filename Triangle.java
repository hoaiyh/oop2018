package week5_6;

/**
 * Created by CCNE on 17/10/2018.
 */
public class Triangle extends Shape{
    private double a,b,c;
    public void setA(double a)
    {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getC() {
        return c;
    }
    public Triangle(String color, boolean filled)
    {
        super(color, filled);

    }
    public void setCacCanh(double a, double b,double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;

    }
    public void print()
    {
        System.out.println("Triangle co do dai cac canh la :"<<getA()+" , "getB()+" "+ getC());
    }
}
