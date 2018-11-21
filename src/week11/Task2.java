package week11;
import java.util.ArrayList;
import java.util.Scanner;
public class Task2 {
    public static <T extends Comparable> T maximum(ArrayList<T> a)
    {
        T max = a.get(0);
        for(int i = 0;i<a.size();i++){
            if(max.compareTo(a.get(i))<0)
                max = a.get(i);
        }
        return max;
    }
    public static void main(String[] ab)
    {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(0);
        list.add(4);
        list.add(3);
        ArrayList<Character> list1 = new ArrayList<Character>();
        list1.add('b');
        list1.add('a');
        list1.add('c');
        list1.add('v');
        Integer a = maximum(list);
        Character b = maximum(list1);
        System.out.println(a);
        System.out.println(b);
    }

}