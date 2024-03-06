import java.util.Scanner;
public class BAITAPTRANG47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum=0;
        do{
            System.out.println("Nhap so nguyen duong ");
            n = sc.nextInt();
            sum = sum +n;
        }while(sum<100);
        System.out.println("Tong = "+sum);
        sc.close();
    }
}
