// import java.util.logging.*;
import java.util.Arrays;
import java.util.Scanner;

public class hw_1 {
   public static void main(String[] args) {
      /*
       Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
результат после каждой итерации запишите в лог-файл.
       */
      int size = 3;
      Scanner in = new Scanner(System.in); // открытие сканера
      int[] array = new int[size]; // создание массива с "0"

      for (int i = 0; i < size; i++) { // заполнение массива с клавиатуры
         System.out.print("Введите число: ");
         array[i]  = in.nextInt();        
      }
   
      in.close(); //закрываем сканер
      System.out.print (Arrays.toString(array)); // Выводим на экран, полученный массив
      
      // сортировка пузырьком
      for (int i = 0; i < size; i++) {
         for (int j = 0; j < size - i - 1; j++) {
            if (array[j] > array[j+1]){
               int temp = array[j+1];
               array[j+1] = array[j];
               array[j] = temp;
            }
         }
      }
      System.out.print (Arrays.toString(array));
   }
}
