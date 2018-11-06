package week9;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Utils {
        //ham doc du lieu tu tep
        public static String readContentFromFile(String path){
            File file = new File(path);
            String str = "";
            try{
                Scanner sc = new Scanner(file);

                while (sc.hasNext())
                {

                    str+= sc.nextLine()+"\n";

                }

            }catch(IOException e){
                System.err.println("Error!");
            }
            return str;
        }
        //ham ghi du lieu ra tep va xoa du lieu cu cua tep do di
        public static void writeContentToFile(String path)
        {
            File file = new File(path);
            try(PrintWriter p =new PrintWriter(path)){
                p.println("Xin chao moi nguoi");
                p.println("Hello World");
            }catch(IOException e){
                System.err.println("error!");
            }
        }
        //ham ghi vao cuoi tep
        public static void writeContentToFile1(String path){
            File file = new File (path);
            try (FileWriter fw =new FileWriter(file,true);
                 BufferedWriter bw = new BufferedWriter(fw)){

                bw.write("XIN chao tat ca moi nguoi");
            }catch(IOException e){
                System.err.println("ERROR!");
            }
        }
        //y d
        public static void findFileByName(String folderPath,String fileName){
            File file = new File(folderPath);
            if (file.exists()) {
                if (file.isFile()) {
                    if (file.getName().endsWith(fileName)) {
                        System.out.println(file.getAbsolutePath());
                    }
                }
                File[] listFile = file.listFiles();
                if (listFile != null) {
                    for (File f : listFile) {
                        findFileByName(f.getAbsolutePath(), fileName);
                    }
                }
            } else {
                System.out.println("source không tồn tại");
            }
        }
        public static void main(String [] ab){
            String path = "hoai.txt";
            String p = "output.txt";
            String folderpath = "C:\\Users\\HP\\Desktop\\h";
            String fileName = "2";
            System.out.println(readContentFromFile(path));
       writeContentToFile(p);
       writeContentToFile1(path);
            findFileByName(folderpath,fileName);
        }
    }
