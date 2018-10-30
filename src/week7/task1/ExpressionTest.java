package week7.task1;

public class ExpressionTest {
    public static void main(String [] ab){
        Expression n1 = new Numeral(10);
        Expression n2 = new Numeral(1);
        Expression n3 = new Numeral(2);
        Expression n4 = new Numeral(3);
        Expression s1 = new Square(n1);
        Expression s2 = new Subtraction(s1,n2);
        Expression s3 = new Multiplication(n3,n4);
        Expression s4 = new Addition(s2,s3);
        Expression s5 = new Square(s4);
        System.out.println("Gia tri cua bieu thuc la: "+s5.envaluate());

    }
}
