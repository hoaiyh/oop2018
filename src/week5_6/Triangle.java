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
}
