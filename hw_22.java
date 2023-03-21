import java.io.File;
import java.io.FileReader;
import java.io.IOException;
// import java.util.Arrays;
// import java.lang.reflect.Array;
// import java.util.ArrayList;

// import java.util.Arrays;

public class hw_22 {
   public static void main(String[] args) {
      /*
       Дана строка (получение через обычный текстовый файл!!!)

      "фамилия":"Иванов","оценка":"5","предмет":"Математика"
      "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

      Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
      Студент [фамилия] получил [оценка] по предмету [предмет].

      Пример вывода:
      Студент Иванов получил 5 по предмету Математика.
      Студент Петрова получил 4 по предмету Информатика.
      Студент Краснов получил 5 по предмету Физика.
      */
      File myFile = new File("C:/Users/HP/Documents/Учеба/Программирование JAVA/file.txt");
      // System.out.println("File name: " + myFile.getName());
      // System.out.println("Parent folder: " + myFile.getParent());
      // if(myFile.exists())
      //       System.out.println("File exists");
      //   else
      //       System.out.println("File not found");
      
      // System.out.println("File size: " + myFile.length());
      //   if(myFile.canRead())
      //       System.out.println("File can be read");
      //   else
      //       System.out.println("File can not be read");
         
      StringBuilder str = new StringBuilder();   
 
            try (FileReader fr = new FileReader(myFile))
            {
                int content;
                while ((content = fr.read()) != -1) {
                    str.append((char) content);
                }
            } catch (IOException e) {
               System.out.print("Файл не найден");
            }
            // System.out.print(str);
      String array[] = str.toString().split("\n");
      // System.out.print(array);  
      StringBuilder strNew = new StringBuilder(); 
      for(String i: array){
         String element[] = i.toString().split(",");
         for(String j: element){
            String word[] = j.toString().split(":");
            strNew.append(word[1]).append("\n");
         }
      
      }
      System.out.println(strNew);  
      String[] finish = strNew.toString().split("\n");
      for(int i = 0; i <finish.length; i+=3){
         System.out.println("Студент " + finish[i].replace("\"", "") + " получил " + finish[i+1].replace("\"", "")+" по предмету "+ finish[i+2].replace("\"", ""));
      }
      
   }
}

