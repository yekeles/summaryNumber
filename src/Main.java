import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i, sum = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Sayı Giriniz : ");
            i = input.nextInt();
            //Dördün katları aynı zamanda ikinin katlarıdır.
            if  (i % 4 == 0) {
                sum += i;
            }
        } while (i % 2 == 0);
        System.out.print("Girilen değerlerden çift ve 4'ün katları olan sayıları toplamı : " + sum);
    }
}
