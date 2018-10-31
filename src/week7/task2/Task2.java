package week7.task2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class Task2 {
    public class Animal{}
    public class dog extends Animal{}
    //ArithmeticException
    public  void devide(int a, int b) throws ArithmeticException {
        if (b == 0) throw new ArithmeticException();
    }

    //ArrayIndexOfBoundException

    public  void print() throws ArrayIndexOutOfBoundsException {
        int a[] = {0, 1, 2};
        System.out.println(a[3]);
    }
    //NullPointerException
    public  boolean equalsstr(String s1,String s2) throws NullPointerException{
        if(s2==null) throw new NullPointerException();
        return s1.equals(s2);
    }
    //ClassCastException
    public  void exception1() throws ClassCastException{
        Animal a = new Animal();
        dog b = (dog) a;
    }
    //FileNotException
    public void readfile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\tmp\\test.txt"));

        String textInALine = br.readLine();

        while (textInALine  != null) {
            System.out.println(textInALine);
            textInALine = br.readLine();
            br.close();
        }

    }
    public static void main(String[] ab) {
        Task2 exception = new Task2();
        Scanner input = new Scanner(System.in);
        int a = Integer.valueOf(input.nextLine());
        int b = Integer.valueOf(input.nextLine());
        String s1 = input.nextLine();
        String s2 = null;
        try {
            exception .equalsstr(s1, s2);
        } catch (NullPointerException e) {
            System.out.println("Loi NullPointerException");
        }
        try {
            exception .print();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Loi ArrayIndexOutOfBoundsException");
        }
        try {
            exception .devide(a, b);
            System.out.println(a / b);

        } catch (ArithmeticException e) {
            System.out.println("Loi ArithmeticException");
        }
        try {
            exception .exception1();
        } catch (ClassCastException e){
            System.out.println("Loi ClassCastException");
        }
        try{
            exception.readfile();
        } catch (FileNotFoundException e)
        {
            System.out.println("Loi FileNotFoundException");
        }
        catch(IOException e){
            System.out.println("LOI IoException");
        }
    }


}

