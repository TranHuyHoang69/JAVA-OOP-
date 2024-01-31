import java.util.Scanner;

public class BAI8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu trong 1 day so nguyen : ");
        int n = sc.nextInt();
        int Arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Nhap phan tu thu "+i+" la : ");
            Arr[i]=sc.nextInt();
        }
        double sum =0;
        for(int i=0;i<n;i++){
            sum = sum + Arr[i];
        }
        sum = sum/n;
        System.out.println("Trung binh cong cua "+n+" so vua nhap la : "+sum);
        sc.close();

    }
}
