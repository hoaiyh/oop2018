package week4.task1;
public class QuaCam extends HoaQua{
    private String species;
    private String color;
    public void setSpecies(String s)
    {
        species= s;
    }
    public String  getSpecies()
    {
        return species ;
    }
    public void setColor(String s)
    {
        color= s;
    }
    public String  getColor() {
        return color;
    }
    public void print()
    {
        System.out.println("La loai cam co mau "+getColor()+ " duoc nhap khau tu :"+getSpecies());
        System.out.println("cam la loai qua "+ getSize());
    }
    public static void main(String []abc)
    {
            QuaCam c = new QuaCam();
        c.setSpecies("Trung Quoc");
        c.setSize("nho");
        c.setColor("vang");
        c.print();
    }
}