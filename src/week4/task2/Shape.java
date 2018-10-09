package week4.task2;

/**
 * Created by CCNE on 09/10/2018.
 */
public class Shape{
    private String color;
    private boolean filled;
    Shape(){}
    Shape(String color,boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public boolean isFilled()
    {
        return filled;
    }
    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }
    public String toString()
    {
        return color;
    }
    public static void main(String [] a)
    {
        Shape s = new Shape("red",true);
//        s.setColor("red");
//        s.setFilled(true);
        System.out.println(s.getColor());

    }
}
