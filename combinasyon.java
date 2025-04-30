import java.util.Scanner;

public class combinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("N Sayısını giriniz:");
        int n = input.nextInt();

        System.out.println("R Sayısını giriniz:");
        int r = input.nextInt();

        int fakN = 1;
        int fakR = 1;
        int fakNR = 1;

        // n! hesapla
        for (int i = 1; i <= n; i++) {
            fakN *= i;
        }

        // r! hesapla
        for (int i = 1; i <= r; i++) {
            fakR *= i;
        }

        // (n - r)! hesapla
        for (int i = 1; i <= (n - r); i++) {
            fakNR *= i;
        }

        // Kombinasyon formülü: C(n, r) = n! / (r! * (n - r)!)
        int kombinasyon = fakN / (fakR * fakNR);

        System.out.println("C(" + n + ", " + r + ") = " + kombinasyon);

        input.close();
    }
}
