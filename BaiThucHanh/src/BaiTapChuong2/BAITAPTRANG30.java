package BaiTapChuong2;
import java.util.Scanner;
public class BAITAPTRANG30 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;
        int Sodu ;
        System.out.println("Nhap so nguyen duong");
        n = sc.nextInt();
        while(n>0){
            Sodu = n%10;
            n = n/10;
            sum = sum + Sodu;
        }
        System.out.println("Tong = " + sum );
        sc.close();
    }
}
