import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        System.out.print("Введите положительное число: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 1){
                    System.out.println(i);
                } else if (i%j == 0  && (j != 1 && j != i)){
                    break;
                } else if(i%j == 0 && j==1) {
                    continue;
                } else if(i%j == 0 && j==i){
                    System.out.println(i);
                }
                
            }
        }

    }
}

