package week10;

import java.util.Random;

public class Task2{

    public static void main(String [] ab)
    {
        Random rd = new Random();
        float []a = new float[1000];
        for(int i =0;i<1000;i++)
        {
            float number =rd.nextFloat();
            a[i]=number;

        }

        for(int i=0;i<999;i++){
            for(int j=0;j<999-i;j++){
                if(a[j]>a[j+1])
                {
                    float tmp =a[j];
                    a[j]=a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
        System.out.println("Mang ban dau : ");
        for(int i=0;i<1000;i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println("\nMang sau khi sap xep la : ");
        for(int i=0;i<1000;i++)
        {
            System.out.print(a[i]+ " ");
        }

    }


}
