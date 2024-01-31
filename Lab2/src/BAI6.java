import java.util.Scanner;

public class BAI6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Nhap 1 so nguyen duong bat ky : ");
            n = sc.nextInt();
        }while(n<=0);
        double giaithua = 1;
        for(int i = n;i>1;i--){
            giaithua = giaithua * i;
        }
        System.out.println("Giai thua cua so vua nhap = "+giaithua);
        sc.close();
    }
}