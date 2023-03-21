
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
// import java.io.Writer;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.*;
public class hw_21 {
  
   public static void main(String[] args) {
      /*
       Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
результат после каждой итерации запишите в лог-файл.
       */
      
      int size = 10;// размер массива
      Scanner in = new Scanner(System.in); // открытие сканера
      int[] array = new int[size]; // создание массива с "0"

      for (int i = 0; i < size; i++) { // заполнение массива с клавиатуры
         System.out.print("Введите число: ");
         array[i]  = in.nextInt();        
      }
      in.close(); //закрываем сканер

      System.out.println(Arrays.toString(array)); // Выводим на экран, полученный массив
      Logger log = Logger.getLogger(hw_21.class.getName());
      FileHandler handler;
      try {
         handler = new FileHandler(); //создаем 
         log.addHandler(handler); //добавляем
         XMLFormatter s_form = new XMLFormatter(); //создаем новый файл, куда будем записывать массив
         handler.setFormatter((s_form)); 
      } catch (SecurityException | IOException e) {
         
         e.printStackTrace();
      }      

      // сортировка пузырьком
      for (int i = 0; i < size; i++) {
         for (int j = 0; j < size - i - 1; j++) {
            if (array[j] > array[j+1]){
               int temp = array[j+1];
               array[j+1] = array[j];
               array[j] = temp;
               write(array);
            }
         }
         log.info("Тестовове логирование");
         
      }
      System.out.print (Arrays.toString(array));
   }

   public static void write (int[] array){
      String file_arr = "bubble sorting.txt"; //даем имя файлу
      File file = new File(file_arr); // создаем объект ФАЙЛ с путем
      try {
         FileWriter writing = new FileWriter(file, true);
         writing.write(Arrays.toString(array));        
         writing.write("\n");
         writing.close();
         System.out.println("Great!");
      } catch (Exception e) {
         System.out.println("So sorry(((");
      }
   }
}
