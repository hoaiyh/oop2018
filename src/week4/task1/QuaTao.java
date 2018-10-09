package week4.task1;

public class QuaTao extends HoaQua{
    //khai bao class QuaTao thua ke class HoaQua
    private float weight;
    private String date;
    public void setDate(String d)
    {
        date = d;
    }
    public String getDate()
    {
        return date;
    }
    public void setWeight(int n)
    {
        weight = n;
    }
    public float  getWeight()
    {
        return weight;
    }
    // Tinh so tien phai tra ;
    public float money()
    {
        float b = getWeight()*25;
        return b;
    }
    public static void main(String [] ab)
    {
        QuaTao apple = new QuaTao();
        apple.setSize("to");
        apple.setWeight(3);
        {
            System.out.println("Loai qua :"+ apple.getSize()+" nang "+apple.getWeight()+" kg");
            System.out.println("Ban phai thanh toan "+apple.money()+" nghin dong cho chu cua hang");
        }
    }
}