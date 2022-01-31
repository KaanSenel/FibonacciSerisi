import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner= new Scanner(System.in);
        System.out.print("Fibonacci serisinin hesaplanacak eleman sayısını giriniz : ");
        int sayi=scanner.nextInt();
        int firstValue=0;
        int secondValue=1;
        int a=0,b=1;
        int result=0;
        System.out.print(firstValue+" "+secondValue+" ");
        for (int i = 2; i < sayi; i++) {
            result=a+b;
            System.out.print(result+" ");
            a=b;
            b=result;
        }
    }
}
