package week4.task1;

public class CamCaoPhong extends QuaCam{
    private float weight;
    public String ngaynhap;
    public void setNgayNhap(String s)
    {
        ngaynhap= s;
    }
    public String getNgayNhap()
    {
        return ngaynhap ;
    }

    public void setWeight(float s)
    {
        weight= s;
    }
    public float getWeight()
    {
        return weight ;
    }
    //ham tinh gia tien
    public float money()
    {
        float t = getWeight()*25;
        return t;
    }
    //ham in ra ten cam ,so can , ngay nhap va so tien khach phai tra
    public void print ()
    {
        System.out.println(getName()+"La loai cam "+ getSpecies());
        System.out.println("Cam Duoc nhap vao ngay "+ getNgayNhap());
        System.out.println("So tien ban phai tra cho chu cua hang la :"+money()+" nghin dong .");
    }
    public static void main(String [] a)
    {
        CamCaoPhong c = new CamCaoPhong();
        c.setName("Cam Cao Phong ");
        c.setSpecies("Trung Quoc");
        c.setWeight(4);
        c.setNgayNhap("7/8/2018");
        c.print();
    }
}