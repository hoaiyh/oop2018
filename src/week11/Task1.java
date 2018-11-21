package week11;

public class Task1 {
    public static <T extends Comparable> void sort(T []a){
        for(int i = 0 ;i<a.length-1;i++){
            {
                for(int j=0;j<a.length-1-i;j++){
                    if(a[j].compareTo(a[j+1])>0)
                    {
                        T tmp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = tmp;
                    }
                }

            }

        }
    }
    public static void main(String []a){
        Character [] b = {'c','a','b','d'};
        Double [] c = {1.2, 0.0, 3.6, 2.1, 4.1};
        Float[] d ={2.2f,1f,0.9f,1.1f,4.6f};
        Byte[] e ={1,2,4,0,6,3,9};
        Integer [] f = {2,4444,0,5,10};
        sort(b);
        for(int i = 0 ;i<b.length;i++)
        {
            System.out.println(b[i]);
        }
    }
}
