package week4.task1;

public class CamSanh extends QuaCam{
    private float weight;
    private String chatluong;
    public void setWeight(float n)
    {
        weight = n;
    }
    public float getWeight()
    {
        return weight;
    }
    public void setChatLuong(String n)
    {
        chatluong = n;
    }
    public String getChatLuong()
    {
        return chatluong;
    }
    // Ham tinh gia tien
    public float money()
    {
        float t = getWeight()*15;
        return t;
    }
    //ham kiem tra chat luong
    public void cl()
    {
        if(getChatLuong() == "A")
            System.out.println("La loai qua chat luong tot . Co the dunng cho nguoi benh.");
        else
            System.out.println("San pham chat luong kem . Nguoi dung khong nen mua.");
    }
    public void print()
    {
        System.out.println("Cam sanh mau "+ getColor()+" ");
        cl();
        System.out.println("Ban da mua "+ getWeight()+"can. Ban phai tra "+money()+ " nghin dong.");
    }
    public static void main(String [] a)
    {
        CamSanh c = new CamSanh();
        c.setWeight(7);
        c.setChatLuong("A");
        c.setColor("vang");
        c.print();
    }
}