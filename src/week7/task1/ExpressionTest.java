package week7.task1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExpressionTest {
    public static void main(String [] ab){
        Numeral n1 = new Numeral(10);
        Numeral n2 = new Numeral(1);
        Numeral n3 = new Numeral(2);
        Numeral n4 = new Numeral(3);
        Numeral n5 = new Numeral(0);
        Square s1 = new Square(n1);
        Subtraction s2 = new Subtraction(s1,n2);
        Multiplication s3 = new Multiplication(n3,n4);
        Addition s4 = new Addition(s2,s3);
        Square S = new Square(s4);
        System.out.println("Gia tri cua bieu thuc la: " + S.envaluate());
        Division t = new Division(S,n5);
       try{
           System.out.println(t.envaluate());
      }
        catch (ArithmeticException e) {
          System.out.println("loi khong the chia cho so 0");
       }


        try {
            new FileInputStream("a.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
