import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите 1 число:");
        int numb1 = new Scanner(System.in).nextInt();
        System.out.println("Введите 2 число:");
        int numb2 = new Scanner(System.in).nextInt();
        int sum = numb1 + numb2;
        System.out.println("Cумма чисел равна:"   + sum);
        int ras = numb1 - numb2;
        System.out.println("Разность чисел равна:"   + ras);
        int pro = numb1*numb2;
        System.out.println("Произведение чисел равно:"   + pro);
        double cha = numb1/numb2;
        System.out.println("Частное чисел равно:"   + cha);


    }
}
