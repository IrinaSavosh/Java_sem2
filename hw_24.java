// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.io.Writer;
// import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.*;



public class hw_24 {
   public static void main(String[] args) {
      /*
       * 4*дополнительно. К калькулятору из предыдущего дз добавить логирование.
    1 + 3 = 4
       */
       
      System.out.print("Введите число: ");
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();

      System.out.print("Введите символ +, -, * или /: ");
      String symbol = in.next(); //toString();

      System.out.print("Введите число: ");
      int m = in.nextInt();

      result(n, symbol, m);
      in.close();
   }



   public static void result(int one, String symbol, int two){
      Logger logger = Logger.getLogger (hw_24.class.getName());
      // logger.setLevel(Level.INFO);
      ConsoleHandler ch = new ConsoleHandler();

      logger.addHandler(ch);
      SimpleFormatter sFormat = new SimpleFormatter();
      ch.setFormatter(sFormat);
   
      if(symbol.equals("+")){
         int sum = one + two;
         System.out.println(sum);
         logger.log(Level.WARNING, "Тестовое логирование 1");
         // logger.info("Тестовое логирование 2");
      }
      else if(symbol.equals("-")){
         System.out.println(one - two);
         logger.log(Level.WARNING, "Тестовое логирование 1");
         logger.info("Тестовое логирование 2");
      }
      else if(symbol.equals("*")){
         System.out.println(one * two);
         logger.log(Level.WARNING, "Тестовое логирование 1");
         logger.info("Тестовое логирование 2");
      }
      else if(symbol.equals("/")){
         if (one % two == 0){
            System.out.println(one / two);
            logger.log(Level.WARNING, "Тестовое логирование 1");
            logger.info("Тестовое логирование 2");
         }
         else{
            System.out.println((double)one / (double)two);
            logger.log(Level.WARNING, "Тестовое логирование 1");
            logger.info("Тестовое логирование 2");
         }         
      }
      else{
         System.out.println("ERROR");
         logger.info("Тестовое логирование 2");
      }
   }
}
