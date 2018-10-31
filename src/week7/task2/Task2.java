package week7.task2;

import java.util.Scanner;

public class Task2 {
    //ArithmeticException
    public static void devide(int a, int b) throws ArithmeticException {
        if (b == 0) throw new ArithmeticException();
    }

    //ArrayIndexOfBoundException

    public static void print() throws ArrayIndexOutOfBoundsException {
        int a[] = {0, 1, 2};
        System.out.println(a[3]);
    }
    //NullPointerException
    public static boolean equalsstr(String s1,String s2) throws NullPointerException{
        if(s2==null) throw new NullPointerException();
        return s1.equals(s2);
    }
    //FileNotFoundException
    public static void main(String[] ab) {
        Scanner input = new Scanner(System.in);
        int a = Integer.valueOf(input.nextLine()) ;
        int b = Integer.valueOf(input.nextLine());
        String s1 = input.nextLine();
        String s2 = null;
        try{
            equalsstr(s1,s2);
        }catch (NullPointerException e){
            System.out.println("Loi NullPointerException");
        }
        try {
            print();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Loi ArrayIndexOutOfBoundsException");
        }
        try {
            devide(a, b);
            System.out.println(a / b);

        } catch (ArithmeticException e) {
            System.out.println("Loi ArithmeticException");
        }
    }
}

