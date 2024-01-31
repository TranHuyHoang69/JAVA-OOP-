import java.util.Scanner;

public class BAI1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so thu nhat ");
        double a = sc.nextInt();
        System.out.println("Nhap so thu 2 ");
        double b = sc.nextInt();
        System.out.println("Tong = "+(a+b));
        System.out.println("Hieu = "+ (a-b));
        System.out.println("Tich = "+a*b);
        System.out.println("Thuong = "+a/b);
        System.out.println("Chia lay du = "+a%b);
        if(a<b){
            System.out.println(" "+ a+" nho hon "+b);
        }else{
            if(a==b){
                System.out.println(" "+a+" bang "+b);
            }else{
                System.out.println(" "+a+" lon hon "+b);
            }
        }
        sc.close();
    }
}
     
