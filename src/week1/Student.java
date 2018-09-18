package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private String name;
    private String group;
    private String id;
    private String email;
    // TODO: khai báo các phương thức getter, setter cho Student
    public String getName() {
        return this.name;
    }
    public void setName(String n) {
        this.name = n;
    }
    public void setId(String n) {
        this.id = n;
    }
    public String getId() {
        return this.id;
    }
    public void setGroup(String n) {
        this.group = n;
    }
    public String getGroup()
    {
        return group;
    }

    public void setEmail(String n) {
        this.email = n;
    }
    public String getEmail()
    {
        return email;
    }

    /**
     * Constructor 1
     */
    Student() {
        // TODO:
        name = "Student";
        id = "000";
        group = "INT22041";
        email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
        name = n;
        id = sid;
        email = em;
        group = "INT22041";
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
        name = s.name;
        group = s.group;
        id = s.id;
        email = s.email;
    }

    String getInfo() {
        // TODO:
        System.out.println("Name: " + this.name + "\nId: "+ this.id +"\nGroup: "
                +this.group + "\nEmail: "+this.email);
        return null; // xóa dòng này sau khi cài đặt
    }
}