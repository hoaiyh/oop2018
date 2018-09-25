package week2.task1;

public class Task1 {

    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */


    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        int c = 0;
        for(int i=1;i<=a || i<=b;i++)
        {
            if(a%i == 0 && b%i==0)
                c=i;
        }
        return c;
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        if(n<0)
            return -1;
        else if(n==0||n==1)
        {
            return n;
        }
        else
        {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}