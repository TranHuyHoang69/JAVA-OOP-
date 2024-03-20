package BaiTapChuong2;
import java.util.Scanner;

public class BAITAPTRANG74{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Nhap so phan tu trong mang ");
             n = sc.nextInt();
        }while(n<0);
        int Arr[] = new int[n];
        System.out.println("Nhap cac phan tu trong mang ");
        for(int i=0;i<n;i++){
            System.out.println("Phan tu thu " + i + " : ");
                Arr[i]=sc.nextInt();
        }
        double sum = 0;
        for(int i=0;i<n;i++){
            if(Arr[i]%2==0){
                sum+=Arr[i];
            }
        }
        System.out.println("Tong cua mang tren = "+ sum);
        sc.close();
    }
}