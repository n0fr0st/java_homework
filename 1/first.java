import java.util.Scanner;

public class first {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваше число - ");
        int n = in.nextInt();
        int firstResult = 0;
        int secResult = 1;
        for (int i = 1; i <= n; i++) {
            firstResult = firstResult + i;
        }
        for (int i = 1; i <= n; i++) {
            secResult = secResult * i;
        }
        
        System.out.printf("треугольное число от %d = %d \n %d! = %d", n, firstResult, n, secResult);


    }
    
}