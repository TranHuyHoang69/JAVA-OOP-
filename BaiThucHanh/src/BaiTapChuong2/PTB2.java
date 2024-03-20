package BaiTapChuong2;
import java.util.Scanner;
public class PTB2 {
    public static void main(String[] args) {
        double a,b,c,delta;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap he so a = ");
        a = sc.nextDouble();
        System.out.println("Nhap he so b = ");
        b = sc.nextDouble();
        System.out.println("Nhap he so c = ");
        c = sc.nextDouble();
        sc.close();
        if(a==0){
            if(b==0){
                if(c==0){
                    System.out.println("Phuong trinh co vo so nghiem");
                }else{
                    System.out.println("Phuong trinh vo nghiem");
                }
            }else{
                System.out.println("Phuong trinh co 1 nghiem x = "+ -c/b);
            }  
            return;
        }
        delta = b*b - 4*b*c;
        if(delta>0){
            System.out.println("Phuong trinh co 2 nghiem : x1 = "+ (-b+Math.sqrt(delta))/(2*a) +" va x2 = " + (-b-Math.sqrt(delta))/(2*a));
        }else{
            if(delta==0){
                System.out.println("Phuong trinh co nghiem kep x1 = x2 = "+ -b/(2*a));
            }else{
                System.out.println("Phuong trinh vo nghiem");
            }
        }
    sc.close();
    }
 }

