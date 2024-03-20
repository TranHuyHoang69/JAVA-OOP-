package BaiTapChuong2;
import java.util.Scanner;

public class PTB1 {
    public static void main(String[] args) {
         int a;
        int b;
        double x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a ");
        a = sc.nextInt();
        System.out.println("Nhap b ");
        b = sc.nextInt();
        System.out.println("Phuong trinh vua nhap la " + a +"x + " + b + " = 0");
        if(a==0){
            if(b==0){
                System.out.println("Phuong trinh co vo so nghiem");
            }else{
                System.out.println("phuong trinh vo nghiem");
            }
        }else{
            x = (double) -b/a;
            System.out.println("Phuong trinh co nghiem x =  " + x );
 sc.close();       
} 
}
}
