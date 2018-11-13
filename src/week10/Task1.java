package week10;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.util.*;

public class Task1 {
    public List <String> getAllFunctions(File path){
        List <String> list = new ArrayList<>();
        try{
            Scanner sc = new Scanner(path) ;
            String str ;
            while(sc.hasNext()){
                str  =sc.nextLine();
                if(str.contains("static")){
                    list.add(str);
                }
            }
            sc.close();
        }catch (IOException e ){
            System.out.println("ERROR");
        }
       return list;
    }
    public String findFunctionByName(String name){
        File file = new File("C:\\Github\\oop2018\\src\\week9\\Utils.java");
       String str ;
       String fn ="";
        try{
            Scanner sc = new Scanner(file);
            while (sc.hasNext())
            {
                str = sc.nextLine();
                if(str.contains(name))
                    fn+=str+'\n';
            }
        }catch(IOException e)
        {
            System.err.println("ERROR");
        }
         return fn;
    }
    public static void main(String [] a)
    {
        Task1 b = new Task1();
        Task1 ta = new Task1();
        List<String> c = new ArrayList<>();
        c = b.getAllFunctions (new File("C:\\Github\\oop2018\\src\\week9\\Utils.java"));
        System.out.println("Cac phuong thuc satic trong Utils.class: ");
        for(String list:c)
        {
            System.out.println(list);
        }
        String fn = ta.findFunctionByName("writeContentToFile");
        System.out.println(fn);
    }

}
