import java.util.Scanner;
import java.util.Arrays;

public class hw_23 {
   public static void main(String[] args) {
      /*
      * Напишите метод, который принимает на вход строку (String) и определяет является ли строка
      * палиндромом (возвращает boolean значение). Без встр. функций
      */
      Scanner scan = new Scanner(System.in);
      System.out.println("Введите строку: ");
      String str = scan.nextLine();
      
      char array[] = str.toCharArray();
      System.out.println(Arrays.toString(array));
      scan.close();
      int count = 0;
      boolean boo = true;
      for (int i = 0; i < array.length/2; i++) {
         if(array[i] == array[array.length - 1 - i])
            count++;
      }
      if(count == array.length/2)
         System.out.println(boo);
      else
         System.out.println(!boo);
      
   }

}

