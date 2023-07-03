import java.util.Scanner;
public class third {
   public static void main(String[] args) {
      int num1;
      int num2;
      int res;
      char op;
      Scanner in = new Scanner(System.in);
      System.out.print("Введите 2 чила - ");
      num1 = in.nextInt();
      num2 = in.nextInt();
      System.out.print("\nВыберите процедуру (+, -, *, /) - ");
      op = in.next().charAt(0);
      switch(op) {
         case '+': res = num1 + num2;
            break;
         case '-': res = num1 - num2;
            break;
         case '*': res = num1 * num2;
            break;
         case '/': res = num1 / num2;
            break;
         default:  System.out.printf("Введите корректный символ процедуры - ");
            return;
      }
      System.out.print("\nРезультирующее уравнение\n");
      System.out.printf(num1 + " " + op + " " + num2 + " = " + res);
   }
}
